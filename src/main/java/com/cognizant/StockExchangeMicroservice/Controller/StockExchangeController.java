package com.cognizant.StockExchangeMicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.StockExchangeMicroservice.Entity.StockExchange;
import com.cognizant.StockExchangeMicroservice.Service.StockExchangeService;

@RestController
public class StockExchangeController {
	@Autowired
	StockExchangeService stockExchangeService;
	/*@RequestMapping("/stockExchnage/{stockExchange}")
	public ResponseEntity<StockExchange> addStockExchange(@PathVariable StockExchange stockExchange)
	{
		ResponseEntity<StockExchange> response=null;
		StockExchange stock=stockExchnageService.addStockExchange(stockExchange);
		if(stock.getStockExchangeId()>0)
			response=new ResponseEntity<StockExchange>(stock,HttpStatus.OK);
		else
			response=new ResponseEntity<StockExchange>(stock,HttpStatus.CONFLICT);
		return response;
	}*/
	
	@RequestMapping("/stockExchangeId/{stockExchangeId}")
	public ResponseEntity<StockExchange> retrieveStockExchange(@PathVariable int stockExchangeId)
	{
		ResponseEntity<StockExchange> response=null;
		StockExchange stock=stockExchangeService.retrieveStockExchange(stockExchangeId);
		if(stock.getStockExchangeId()>0)
			response=new ResponseEntity<StockExchange>(stock,HttpStatus.OK);
		else
			response=new ResponseEntity<StockExchange>(stock,HttpStatus.CONFLICT);
		return response;
	}
	@RequestMapping("/getAllStockExchangeList")
	public ResponseEntity<List<StockExchange>> getAllStockExchange()
	{
		List<StockExchange> list=stockExchangeService.getAllStockExchange();
		ResponseEntity<List<StockExchange>> response= new ResponseEntity<List<StockExchange>>(list,HttpStatus.OK);
		return response;
	}
	
	
	
}