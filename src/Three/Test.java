package Three;
/**
 * ����ʹ��ѡ�����������int[] num = {9,3,7,1,5,4}�����������
 *
 */
public class Test {
	public static void main(String[] args) {
		int[] num = {9,3,7,1,5,4};
		//����						
		for (int i = 0; i < num.length-1; i++) {
			int j = i;
			for (int k = i; k< num.length; k++) {
				if(num[j]>num[k]){
					j=k;
				}
			}
			if(j != i){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				
			}			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
