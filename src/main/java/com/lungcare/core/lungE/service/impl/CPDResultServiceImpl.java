package com.lungcare.core.lungE.service.impl;

import com.lungcare.core.lungE.dao.CPDResultDAO;
import com.lungcare.core.lungE.dao.impl.CPDResultDAOImpl;
import com.lungcare.core.lungE.model.CPDResult;
import com.lungcare.core.lungE.service.CPDResultService;

public class CPDResultServiceImpl implements CPDResultService{
	CPDResultDAO cpdResultDAO;
	
	@Override
	public CPDResult LoadCPDResult() {
		// TODO Auto-generated method stub
		cpdResultDAO = new CPDResultDAOImpl();
		return cpdResultDAO.LoadCPDResult();
	}
	
	@Override
	public void SaveCPDResult(CPDResult cpdResult) {
		// TODO Auto-generated method stub
		cpdResultDAO = new CPDResultDAOImpl();
		cpdResultDAO.SaveCPDResult(cpdResult);
	}
}
