package com.provider.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.provider.dto.CustomerDTO;
import com.provider.dto.TransactionsDetailsDTO;
import com.provider.util.DBUtil;

public class TransactionsProviderDAOImpl {
	
	static  TransactionsProviderDAOImpl INSTANCE = null;

	public static synchronized TransactionsProviderDAOImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TransactionsProviderDAOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	public List<TransactionsDetailsDTO> gettransactionDetails(int i) {
		
		//System.out.println(i+" at persistance layer");
		
		List<TransactionsDetailsDTO> list = new ArrayList<TransactionsDetailsDTO>();
		try {
		
		Connection con = DBUtil.getConnection();
		PreparedStatement pstm = con.prepareStatement("select customer.customer_id,transactions.transactions_type,transactions.transaction_amount,transactions.transactions_date from transactions inner join customer on transactions.customer_id=customer.customer_id and customer.customer_id='" + i + "'");
		//			String sql="select customer.name,transactions.transactions_type,transactions.transaction_amount,transactions.transactions_date from transactions inner join customer on transactions.customer_id=customer.customer_id";	

		
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			//System.out.println(rs.next());
			String id = rs.getString("customer_id");
			String transactiontype = rs.getString("transactions_type");
			int transactionAmount = rs.getInt("transaction_amount");
			String transactionDate = rs.getString("transactions_date");
			
			
			
			TransactionsDetailsDTO  transaction=new TransactionsDetailsDTO();
			transaction.setId(id);
			transaction.setTransactionType(transactiontype);
			transaction.setTransactionAmount(transactionAmount);
			transaction.setTransactionDate(transactionDate);
			
			
			
			
			
			list.add(transaction);
			System.out.println(list);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
		
	}
	

}
