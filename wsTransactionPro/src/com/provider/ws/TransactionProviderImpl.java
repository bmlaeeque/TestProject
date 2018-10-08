package com.provider.ws;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import com.provider.dto.TransactionsDetailsDTO;
import com.provider.service.TransactionsProviderServiceImpl;

@WebService(endpointInterface="com.provider.ws.TransactionProvider")
public class TransactionProviderImpl implements TransactionProvider {

	@Override
	public List<TransactionsDetailsDTO> gettransactionDetails(int id)  {
			
		TransactionsProviderServiceImpl t=TransactionsProviderServiceImpl.getInstance();
		
		return t.gettransactionDetails(id);
	}

	
}
