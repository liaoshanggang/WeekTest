package Test1;

import java.util.ArrayList;
import java.util.List;

/*��һ������дһ��java�ɼ�ͳ�Ƴ�������һ�����java�ɼ�(�������ͷ���)
 ��ͳ�Ƴ�ƽ���֣���߷֡���ͷ֣�����ӡ�ɼ���,ʹ��ArrayList�����������
 �ɼ���������£�
 ����		����
 ����		78
 ����		90
 ����		100
 ����		60*/
public class TestArrayList {
	public static void main(String[] args) {
		List list = new ArrayList();
		Student[] stus = new Student[4];
		stus[0] = new Student("����", 78);
		stus[1] = new Student("����", 90);
		stus[2] = new Student("����", 100);
		stus[3] = new Student("����", 60);

		list.add(stus[0]);
		list.add(stus[1]);
		list.add(stus[2]);
		list.add(stus[3]);

		System.out.println("����\t����");
		double sum = 0;// ��¼�ܷ�
		double max = 0;
		double min = 100;
		for (Object obj : list) {
			Student stu = (Student) obj;
			System.out.println(stu.getName() + "\t" + stu.getScore());
			sum += stu.getScore();
			if (stu.getScore() > max) {
				max = stu.getScore();
			}
			if (stu.getScore() < min) {
				min = stu.getScore();
			}
		}
		System.out.println("��߷֣�" + max);
		System.out.println("��ͷ֣�" + min);

	}
}
