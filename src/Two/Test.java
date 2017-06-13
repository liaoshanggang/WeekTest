package Two;

import java.io.*;
/**
 * 二、IO流：将一个文本文件（D:\test.txt）的内容复制到E:\test.txt。
 *
 */
public class Test {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//读取文件
			fis = new FileInputStream("D:\\test.txt");
			//写入文件
			fos = new FileOutputStream("E:\\test.txt");
			byte[] b = new byte[512];
			int len = 0;
			//实现文件复制
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
