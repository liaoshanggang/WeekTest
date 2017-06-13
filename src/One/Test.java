package One;
/**
 * 1）创建一个List，在List 中增加三个工人，基本信息如下：
姓名 	年龄 	工资
zhang3	 18 	3000
li4		 25 	3500
wang5 	 22 	3200

2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300

3) 删除wang5 的信息

4) 利用for 循环遍历，打印List 中所有工人的信息

5) 利用迭代遍历，对List 中所有的工人调用work 方法。

 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//创建对象
		Worker worker1 = new Worker("zhang3",18,3000);
		Worker worker2 = new Worker("li4",25,3500);
		Worker worker3 = new Worker("wang5",22,3200);
		//创建List集合
		List<Worker> list = new ArrayList<Worker>();
		list.add(worker1);
		list.add(worker2);
		list.add(worker3);
		
		list.add(1,new Worker("zhao6",24,3300)); //加入zhao6
		list.remove(3);   //删除wang5
		
		System.out.println("姓名"+"\t"+"年龄"+"\t"+"工资"); //打印输出
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//迭代遍历
		System.out.println();
		System.out.println("迭代遍历：");
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
