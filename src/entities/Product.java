package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	public int novo;
	public double totalValorStock( ) {
		
		return price * quantity;
		
	}
	
	

	public void addProducts(int quantity) {
		
		this.quantity += quantity;
		
	}

	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
	}


	@Override
	public String toString() {
		return "\nProduct Name: " + name + " Valor: " + price + " Quantidade: " + quantity;
	}

}
