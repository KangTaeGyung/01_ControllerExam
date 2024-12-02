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
public class GalleryVO extends Criteria {
	private String uuid;           // 기본키
	private String galleryTitle;   // 제목
	private byte[] galleryData;    // 업로드파일
	private MultipartFile image;   // 내부적 사용(이미지)
	private String galleryFileUrl; // 다운로드 url
	
    public GalleryVO(String galleryTitle, byte[] galleryData) {
        this.galleryTitle = galleryTitle;
        this.galleryData = galleryData;
    }

    public GalleryVO(String uuid, String galleryTitle, byte[] galleryData) {
        this.uuid = uuid;
        this.galleryTitle = galleryTitle;
        this.galleryData = galleryData;
    }
}




