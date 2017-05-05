import java.util.Scanner;  //放在类声明前，引入扫描仪
public class demo{
	public static void main(String[] args){
  //Scanner input;声明一个新扫描仪（即向内存申请一个空间）；赋值 in = new Snanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的性别：");
		String sex = input.next();  //字符串输入
		if(sex.equals("男")){
			System.out.println("请输入你的年龄：");
			int age=input.nextInt();    //整型数据输入
			if(age>=18) System.out.println("成年了");
			else System.out.println("还未成年啊");
		}
		else System.out.println("原来是个女的啊");
	}
}

