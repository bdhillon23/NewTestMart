package org.dhillon.balvinder.business;

import java.util.ArrayList;
import java.util.List;


public class ProductService {
	List<String> BooksList=new ArrayList<>();
	List<String> MusicList=new ArrayList<>();
	List<String> MoviesList=new ArrayList<>();
	List<String> ShoesList=new ArrayList<>();
	
	public  ProductService(){
		BooksList.add("RR Martin");
		BooksList.add("Inferno");
		BooksList.add("Joy Land");
		BooksList.add("Harry Potter");
		
		MusicList.add("JagJeet");
		MusicList.add("Sonu Nigam");
		MusicList.add("Arjit Kumar");
		MusicList.add("Night Versions");
		
		MoviesList.add("Dumpty Sharma Ki Dhulaniya");
		MoviesList.add("X-Man");
		MoviesList.add("300");
		MoviesList.add("Jalim");
		
		ShoesList.add("Nike");
		ShoesList.add("Addidas");
		ShoesList.add("Reebok");
		ShoesList.add("Spark");
		
	}
	
	public List<String> getProductCategories(){
		List<String> categories=new ArrayList<String>();
		categories.add("Books");
		categories.add("Musics");
		categories.add("Movies");		
		categories.add("Shoes");
		return categories;
	}
	public List<String> getProducts(String Catagory){
		switch(Catagory.toLowerCase()){
			case "books":
				return BooksList;
			case "shoes":
				return ShoesList;
			case "music":
				return MusicList;
			case "Movies":
				return MoviesList;
		}
		
		return null;
	}
	public boolean addProduct(String category,String product){
		switch(category.toLowerCase()){
		case "books":
			return BooksList.add(product);
		case "shoes":
			return ShoesList.add(product);
		case "music":
			return MusicList.add(product);
		case "Movies":
			return MoviesList.add(product);
			default :
			return false;
	}
	
		
	}
}
