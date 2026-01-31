package ShoppingCart;

public class ShoppingCartApp {

	public static void main(String[] args) {
		
		Product p1=new Product();
		
		p1.ID = 1;
		p1.Name = "Mobile";
		p1.Price = 20000;
		p1.displayProduct();
		
		Cart cart = new Cart();
        cart.addProduct(p1);
        
        Product p2 = new Product();
        p2.ID = 2;
        p2.Name = "Headset";
        p2.Price = 2000;
        p2.displayProduct();
        
        cart.addProduct(p2);
        
        Product p3 = new Product();
        p3.ID = 3;
        p3.Name = "Laptop";
        p3.Price = 70000;
        p3.displayProduct();
        
        cart.addProduct(p3);
        
        Product p4 = new Product();
        p4.ID = 4;
        p4.Name = "Tablet";
        p4.Price = 40000;
        p4.displayProduct();
        
        cart.addProduct(p4);
        
        Product p5 = new Product();
        p5.ID = 5;
        p5.Name = "TV";
        p5.Price = 22000;
        p5.displayProduct();
        
        cart.addProduct(p5);
        
        cart.showCart();
        System.out.println("Total = " + cart.getTotal());
		}

}
