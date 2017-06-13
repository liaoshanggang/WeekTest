package Test4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*完成下列要求：
1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
课程安排。
2） 增加了一位新老师Allen 教JDBC
3） Lucy 改为教CoreJava   put方法
4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key))
5） 利用Map，输出所有教JSP 的老师。
6)	修改上述代码使用泛型实现*/
public class Test4 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		//1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述课程安排。
		Teacher[] teas = new Teacher[7];
		teas[0] = new Teacher("Tom", "CoreJava");
		teas[1] = new Teacher("John", "Oracle");
		teas[2] = new Teacher("Susan", "Oracle");
		teas[3] = new Teacher("Jerry", "JDBC");
		teas[4] = new Teacher("Jim", "Unix");
		teas[5] = new Teacher("Kevin", "JSP");
		teas[6] = new Teacher("Lucy", "JSP");
		
		for (int i = 0; i < teas.length; i++) {
			map.put(teas[i].getName(), teas[i].getCourse());
		}
		
		//2） 增加了一位新老师Allen 教JDBC
		Teacher t = new Teacher("Allen","JDBC");
		map.put(t.getName(), t.getCourse());
		//3） Lucy 改为教CoreJava
		map.put("Lucy", "CoreJava");
		
		//4）输出所有的老师及老师教授的课程
		System.out.println("某学校的教学课程内容安排如下:");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());	
		}
		
		//5） 利用Map，输出所有教JSP 的老师。
		System.out.println("所有教JSP 的老师为：");
		for (Object o : map.keySet()) {
			if(map.get(o).equals("JSP")){
				System.out.println(o);
			}
		}
	}
}
