package com.addsub;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BinaryOperation_1 {
	static String[] Formula=new String[50];            //用来存放生成的算式
	static int[] result=new int[50];                   //用来存放算式生成的结果
	static Set<Object> set=new HashSet<Object>();      //定义set集合用来判定是否有重复的数组
	public static void printHeader() {                 //打印函数，简单说明这个程序的用处
		System.out.println("------------------------------------");
		System.out.println("这个程序会输出50道100以内的加减法");
		System.out.println("每次运行可以得到新的习题与答案");
		System.out.println("------------------------------------");
	}
	public static void generateEquations() {          //生成50个算式
		int left_operand,right_operand,flag=0;        //flag为1为加法，flag为0时为减法
		char operator;                                //operator用来表示加减法符号
		Random random=new Random();
		for(int i=0;i<50;i++) {
			left_operand=random.nextInt(101);                                
			right_operand=random.nextInt(101);
			flag=random.nextInt(2); 
			if(flag==1) {           //flag为1时，将是加法，如果为0时，将是减法。           
				operator='+';
				/*
				 * 如果随机生成的数相加的值小于100时，将这个算式放在Formula数组中，将结果放在result数组中，
				 * 如果大于100的话，那么去掉这次的随机数，让i减1，然后在下次循环中重新开始取随机数。
				 */
				if(left_operand+right_operand<100) {                          
					result[i]=left_operand+right_operand;                     
					Formula[i]=""+left_operand+operator+right_operand+"=";
					/*
					 * 因为set数组中不会有重复的元素，所以把数组中的每次生成的元素放进去，如果有重复的则不会放进去，
					 * 如果当前set元素的个数不等于数组中元素的个数，那么说明当前的的元素与前面的有重复，那么便去掉这次结果
					 *  ，让i减1，然后在下次循环中重新开始取随机数
					 */
					set.add(Formula[i]);   
					if(set.size()!=i+1) {                                     
						i--;                                                  
					}
				}
				else{
					i--;
				}
			}
			else {
				operator='-';
				/*
				 * 如果随机生成的数相减的值大于0时，将这个算式放在Formula数组中，将结果放在result数组中，
				 * 如果相减的值小于0，那么去掉这次的随机数，让i减1，然后在下次循环中重新开始取随机数
				 */
				if(left_operand-right_operand>0) {                            
					result[i]=left_operand-right_operand;                     
					Formula[i]=""+left_operand+operator+right_operand+"=";
					set.add(Formula[i]);                                      
					if(set.size()!=i+1) {
						i--;
					}
				}
				else {
					i--;
				}
			}
		}
	}
	public static void printExercise() {           //打印出在数组中存放的算式
		for(int i=0;i<50;i++) {
			System.out.print((i+1)+":"+" "+Formula[i]+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	public static void printCalculations() {       //打印出算式的结果
		for(int i=0;i<50;i++) {
			System.out.print((i+1)+":"+" "+result[i]+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		printHeader();                           //简单说明程序作用
		generateEquations();                     //开始随机生成50个算式
		System.out.println("下面是50道习题：");
		printExercise();                         //打印出算式
		System.out.println("----------------------------");
		System.out.println("下面是习题的答案");
		System.out.println("----------------------------");
		printCalculations();                     //打印出算式结果
	} 
}
