package com.provider.service;

import java.sql.SQLException;
import java.util.List;

import com.provider.dao.TransactionsProviderDAOImpl;
import com.provider.dto.TransactionsDetailsDTO;

public class TransactionsProviderServiceImpl {
	
	static  TransactionsProviderServiceImpl INSTANCE = null;

	public static synchronized TransactionsProviderServiceImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TransactionsProviderServiceImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	public List<TransactionsDetailsDTO> gettransactionDetails(int i) {
		
		TransactionsProviderDAOImpl	tt=TransactionsProviderDAOImpl.getInstance();
		
		return tt.gettransactionDetails(i);
		
		
	}
	

}
