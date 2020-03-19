package sec01.exam02;

import java.util.*;

// Board ��ü�� �����ϴ� Vector
public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			
			// �� ����Ʈ�� �ִ� ������Ʈ �޾ƿ��� ���ؼ��� �ش� ������Ʈ�� �޸� ���ÿ� �÷���� �ϹǷ�
			// ������Ʈ�� ��ü�� ���� �����ؼ� list.get(i)���� �ҷ��� �ּҸ� �־��־� �����ϰԲ� ��
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.writer + "\t" + board.content);
		}
		
	}
}
