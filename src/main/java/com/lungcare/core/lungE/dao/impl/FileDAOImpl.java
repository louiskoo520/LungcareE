package com.lungcare.core.lungE.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.lungcare.core.lungE.dao.FileDAO;

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
}
