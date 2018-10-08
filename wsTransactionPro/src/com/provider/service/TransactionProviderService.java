package com.provider.service;

import java.util.List;

import com.provider.dto.TransactionsDetailsDTO;

public interface TransactionProviderService {
	public List<TransactionsDetailsDTO> gettransactionDetails(int i);
}
