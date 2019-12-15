package com.addsub;


import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;


import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Judge {//判断自己写的算式结果与答案之间是否相同
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
	public ArrayList<String[]> getResult(String anExerciseFile) {//从练习文件与答案文件中获得数据
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
	public void CheckResult() {//在屏幕上显示批改结果。并把结果写入csv文件中
		System.out.println("算数总数:"+(correct+wrong));
		System.out.println("正确个数:"+correct);
		System.out.println("错误个数:"+wrong);
		try {
			String pathCSVWrite = "C:\\Checking.csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			csvWriter.write("算数总数:"+(correct+wrong));
			csvWriter.write("正确个数:"+correct);
			csvWriter.write("错误个数:"+wrong);
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
