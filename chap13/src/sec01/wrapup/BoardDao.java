package sec01.wrapup;

import java.util.*;

public class BoardDao {

	private List<Board> list = new ArrayList<Board>();
	
	
	public List<Board> getBoardList() {

		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		
		return list;
	}	

}

