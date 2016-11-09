package com.lungcare.core.lungE.dao.impl;


import java.util.ArrayList;
import java.util.Iterator;

import com.lungcare.core.lungE.dao.CPDResultDAO;
import com.lungcare.core.lungE.dao.FileDAO;
import com.lungcare.core.lungE.model.CPDResult;

public class CPDResultDAOImpl implements CPDResultDAO{
	
	static final String rotationFile = "c://temp//rotation.txt";
	static final String translationFile = "c://temp//translation.txt";
	static final String scaleFile = "c://temp//scale.txt";
	static final String xfile = "c://temp//x.txt";
	static final String yfile = "c://temp//y.txt";

	static final String rotationManualDir = "c://ManualENB";
	static final String rotationManualFile = "c://ManualENB//rotation.txt";
	static final String translationManualFile = "c://ManualENB//translation.txt";
	static final String scaleManualFile = "c://ManualENB//scale.txt";
	static final String xManualfile = "c://ManualENB//x.txt";
	static final String yManualfile = "c://ManualENB//y.txt";
	
   @Override
	public CPDResult LoadCPDResult() {
		// TODO Auto-generated method stub
	   CPDResult cpdResult = new CPDResult();
	   cpdResult.CPDMatrix = new double[4][4];
	   cpdResult.Dst = new ArrayList<double[]>();
	   cpdResult.Src = new ArrayList<double[]>();
		FileDAO fileDAO = new FileDAOImpl();
		String rotateStr = fileDAO.ReadFile(rotationFile);
		rotateStr = rotateStr.replace('\t', ' ');
		String[] rotateContent = rotateStr.split(" ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String string = rotateContent[i*3+j];
				cpdResult.CPDMatrix[i][j] = Double.parseDouble(string);
			}
		}
		
		String scale = fileDAO.ReadFile(scaleFile);
		cpdResult.CPDScale = Double.parseDouble(scale);
		
		ArrayList<String>  translateContent = fileDAO.ReadFileLine(translationFile);
		cpdResult.CPDMatrix[0][3] = Double.parseDouble(translateContent.get(0));
		cpdResult.CPDMatrix[1][3] = Double.parseDouble(translateContent.get(1));
		cpdResult.CPDMatrix[2][3] = Double.parseDouble(translateContent.get(2));
		cpdResult.CPDMatrix[3][3] = 1;
		
		ArrayList<String> xString = fileDAO.ReadFileLine(xfile);
		for (int i = 0; i < xString.size(); i++) {
			String line = xString.get(i);
			String[] content = line.split(" ");
			double[] value = new double[]{Double.parseDouble(content[0]) ,Double.parseDouble(content[1]) ,Double.parseDouble(content[2])};
			cpdResult.Dst.add(value);
			
		}
		
		ArrayList<String> yString = fileDAO.ReadFileLine(yfile);
		for (int i = 0; i < yString.size(); i++) {
			String line = yString.get(i);
			String[] content = line.split(" ");
			double[] value = new double[]{Double.parseDouble(content[0]) ,Double.parseDouble(content[1]) ,Double.parseDouble(content[2])};
			cpdResult.Src.add(value);
			
		}
		
		
		return cpdResult;
		
		
		
	}
	   
   @Override
	public void SaveCPDResult(CPDResult cpdResult) {
		// TODO Auto-generated method stub
		FileDAO fileDAO = new FileDAOImpl();
		fileDAO.WriteMatrix(cpdResult.CPDMatrix, rotationManualFile);
	}
}
