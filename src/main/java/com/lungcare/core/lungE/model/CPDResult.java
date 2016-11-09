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
     
     
}
