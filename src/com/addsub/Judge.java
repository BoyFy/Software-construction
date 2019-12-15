package com.addsub;


import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;


import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Judge {//�ж��Լ�д����ʽ������֮���Ƿ���ͬ
	private int correct=0;
	private int wrong=0;
	public void evaluate(ArrayList<String[]> answer,ArrayList<String[]> results) {
		int length=answer.get(0).length<results.get(0).length?answer.get(0).length:results.get(0).length;
		for (int i = 0; i < length; i++) {
			if(answer.get(0)[i].equals(results.get(0)[i]))
				correct++;
			else{
				wrong++;
			}
		}
		wrong+=Math.abs(answer.size()-results.size());
	}
	public ArrayList<String[]> getResult(String anExerciseFile) {//����ϰ�ļ�����ļ��л������
		ArrayList<String[]> SResults=new ArrayList<String[]>();
		   try {    
	            CsvReader creader = new CsvReader(anExerciseFile, ',', Charset.forName("GBK")); 
	            while(creader.readRecord()){	 
	    			SResults.add(creader.getValues());
	    		}
	        	creader.close();
	        } catch (Exception e) {    
	            e.printStackTrace();    
	        }    
		return SResults;
	}
	public void CheckResult() {//����Ļ����ʾ���Ľ�������ѽ��д��csv�ļ���
		System.out.println("��������:"+(correct+wrong));
		System.out.println("��ȷ����:"+correct);
		System.out.println("�������:"+wrong);
		try {
			String pathCSVWrite = "C:\\Checking.csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			csvWriter.write("��������:"+(correct+wrong));
			csvWriter.write("��ȷ����:"+correct);
			csvWriter.write("�������:"+wrong);
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
