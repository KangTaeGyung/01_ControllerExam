package egovframework.example.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.testdata.SampleBoard;
import egovframework.example.vo.BoardVO;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 게시판 DB CRUD 함수 정의 
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Repository
public class BoardMapper {

    @Autowired
    SampleBoard sampleBoard;

    //    모든 샘를 데이터 조회 함수
    public List<BoardVO> selectAll() {
        List<BoardVO> list = sampleBoard.getList();

        return list;
    }

    //    아이디로 조회하는 함수
    public BoardVO selectById(int id) {
        List<BoardVO> list = sampleBoard.getList();

        BoardVO resBoard = null;

//        id에 해당하는 값 찾기
        for (BoardVO board : list) {
            if(board.getId() == id) {
                resBoard = board;
            }
        }

        return resBoard;
    }

//    데이터를 저장하는 함수
    public List<BoardVO> insert(BoardVO board) {

        List<BoardVO> list = sampleBoard.getList();

        int count = selectAll().size(); // 전체 건수
        int newId = count + 1;
        board.setId(newId); // 새로운 번호 저장

        list.add(board);

        sampleBoard.setList(list);

        return sampleBoard.getList();
    }

//    데이터를 수정하는 함수
    public List<BoardVO> update(BoardVO board) {

        List<BoardVO> list = sampleBoard.getList();

        if(board.getId() != null) {
            //            수정
            for (BoardVO element : list) {
                if ((int)element.getId() == (int)board.getId()) {
                    element.setId(board.getId());
                    element.setTitle(board.getTitle());
                    element.setContent(board.getContent());
                    element.setUpdateTime(board.getUpdateTime());
                }
            }
        }

        return list;
    }

//  데이터를 삭제하는 함수
    public int deleteById(int id) {
        List<BoardVO> list = sampleBoard.getList();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return 1;
            }
        }

        return 0;
    }
}











