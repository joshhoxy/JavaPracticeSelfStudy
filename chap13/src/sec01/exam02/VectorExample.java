package sec01.exam02;

import java.util.*;

// Board 객체를 저장하는 Vector
public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			
			// ★ 리스트에 있는 엘레먼트 받아오기 위해서는 해당 엘레멘트를 메모르 스택에 올려줘야 하므로
			// 엘레멘트의 객체를 힙에 생성해서 list.get(i)에서 불러온 주소를 넣어주어 참조하게끔 함
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.writer + "\t" + board.content);
		}
		
	}
}
