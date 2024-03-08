package javasessions.builderpattern;

public class ShopTest {

	// This is a caller / driver class for shopping class.
	// It shows how a builder pattern looks like when it is used.

	public static void main(String[] args) {
		Shopping shop = new Shopping();

		// Below lines show how a builder looks like 
		// when we call the methods sequentially
		// to build and complete a workflow. For e.g.
		// below lines show what steps user would do to complete
		// shopping via e-commerce app starting from login until logout.
		
		// Workflow : login > search for a single product > add to cart > do payment>
		            // > generate order > logout 
		shop.login("Shubham", "Test@123")
				.login()
					.search("Macbook Pro", 200000)
						.addToCart("Macbook Pro")
							.doPayment("test123@ybl")
								.generateOrder()
									.logout();
		
		// O/P:
//		Login with Shubham : Test@123
//		User logged in
//		search product: Macbook Pro : 200000
//		add to cart : Macbook Pro
//		do payment : test123@ybl
//		generating order, order id is: 12345
//		logout
		
		System.out.println("---------");
		
		// Workflow : login > search for a single product > add to cart  > logout 
		shop.login("Shubham", "Test@123")
				.login()
					.search("T-Shirt", 1000)
						.addToCart("T-Shirt")
									.logout();
		
		// O/P:
//		Login with Shubham : Test@123
//		User logged in
//		search product: T-Shirt : 1000
//		add to cart : T-Shirt
//		logout
		
		System.out.println("---------");
		
		// Workflow : login > search for 3 products one by one > add to cart any one of the product  > 
		//            >do payment > generate order > logout 
		shop.login("Shubham", "Test@123")
		.login()
			.search("Apple Imac")
				.search("Apple Iphone")
					.search("Apple Macbook Pro")
						.addToCart("Apple Iphone")
							.doPayment("2121 2121 2121 2121", 900)
								.generateOrder()
									.logout();
		// O/P
//		Login with Shubham : Test@123
//		User logged in
//		search product: Apple Imac
//		search product: Apple Iphone
//		search product: Apple Macbook Pro
//		add to cart : Apple Iphone
//		do payment : 2121 2121 2121 2121 : 900
//		generating order, order id is: 12345
//		logout
		
		System.out.println("---------");
		
		// Workflow : login > logout 
		shop.login("Shubham", "Test@123")
				.login()
					.logout();
		
		// O/P
//		Login with Shubham : Test@123
//		User logged in
//		logout
			
		// ADVANTAGE OF BUILDER PATTERN? WHY SHOULD WE USE IT?
		
		// We should use the builder pattern to create an application
		// where we need to implement different workflow which
		// may or may not include all the steps in the class implementing
		// the builder pattern (as shown in flows from 1-3 above).
		// We could achieve this using only a SINGLE object meaning
		// we don't need to create separate object to call every method/step.
		// For e.g. : we may a work flow where we need to login to ecommerce app
		// and go until the shopping for an item is completed and log out. In other flow
		// we can just login to the ecommerce app, search for a product and logout.
		
		

	}

}
