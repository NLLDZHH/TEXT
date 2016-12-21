package 计算器模拟;

import java.util.*;
class Jsq {
    protected static double result;
   
	public double add (double n){
	  result = result + n;
	  return result;
    }
    public double substract(double n){
      result = result - n;
      return result;
    }  
    public double muitiply(double n){
      result = result * n;
      return result;
    }
    public double divide(double n){
       result = result/n; 
       return result;
    }
   
    public double sqrt(double n){
    	result = Math.sqrt(n);
    	return result;
    } 
    public double square(double n){
    	result = n*n;
    	return result;
    }
    public double getResult(){
    	return result;
    	
    }
   
  
}   





public class calculator extends Jsq { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.println("*****************简单计算器****************"); 
System.out.println("*\t\t\t\t\t*"); 
System.out.println("* 使用说明： 1.加法  2.减法  3.乘法  4.除法  5.开方  6.平方  * 7.退出"); 
System.out.println("*\t\t\t\t\t*"); 
System.out.println("*****************************************"); 
 
for(int i=0;i<100;i++){ 
System.out.print("\n请选择运算规则：");
int num = input.nextInt();
if (num == 7) {
    break;
}

switch(num){ 
case 1: 
System.out.println("\n******你选择了加法******\n"); 
System.out.print("请输入第1个加数:"); 
result = input.nextDouble(); 
System.out.print("请输入第2个加数:"); 
double jiashu2 = input.nextDouble(); 
Jsq test1=new Jsq();
System.out.println("运算结果为:"+test1
		.add(jiashu2)); 
break; 

case 2: 
System.out.println("\n******你选择了减法******\n"); 
System.out.print("请输入被减数:"); 
result = input.nextDouble(); 
System.out.print("请输入减数:"); 
double jianshu2 = input.nextDouble();
Jsq test2 = new Jsq();
System.out.println("运算结果为:" +test2.substract(jianshu2)); 
break;

case 3: 
System.out.println("\n******你选择了乘法******\n"); 
System.out.print("请输入第1个因数:"); 
result = input.nextDouble(); 
System.out.print("请输入第2个因数:"); 
double chengfa2 = input.nextDouble();
Jsq test3 = new Jsq();
System.out.println("运算结果为:"+test3.muitiply(chengfa2)); 
break; 

case 4: 
System.out.println("\n******你选择了除法******\n"); 
System.out.print("请输入被除数:"); 
result= input.nextDouble(); 
System.out.print("请输入除数:"); 
double chufa2 = input.nextDouble();
Jsq test4 = new Jsq();
System.out.println("运算结果为:"+test4.divide(chufa2));

case 5:
System.out.println("\n******你选择了开方******\n");
System.out.print("请输入开方数");
result= input.nextDouble();
Jsq test5 = new Jsq();
System.out.println("运算结果为:" +test5.sqrt(result));
break;

case 6:
System.out.println("\n******你选择了平方******\n");
System.out.print("请输入平方数");
result = input.nextDouble();
Jsq test6 = new Jsq();
System.out.println("运算结果为:" +test6.square(result));
break;

default: 
System.out.println("\n你的选择有错，请重新选择!"); 
break; 
}
} 
} 
}
