package Test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*��ʹ��List������³���
 ����һ��List����List �������������ˣ�������Ϣ���£�

 ���� 	���� 	����
 zhang3	18	3000
 li4	25	3500
 wang5	22	3200
 2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300
 3) ɾ��wang5 ����Ϣ
 4) ����for ѭ����������ӡList �����й��˵���Ϣ
 5) ���õ�����������List �����еĹ��˵���work ������
 */
public class Test2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		// ����һ��List����List ��������������
		Worker[] wokers = new Worker[3];
		wokers[0] = new Worker("����", 18, 3000.0);
		wokers[1] = new Worker("����", 25, 3500.0);
		wokers[2] = new Worker("����", 22, 3200.0);

		for (int i = 0; i < wokers.length; i++) {
			list.add(wokers[i]);
		}
		
		// 2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300
		Worker w6 = new Worker("����", 24, 3300.0);
		list.add(0, w6);
		
		 //3) ɾ��wang5 ����Ϣ
		list.remove(wokers[2]);

		// 4) ����for ѭ����������ӡList �����й��˵���Ϣ
		System.out.println("���� \t���� \t����");
		for (int i = 0; i < wokers.length; i++) {
			Worker w = (Worker) list.get(i);
			System.out.println(w.getName() + "\t" + w.getAge() + "\t"
					+ w.getSalary());
		}

		// 5) ���õ�����������List �����еĹ��˵���work ������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Worker itw = (Worker) it.next();
			itw.work();
		}

	}
}
