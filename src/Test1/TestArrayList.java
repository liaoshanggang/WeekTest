package Test1;

import java.util.ArrayList;
import java.util.List;

/*（一）、编写一个java成绩统计程序，输入一个班的java成绩(含姓名和分数)
 ，统计出平均分，最高分、最低分，并打印成绩单,使用ArrayList完成上述程序。
 成绩单结果如下：
 姓名		分数
 张三		78
 李四		90
 王五		100
 赵六		60*/
public class TestArrayList {
	public static void main(String[] args) {
		List list = new ArrayList();
		Student[] stus = new Student[4];
		stus[0] = new Student("张三", 78);
		stus[1] = new Student("李四", 90);
		stus[2] = new Student("王五", 100);
		stus[3] = new Student("赵六", 60);

		list.add(stus[0]);
		list.add(stus[1]);
		list.add(stus[2]);
		list.add(stus[3]);

		System.out.println("姓名\t分数");
		double sum = 0;// 记录总分
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
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);

	}
}
