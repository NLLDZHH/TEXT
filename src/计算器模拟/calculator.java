package ������ģ��;

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
System.out.println("*****************�򵥼�����****************"); 
System.out.println("*\t\t\t\t\t*"); 
System.out.println("* ʹ��˵���� 1.�ӷ�  2.����  3.�˷�  4.����  5.����  6.ƽ��  * 7.�˳�"); 
System.out.println("*\t\t\t\t\t*"); 
System.out.println("*****************************************"); 
 
for(int i=0;i<100;i++){ 
System.out.print("\n��ѡ���������");
int num = input.nextInt();
if (num == 7) {
    break;
}

switch(num){ 
case 1: 
System.out.println("\n******��ѡ���˼ӷ�******\n"); 
System.out.print("�������1������:"); 
result = input.nextDouble(); 
System.out.print("�������2������:"); 
double jiashu2 = input.nextDouble(); 
Jsq test1=new Jsq();
System.out.println("������Ϊ:"+test1
		.add(jiashu2)); 
break; 

case 2: 
System.out.println("\n******��ѡ���˼���******\n"); 
System.out.print("�����뱻����:"); 
result = input.nextDouble(); 
System.out.print("���������:"); 
double jianshu2 = input.nextDouble();
Jsq test2 = new Jsq();
System.out.println("������Ϊ:" +test2.substract(jianshu2)); 
break;

case 3: 
System.out.println("\n******��ѡ���˳˷�******\n"); 
System.out.print("�������1������:"); 
result = input.nextDouble(); 
System.out.print("�������2������:"); 
double chengfa2 = input.nextDouble();
Jsq test3 = new Jsq();
System.out.println("������Ϊ:"+test3.muitiply(chengfa2)); 
break; 

case 4: 
System.out.println("\n******��ѡ���˳���******\n"); 
System.out.print("�����뱻����:"); 
result= input.nextDouble(); 
System.out.print("���������:"); 
double chufa2 = input.nextDouble();
Jsq test4 = new Jsq();
System.out.println("������Ϊ:"+test4.divide(chufa2));

case 5:
System.out.println("\n******��ѡ���˿���******\n");
System.out.print("�����뿪����");
result= input.nextDouble();
Jsq test5 = new Jsq();
System.out.println("������Ϊ:" +test5.sqrt(result));
break;

case 6:
System.out.println("\n******��ѡ����ƽ��******\n");
System.out.print("������ƽ����");
result = input.nextDouble();
Jsq test6 = new Jsq();
System.out.println("������Ϊ:" +test6.square(result));
break;

default: 
System.out.println("\n���ѡ���д�������ѡ��!"); 
break; 
}
} 
} 
}
