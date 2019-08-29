package com.cognizant.StockExchangeMicroservice.Dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.StockExchangeMicroservice.Entity.StockExchange;

@Repository
public class StockExchangeDaoImpl implements StockExchangeDao{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public StockExchange addStockExchange(StockExchange stockExchange) {
			
				Session session=null;
				session=sessionFactory.getCurrentSession();
				session.persist(stockExchange);
				return stockExchange;
			
			
		
	}

	@Override
	@Transactional
	public StockExchange retrieveStockExchange(int stockExchangeId) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockExchange s where s.stockExchangeId=?");
		query.setParameter(0,stockExchangeId);
		StockExchange stock=(StockExchange) query.getSingleResult();
		return stock; 
	}

	@Override
	public List<StockExchange> getAllStockExchange() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockExchange");
		List<StockExchange> list=query.getResultList();
		return list;
	}

}
