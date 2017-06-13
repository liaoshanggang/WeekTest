package Test4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*�������Ҫ��
1�� ʹ��һ��Map������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ����ʾ����
�γ̰��š�
2�� ������һλ����ʦAllen ��JDBC
3�� Lucy ��Ϊ��CoreJava   put����
4�� ����Map��������е���ʦ����ʦ���ڵĿγ�(Set<Map.Entry<String,String>>��Set<String> get(key))
5�� ����Map��������н�JSP ����ʦ��
6)	�޸���������ʹ�÷���ʵ��*/
public class Test4 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		//1�� ʹ��һ��Map������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ����ʾ�����γ̰��š�
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
		
		//2�� ������һλ����ʦAllen ��JDBC
		Teacher t = new Teacher("Allen","JDBC");
		map.put(t.getName(), t.getCourse());
		//3�� Lucy ��Ϊ��CoreJava
		map.put("Lucy", "CoreJava");
		
		//4��������е���ʦ����ʦ���ڵĿγ�
		System.out.println("ĳѧУ�Ľ�ѧ�γ����ݰ�������:");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());	
		}
		
		//5�� ����Map��������н�JSP ����ʦ��
		System.out.println("���н�JSP ����ʦΪ��");
		for (Object o : map.keySet()) {
			if(map.get(o).equals("JSP")){
				System.out.println(o);
			}
		}
	}
}
