package egovframework.example.testdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import egovframework.example.vo.BoardVO;
import lombok.Getter;
import lombok.Setter;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 게시판 DB
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Component
@Getter
@Setter
public class SampleBoard {
    List<BoardVO> list = new ArrayList<BoardVO>();

    public SampleBoard() {

        int iCount = 1;

        BoardVO board = BoardVO.builder()
                .id(iCount)
                .title("제목")
                .content("내용")
                .build();

        list.add(board);

        board = BoardVO.builder()
                .id(++iCount)
                .title("제목2")
                .content("내용2")
                .build();

        list.add(board);

        board = BoardVO.builder()
                .id(++iCount)
                .title("제목3")
                .content("내용3")
                .build();

        list.add(board);

        board = BoardVO.builder()
                .id(++iCount)
                .title("제목4")
                .content("내용4")
                .build();

        list.add(board);

        board = BoardVO.builder()
                .id(++iCount)
                .title("제목5")
                .content("내용5")
                .build();

        list.add(board);
    }
}
