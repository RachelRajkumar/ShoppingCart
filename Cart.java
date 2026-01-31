package ShoppingCart;

public class Cart {
	Product[] Products=new Product[5];
	int count=0;
	
	public void addProduct(Product p) {
        Products[count] = p;
        count++;
        System.out.println(p.Name + " added to cart");
	}
        
        public void showCart() {
           System.out.println("Items in Cart: ");
            for (int i = 0; i < count; i++) {
                System.out.println(Products[i].ID + " " + Products[i].Name + " " + Products[i].Price);
            }
        }
      public double getTotal() {
            double total = 0;
            for (int i = 0; i < count; i++) {
                total = total + Products[i].Price;
            }
            return total;
      }
}
