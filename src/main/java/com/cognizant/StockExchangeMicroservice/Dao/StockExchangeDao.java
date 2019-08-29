package com.cognizant.StockExchangeMicroservice.Dao;

import java.util.List;

import com.cognizant.StockExchangeMicroservice.Entity.StockExchange;

public interface StockExchangeDao {

	public StockExchange addStockExchange(StockExchange stockExchange);
	public StockExchange retrieveStockExchange(int stockExchangeId);
	public List<StockExchange> getAllStockExchange();
	
	
}
