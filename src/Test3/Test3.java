package Test3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*（三）、使用（Set，Comparable 接口）在上一题中的Worker 类基础上，按照年龄大小进行排序
 */
public class Test3 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		Worker[] wokers = new Worker[3];
		wokers[0] = new Worker("张三", 18, 3000.0);
		wokers[1] = new Worker("李四", 25, 3500.0);
		wokers[2] = new Worker("王五", 22, 3200.0);

		for (int i = 0; i < wokers.length; i++) {
			set.add(wokers[i]);
		}
		
		System.out.println("姓名 \t年龄 \t工资");
		Iterator it = set.iterator();
		while (it.hasNext()) {			
			System.out.println(it.next());
		}
	}
}
