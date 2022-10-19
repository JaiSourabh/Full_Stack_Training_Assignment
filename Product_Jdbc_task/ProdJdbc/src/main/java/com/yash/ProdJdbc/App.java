package com.yash.ProdJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.ProdJdbc.dao.ProductDao;
import com.yash.ProdJdbc.dao.ProductDaoImpl;
import com.yash.ProdJdbc.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/ProdJdbc/applicationcontext.xml");
        ProductDao pDao= context.getBean("Productdao",ProductDao.class);
//        Product p1=new Product();
//        p1.setPid(102);
//        p1.setPname("Iron");
//        p1.setPrice(99);
//        
//        int msg=pDao.insertProduct(p1);
       //int msg= pDao.updateProduct(p1);
       //int msg=pDao.deleteProduct(102);
        //Product p=pDao.getProdById(101);
        List<Product> pList=pDao.getAllProd();
        System.out.println(pList);
        //System.out.println(msg+" : "+"product Deleted successfully");
    }
}
