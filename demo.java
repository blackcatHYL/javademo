import java.util.Scanner;  //����������ǰ������ɨ����
public class demo{
	public static void main(String[] args){
  //Scanner input;����һ����ɨ���ǣ������ڴ�����һ���ռ䣩����ֵ in = new Snanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ա�");
		String sex = input.next();  //�ַ�������
		if(sex.equals("��")){
			System.out.println("������������䣺");
			int age=input.nextInt();    //������������
			if(age>=18) System.out.println("������");
			else System.out.println("��δ���갡");
		}
		else System.out.println("ԭ���Ǹ�Ů�İ�");
	}
}

