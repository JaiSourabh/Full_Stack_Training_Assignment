package com.yash.ProdJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.ProdJdbc.entities.Product;

public class ProductDaoImpl implements ProductDao{
	
	private JdbcTemplate prodjdbctemp;
	
	
	
	public JdbcTemplate getProdjdbctemp() {
		return prodjdbctemp;
	}

	public void setProdjdbctemp(JdbcTemplate prodjdbctemp) {
		this.prodjdbctemp = prodjdbctemp;
	}

	public int insertProduct(Product p) {
		String q1="insert into product(pid,pname,price) values(?,?,?)";
		int msg=this.prodjdbctemp.update(q1,p.getPid(),p.getPname(),p.getPrice());
		return msg;
	}

	public int updateProduct(Product p) {
		String q2="update product set pname=?,price=? where pid=?";
		int msg=this.prodjdbctemp.update(q2,p.getPname(),p.getPrice(),p.getPid());
		return msg;
	}

	public int deleteProduct(int pid) {
		String q3="delete from product where pid=?";
		int msg=this.prodjdbctemp.update(q3,pid);
		return msg;
	}

	public Product getProdById(int pid) {
		String q4="select * from product where pid=?";
		RowMapper<Product> rowmapper=new RowMapperimpl();
		Product pnew=this.prodjdbctemp.queryForObject(q4,rowmapper,pid);
		return pnew;
	}

	public List<Product> getAllProd() {
		String q5="select * from product";
		List<Product> lProd=this.prodjdbctemp.query(q5, new RowMapperimpl());
		return lProd;
	}

}
