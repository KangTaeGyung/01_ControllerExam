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
	FileDbMapper fileDbMapper;

	@Override
	public List<?> selectFileDbList(Criteria searchVO) throws Exception {
		return fileDbMapper.selectFileDbList(searchVO);
	}
	
	@Override
	public int selectFileDbListTotCnt(Criteria searchVO) {
		return fileDbMapper.selectFileDbListTotCnt(searchVO);
	}
	
	@Override
	public void insert(FileDbVO fileDbVO) throws Exception {
		    String newUuid = UUID.randomUUID().toString(); 
		    String fileDownloadURL = generateDownloadUrl(newUuid);
		    fileDbVO.setUuid(newUuid);
		    fileDbVO.setFileUrl(fileDownloadURL);
		    
		    fileDbMapper.insert(fileDbVO);
	}
	
	public String generateDownloadUrl(String uuid) {
        return ServletUriComponentsBuilder      
          .fromCurrentContextPath()             
          .path("/advanced/fileDb/download.do") 
          .query("uuid="+uuid)                  
          .toUriString();                       
	}
	
	@Override
	public FileDbVO selectFileDb(String uuid) throws Exception {
		FileDbVO fileDbVO = fileDbMapper.selectFileDb(uuid);
		return fileDbVO;
	}
	
	@Override
	public void delete(String uuid) throws Exception {
		fileDbMapper.delete(uuid);
	}
}

