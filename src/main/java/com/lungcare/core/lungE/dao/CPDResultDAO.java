package com.lungcare.core.lungE.dao;

import com.lungcare.core.lungE.model.CPDResult;

public interface CPDResultDAO {
	public CPDResult LoadCPDResult();
	public void SaveCPDResult(CPDResult cpdResult);
}
