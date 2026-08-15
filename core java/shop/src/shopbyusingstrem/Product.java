package shopbyusingstrem;

public class Product {

	
	

	    private String productName;
	    private String brand;
	    private String storage;
	    private double price;
	    private double customerReview;

	    public Product(String productName, String brand, String storage,
	                   double price, double customerReview) {

	        this.productName = productName;
	        this.brand = brand;
	        this.storage = storage;
	        this.price = price;
	        this.customerReview = customerReview;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getStorage() {
	        return storage;
	    }

	    public void setStorage(String storage) {
	        this.storage = storage;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public double getCustomerReview() {
	        return customerReview;
	    }

	    public void setCustomerReview(double customerReview) {
	        this.customerReview = customerReview;
	    }
	}

