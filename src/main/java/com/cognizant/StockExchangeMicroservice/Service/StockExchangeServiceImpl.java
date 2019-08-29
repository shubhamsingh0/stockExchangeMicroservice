package com.cognizant.StockExchangeMicroservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.StockExchangeMicroservice.Dao.StockExchangeDao;
import com.cognizant.StockExchangeMicroservice.Entity.StockExchange;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{

	@Autowired
	StockExchangeDao stockExchangeDao;
	
	public StockExchange addStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		return stockExchangeDao.addStockExchange(stockExchange);
	}

	public StockExchange retrieveStockExchange(int stockExchangeId) {
		// TODO Auto-generated method stub
		return stockExchangeDao.retrieveStockExchange(stockExchangeId);
	}

	@Override
	public List<StockExchange> getAllStockExchange() {
		// TODO Auto-generated method stub
		return stockExchangeDao.getAllStockExchange();
	}

}
