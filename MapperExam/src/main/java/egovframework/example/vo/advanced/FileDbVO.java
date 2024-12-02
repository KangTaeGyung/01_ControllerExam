package egovframework.example.vo.advanced;

import org.springframework.web.multipart.MultipartFile;

import egovframework.example.vo.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class FileDbVO extends Criteria {
	private String uuid;            // 기본키
	private String fileTitle;       // 제목	
	private String fileContent;     // 내용	
	private byte[] fileData;        // 이미지파일	
	private MultipartFile image;    // 내부적 사용(이미지파일)	
	private String fileUrl;         // 다운로드 url(클릭:이미지 다운로드됨)	

	public FileDbVO(String uuid, String fileTitle, String fileContent, byte[] fileData) {
		this.uuid = uuid;
		this.fileTitle = fileTitle;
		this.fileContent = fileContent;
		this.fileData = fileData;
	}
	
	public FileDbVO(String fileTitle, String fileContent, byte[] fileData) {
		this.fileTitle = fileTitle;
		this.fileContent = fileContent;
		this.fileData = fileData;
	}
}



