package com.wolken.store.dao;

import com.wolken.store.entity.MarketDetails;

public interface MarketDetailsDAO {
	boolean save(MarketDetails details);
	void getByid(int id);
    boolean update(MarketDetails details);
	boolean delete(MarketDetails details);
}
