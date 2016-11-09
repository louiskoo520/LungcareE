package com.lungcare.core.lungE.dao;

import java.util.ArrayList;

public interface FileDAO {
   public String ReadFile(String filePath);
   public ArrayList<String> ReadFileLine(String filePath);
   
   public void WriteMatrix(double[][] matrix , String fileName);
}
