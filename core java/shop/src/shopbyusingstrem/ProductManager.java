package shopbyusingstrem;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class ProductManager {

	    private ArrayList<Product> products = new ArrayList<>();

	    public ProductManager() {

	        products.add(new Product("iPhone 13", "Apple", "128GB", 49999, 4.5));
	        products.add(new Product("Galaxy M34", "Samsung", "128GB", 18999, 4.2));
	        products.add(new Product("Nord CE 3", "OnePlus", "256GB", 24999, 4.3));
	        products.add(new Product("Redmi Note 13", "Redmi", "128GB", 17999, 4.1));
	        products.add(new Product("Galaxy S23", "Samsung", "256GB", 49999, 4.6));
	        products.add(new Product("OnePlus 12R", "OnePlus", "256GB", 42999, 4.5));
	        products.add(new Product("Realme 12", "Realme", "128GB", 22999, 4.0));
	    }

	    public ArrayList<Product> getProducts() {
	        return products;
	    }

	    // Search Product
	    public Product searchProduct(String name) {

	        for (Product p : products) {

	            if (p.getProductName().equalsIgnoreCase(name)) {
	                return p;
	            }
	        }

	        return null;
	    }

	    // Filter by Brand
	    public List<Product> filterByBrand(String brand) {

	        return products.stream()
	                .filter(p -> p.getBrand().equalsIgnoreCase(brand))
	                .collect(Collectors.toList());
	    }

	    // Filter by Price 2000-5000
	    public List<Product> filterByPrice() {

	        return products.stream()
	                .filter(p -> p.getPrice() >= 2000 && p.getPrice() <= 5000)
	                .collect(Collectors.toList());
	    }

	    // Filter by Customer Review
	    public List<Product> filterByReview(double review) {

	        return products.stream()
	                .filter(p -> p.getCustomerReview() >= review)
	                .collect(Collectors.toList());
	    }
	}

