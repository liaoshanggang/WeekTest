package Two;

import java.io.*;
/**
 * ����IO������һ���ı��ļ���D:\test.txt�������ݸ��Ƶ�E:\test.txt��
 *
 */
public class Test {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//��ȡ�ļ�
			fis = new FileInputStream("D:\\test.txt");
			//д���ļ�
			fos = new FileOutputStream("E:\\test.txt");
			byte[] b = new byte[512];
			int len = 0;
			//ʵ���ļ�����
			while((len = fis.read(b)) != -1){
				fos.write(b,0,len);
				fos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
