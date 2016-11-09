package com.lungcare.core.lungE.model;

import java.util.List;

public class CPDResult {
	 public List<double[]> Src;

     
     public List<double[]> Dst ;

     
     public double[][] CPDMatrix;

     
     public double CPDScale ;


	public List<double[]> getSrc() {
		return Src;
	}


	public void setSrc(List<double[]> src) {
		Src = src;
	}


	public List<double[]> getDst() {
		return Dst;
	}


	public void setDst(List<double[]> dst) {
		Dst = dst;
	}


	public double[][] getCPDMatrix() {
		return CPDMatrix;
	}


	public void setCPDMatrix(double[][] cPDMatrix) {
		CPDMatrix = cPDMatrix;
	}


	public double getCPDScale() {
		return CPDScale;
	}


	public void setCPDScale(double cPDScale) {
		CPDScale = cPDScale;
	}
     
     
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Matrix : ");
		stringBuilder.append("\n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				double ds = CPDMatrix[i][j];
				stringBuilder.append(ds);
				stringBuilder.append(" ");
				
			}
			
			stringBuilder.append("\n");
			
		}
		
		stringBuilder.append("CPDScale : ");
		stringBuilder.append("\n");
		stringBuilder.append(CPDScale);
		stringBuilder.append("\n");
		
		stringBuilder.append("Dst : ");
		stringBuilder.append("\n");
		for (int i = 0; i < Dst.size(); i++) {
			stringBuilder.append(Dst.get(i)[0]+" "+Dst.get(i)[1]+" "+Dst.get(i)[2]);
			stringBuilder.append("\n");
		}
		stringBuilder.append("\n");
		
		stringBuilder.append("Src : ");
		stringBuilder.append("\n");
		for (int i = 0; i < Src.size(); i++) {
			stringBuilder.append(Src.get(i)[0]+" "+Src.get(i)[1]+" "+Src.get(i)[2]);
			stringBuilder.append("\n");
		}
		stringBuilder.append("\n");
		return stringBuilder.toString();
	}
}
