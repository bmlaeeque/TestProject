package com.provider.ws;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.provider.dto.TransactionsDetailsDTO;

@WebService(serviceName = "Gaurav")
public interface TransactionProvider {

	@WebMethod(operationName="getTransactionDetails")
	
	public List<TransactionsDetailsDTO> gettransactionDetails(int i);
}
