package com.cognizant.StockExchangeMicroservice.Service;

import java.util.List;

import com.cognizant.StockExchangeMicroservice.Entity.StockExchange;

public interface StockExchangeService  {

	public StockExchange addStockExchange(StockExchange stockExchange);
	public StockExchange retrieveStockExchange(int stockExchangeId);
	public List<StockExchange> getAllStockExchange();
}
