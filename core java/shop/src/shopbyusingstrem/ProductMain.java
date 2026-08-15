package shopbyusingstrem;

    import java.util.List;
	import java.util.Scanner;

	public class ProductMain {

	    static Scanner sc = new Scanner(System.in);
	    static ProductManager manager = new ProductManager();

	    public static void main(String[] args) {

	        boolean flag = true;

	        while (flag) {

	            System.out.println("\n===== Product Management System =====");
	            System.out.println("1. Display All Products");
	            System.out.println("2. Search Product");
	            System.out.println("3. Filter by Brand");
	            System.out.println("4. Filter by Price Range (2000-5000)");
	            System.out.println("5. Filter by Customer Reviews");
	            System.out.println("6. Exit");

	            System.out.println("Enter a choice:");
	            int ch = sc.nextInt();

	            switch (ch) {

	            case 1 -> {
	                System.out.println("===== All Products =====");

	                manager.getProducts().forEach(p ->
	                    System.out.println(
	                        p.getProductName() + " || " +
	                        p.getBrand() + " || " +
	                        p.getStorage() + " || ₹" +
	                        p.getPrice() + " || " +
	                        p.getCustomerReview()
	                    )
	                );
	            }

	            case 2 -> {
	                System.out.println("Enter Product Name:");
	                sc.nextLine();
	                String name = sc.nextLine();

	                Product product = manager.searchProduct(name);

	                if (product != null) {
	                    System.out.println(
	                        product.getProductName() + " || " +
	                        product.getBrand() + " || " +
	                        product.getStorage() + " || ₹" +
	                        product.getPrice() + " || " +
	                        product.getCustomerReview()
	                    );
	                } else {
	                    System.out.println("Product Not Found!");
	                }
	            }

	            case 3 -> {
	                System.out.println("Enter Brand:");
	                sc.nextLine();
	                String brand = sc.nextLine();

	                List<Product> filtered = manager.filterByBrand(brand);

	                System.out.println("===== Products by Brand =====");

	                if (filtered.isEmpty()) {
	                    System.out.println("No products found!");
	                } else {
	                    filtered.forEach(p ->
	                        System.out.println(
	                            p.getProductName() + " || " +
	                            p.getBrand() + " || " +
	                            p.getStorage() + " || ₹" +
	                            p.getPrice() + " || " +
	                            p.getCustomerReview()
	                        )
	                    );
	                }
	            }

	            case 4 -> {
	                List<Product> filtered = manager.filterByPrice();

	                System.out.println("===== Products between ₹2000-₹5000 =====");

	                if (filtered.isEmpty()) {
	                    System.out.println("No products found!");
	                } else {
	                    filtered.forEach(p ->
	                        System.out.println(
	                            p.getProductName() + " || " +
	                            p.getBrand() + " || " +
	                            p.getStorage() + " || ₹" +
	                            p.getPrice() + " || " +
	                            p.getCustomerReview()
	                        )
	                    );
	                }
	            }

	            case 5 -> {
	                System.out.println("Enter minimum customer review rating:");
	                double review = sc.nextDouble();

	                List<Product> filtered = manager.filterByReview(review);

	                System.out.println("===== Customer Review Filter =====");

	                if (filtered.isEmpty()) {
	                    System.out.println("No products found!");
	                } else {
	                    filtered.forEach(p ->
	                        System.out.println(
	                            p.getProductName() + " || " +
	                            p.getBrand() + " || " +
	                            p.getStorage() + " || ₹" +
	                            p.getPrice() + " || " +
	                            p.getCustomerReview()
	                        )
	                    );
	                }
	            }

	            case 6 -> {
	                flag = false;
	                System.out.println("Exiting Product Management System...");
	            }

	            default -> System.out.println("Invalid Choice!");
	            }
	        }
	    }
	}

