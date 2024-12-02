/**
 * 
 */
package egovframework.example.service.impl.advanced;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import egovframework.example.mapper.advanced.FileDbMapper;
import egovframework.example.service.advanced.FileDbService;
import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.common.Criteria;

@Service
public class FileDbServiceImpl implements FileDbService {

	@Autowired
	FileDbMapper fileDbMapper;  // 매퍼 객체

//	전체조회 : source
	@Override
	public List<?> selectFileDbList(Criteria searchVO) throws Exception {
		// TODO 역할 : fileDbMapper 의 전체조회 함수 실행 , 업무로직 추가(생략)
		return fileDbMapper.selectFileDbList(searchVO);
	}
	
//	총개수 : source
	@Override
	public int selectFileDbListTotCnt(Criteria searchVO) {
		// TODO 역할 : fileDbMapper 의 총개수 함수 실행 , 업무로직 추가(생략)
		return fileDbMapper.selectFileDbListTotCnt(searchVO);
	}
	
//	insert : source - Over...
	@Override
	public void insertFileDb(FileDbVO fileDbVO) throws Exception {
		// TODO 역할 : fileDbMapper 의 insert 함수 실행 , 
		// 업무로직 추가 : 
//		   1) 기본키 자동생성 : 자바의 UUID 만들기(유일한 문자) -> 첨부파일이름 사용
		    String newUuid = UUID.randomUUID().toString(); // 새 uuid
		    
//		   2) 첨부파일 다운로드 받기 위해 ? : 다운로드 url 
//		      => http://localhost:8000/advanced/fileDb/첨부파일명(uuid) [1]
		    String fileDownloadURL = generateDownloadUrl(newUuid);
		    
//		   3) fileDbVO 객체에 위의 값을 수정하기
		    fileDbVO.setUuid(newUuid);
		    fileDbVO.setFileUrl(fileDownloadURL);
//		   4) fileDbMapper 의 insert 실행
		    fileDbMapper.insert(fileDbVO);
	}
	
//	첨부파일 다운로드 url 자동 생성 해주는 함수
	public String generateDownloadUrl(String uuid) {
        return ServletUriComponentsBuilder // url 만들어 주는 자바 객체
          .fromCurrentContextPath()  // spring 기본주소 제공 : http://localhost:8000
          .path("/advanced/fileDb/") // /advanced/fileDb
          .path(uuid)                // /uuid
          .toUriString();            // 위의 것을 모두 조합 : [1] url 완성됨
	}
	
//	상세조회 : source
	@Override
	public FileDbVO selectFileDb(String uuid) throws Exception {
		// TODO 역할 : fileDbMapper 의 상세조회 함수 실행
		FileDbVO fileDbVO = fileDbMapper.selectFileDb(uuid);
		return fileDbVO;
	}
	
	// delete : source
	@Override
	public void deleteFileDb(String uuid) throws Exception {
		// TODO 역할 : fileDbMapper 의 delete 함수 실행
		fileDbMapper.delete(uuid);
	}
}






