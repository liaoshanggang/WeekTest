package One;
/**
 * 1������һ��List����List �������������ˣ�������Ϣ���£�
���� 	���� 	����
zhang3	 18 	3000
li4		 25 	3500
wang5 	 22 	3200

2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300

3) ɾ��wang5 ����Ϣ

4) ����for ѭ����������ӡList �����й��˵���Ϣ

5) ���õ�����������List �����еĹ��˵���work ������

 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//��������
		Worker worker1 = new Worker("zhang3",18,3000);
		Worker worker2 = new Worker("li4",25,3500);
		Worker worker3 = new Worker("wang5",22,3200);
		//����List����
		List<Worker> list = new ArrayList<Worker>();
		list.add(worker1);
		list.add(worker2);
		list.add(worker3);
		
		list.add(1,new Worker("zhao6",24,3300)); //����zhao6
		list.remove(3);   //ɾ��wang5
		
		System.out.println("����"+"\t"+"����"+"\t"+"����"); //��ӡ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//��������
		System.out.println();
		System.out.println("����������");
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
