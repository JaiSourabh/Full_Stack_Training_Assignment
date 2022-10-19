package com.yash.ProdJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.ProdJdbc.entities.Product;      

public class RowMapperimpl implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product prod=new Product();
		prod.setPid(rs.getInt(1));
		prod.setPname(rs.getString(2));
		prod.setPrice(rs.getDouble(3));
		
		return prod;
	}

}
