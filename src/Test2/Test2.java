package Test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*、使用List完成以下程序
 创建一个List，在List 中增加三个工人，基本信息如下：

 姓名 	年龄 	工资
 zhang3	18	3000
 li4	25	3500
 wang5	22	3200
 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
 3) 删除wang5 的信息
 4) 利用for 循环遍历，打印List 中所有工人的信息
 5) 利用迭代遍历，对List 中所有的工人调用work 方法。
 */
public class Test2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		// 创建一个List，在List 中增加三个工人
		Worker[] wokers = new Worker[3];
		wokers[0] = new Worker("张三", 18, 3000.0);
		wokers[1] = new Worker("李四", 25, 3500.0);
		wokers[2] = new Worker("王五", 22, 3200.0);

		for (int i = 0; i < wokers.length; i++) {
			list.add(wokers[i]);
		}
		
		// 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
		Worker w6 = new Worker("赵六", 24, 3300.0);
		list.add(0, w6);
		
		 //3) 删除wang5 的信息
		list.remove(wokers[2]);

		// 4) 利用for 循环遍历，打印List 中所有工人的信息
		System.out.println("姓名 \t年龄 \t工资");
		for (int i = 0; i < wokers.length; i++) {
			Worker w = (Worker) list.get(i);
			System.out.println(w.getName() + "\t" + w.getAge() + "\t"
					+ w.getSalary());
		}

		// 5) 利用迭代遍历，对List 中所有的工人调用work 方法。
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Worker itw = (Worker) it.next();
			itw.work();
		}

	}
}
