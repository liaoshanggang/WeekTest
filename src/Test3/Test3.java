package Test3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*��������ʹ�ã�Set��Comparable �ӿڣ�����һ���е�Worker ������ϣ����������С��������
 */
public class Test3 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		Worker[] wokers = new Worker[3];
		wokers[0] = new Worker("����", 18, 3000.0);
		wokers[1] = new Worker("����", 25, 3500.0);
		wokers[2] = new Worker("����", 22, 3200.0);

		for (int i = 0; i < wokers.length; i++) {
			set.add(wokers[i]);
		}
		
		System.out.println("���� \t���� \t����");
		Iterator it = set.iterator();
		while (it.hasNext()) {			
			System.out.println(it.next());
		}
	}
}
