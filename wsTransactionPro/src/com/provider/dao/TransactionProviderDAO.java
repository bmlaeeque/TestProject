package com.provider.dao;

import java.util.List;

import com.provider.dto.TransactionsDetailsDTO;

public interface TransactionProviderDAO {
	public List<TransactionsDetailsDTO> gettransactionDetails(int i);
}
