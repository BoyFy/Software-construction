package com.addsub;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BinaryOperation_1 {
	static String[] Formula=new String[50];            //����������ɵ���ʽ
	static int[] result=new int[50];                   //���������ʽ���ɵĽ��
	static Set<Object> set=new HashSet<Object>();      //����set���������ж��Ƿ����ظ�������
	public static void printHeader() {                 //��ӡ��������˵�����������ô�
		System.out.println("------------------------------------");
		System.out.println("�����������50��100���ڵļӼ���");
		System.out.println("ÿ�����п��Եõ��µ�ϰ�����");
		System.out.println("------------------------------------");
	}
	public static void generateEquations() {          //����50����ʽ
		int left_operand,right_operand,flag=0;        //flagΪ1Ϊ�ӷ���flagΪ0ʱΪ����
		char operator;                                //operator������ʾ�Ӽ�������
		Random random=new Random();
		for(int i=0;i<50;i++) {
			left_operand=random.nextInt(101);                                
			right_operand=random.nextInt(101);
			flag=random.nextInt(2); 
			if(flag==1) {           //flagΪ1ʱ�����Ǽӷ������Ϊ0ʱ�����Ǽ�����           
				operator='+';
				/*
				 * ���������ɵ�����ӵ�ֵС��100ʱ���������ʽ����Formula�����У����������result�����У�
				 * �������100�Ļ�����ôȥ����ε����������i��1��Ȼ�����´�ѭ�������¿�ʼȡ�������
				 */
				if(left_operand+right_operand<100) {                          
					result[i]=left_operand+right_operand;                     
					Formula[i]=""+left_operand+operator+right_operand+"=";
					/*
					 * ��Ϊset�����в������ظ���Ԫ�أ����԰������е�ÿ�����ɵ�Ԫ�طŽ�ȥ��������ظ����򲻻�Ž�ȥ��
					 * �����ǰsetԪ�صĸ���������������Ԫ�صĸ�������ô˵����ǰ�ĵ�Ԫ����ǰ������ظ�����ô��ȥ����ν��
					 *  ����i��1��Ȼ�����´�ѭ�������¿�ʼȡ�����
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
				 * ���������ɵ��������ֵ����0ʱ���������ʽ����Formula�����У����������result�����У�
				 * ��������ֵС��0����ôȥ����ε����������i��1��Ȼ�����´�ѭ�������¿�ʼȡ�����
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
	public static void printExercise() {           //��ӡ���������д�ŵ���ʽ
		for(int i=0;i<50;i++) {
			System.out.print((i+1)+":"+" "+Formula[i]+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	public static void printCalculations() {       //��ӡ����ʽ�Ľ��
		for(int i=0;i<50;i++) {
			System.out.print((i+1)+":"+" "+result[i]+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		printHeader();                           //��˵����������
		generateEquations();                     //��ʼ�������50����ʽ
		System.out.println("������50��ϰ�⣺");
		printExercise();                         //��ӡ����ʽ
		System.out.println("----------------------------");
		System.out.println("������ϰ��Ĵ�");
		System.out.println("----------------------------");
		printCalculations();                     //��ӡ����ʽ���
	} 
}
