package com.lungcare.core.lungE.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.lungcare.core.lungE.dao.FileDAO;
import com.sun.jersey.core.util.FeaturesAndProperties;

public class FileDAOImpl implements FileDAO{
	@Override
	public String ReadFile(String filePath) {
		// TODO Auto-generated method stub
		
		 try {
             String encoding="GBK";
             File file=new File(filePath);
             StringBuilder stringBuilder  = new StringBuilder();
             if(file.isFile() && file.exists()){ //判断文件是否存在
                 InputStreamReader read = new InputStreamReader(
                 new FileInputStream(file),encoding);//考虑到编码格式
                 BufferedReader bufferedReader = new BufferedReader(read);
                 String lineTxt = null;
                 while((lineTxt = bufferedReader.readLine()) != null){
                     System.out.println(lineTxt);
                     stringBuilder.append(lineTxt);
                 }
                 read.close();
                 
                 return stringBuilder.toString();
		     }else{
		         System.out.println("找不到指定的文件");
		         return null;
		     }
		     } 
		     catch (Exception e) {
		         System.out.println("读取文件内容出错");
		         e.printStackTrace();
		         return null;
		     }
		}
	
	
	@Override
	public ArrayList<String> ReadFileLine(String filePath) {
		// TODO Auto-generated method stub
		 try {
             String encoding="GBK";
             File file=new File(filePath);
             ArrayList<String> list = new ArrayList<String>();
             if(file.isFile() && file.exists()){ //判断文件是否存在
                 InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                
                 BufferedReader bufferedReader = new BufferedReader(read);
                 String lineTxt = null;
                 while((lineTxt = bufferedReader.readLine()) != null){
                     System.out.println(lineTxt);
                     list.add(lineTxt);
                 }
                 read.close();
                 
                 return list;
                 
		     }else{
		         System.out.println("找不到指定的文件");
		         return null;
		     }
		     } 
		     catch (Exception e) {
		         System.out.println("读取文件内容出错");
		         e.printStackTrace();
		         return null;
		     }
		
	}
	
	
	@Override
	public void WriteMatrix(double[][] matrix, String fileName) {
		// TODO Auto-generated method stub
		File file = new File(fileName);
		if(!file.isDirectory())
		{
			file.mkdir();
		}
		
		FileOutputStream fs = null;
		StringBuilder stringBuilder = new StringBuilder();
		try {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					double ds = matrix[i][j];
					stringBuilder.append(ds+" ");
				}
				stringBuilder.append("\n");
			}
			
			fs.write(stringBuilder.toString().getBytes("GBK"));
			fs.close();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
}
