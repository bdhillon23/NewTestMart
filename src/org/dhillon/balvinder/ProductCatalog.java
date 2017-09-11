package org.dhillon.balvinder;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.dhillon.balvinder.business.ProductService;
 
@WebService
public class ProductCatalog {
	ProductService productService=new ProductService();
	@WebMethod(exclude=true)
	public List<String> getProductCategories(){ 
			
		return productService.getProductCategories();
	}
	public List<String> getProducts(String Catagory){
		return productService.getProducts(Catagory); 
	}
	public boolean addProduct(String category,String product){
		return productService.addProduct(category, product);
	}
}
