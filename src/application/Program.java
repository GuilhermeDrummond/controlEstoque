package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product();
		
		
		
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		System.out.println("Insira o dado do produto:");
		System.out.println("Name:");
		product.name = sc.nextLine();
		System.out.println("Price");
		product.price = sc.nextDouble();
		System.out.println("Quantidade:");
		product.quantity = sc.nextInt();
		double stock = product.price * product.quantity;
		
		System.out.printf("Valor total em estoque: R$ " + decimalFormat.format(stock));		

		
		System.out.println(product.toString());
		
		System.out.println("Numero de produtos para adicionar no estoque:");
		
		
		int quantity = sc.nextInt();
		
		
		product.addProducts(quantity);
		
		stock = product.price * product.quantity;		

		System.out.println(product.toString());
		
		System.out.printf("Valor total em estoque: R$ " + decimalFormat.format(stock));		
		
		System.out.println("\nCadastrar uma venda: (Digite quantos produtos serao removidos:)");
		
		int remove = sc.nextInt();
		product.removeProducts(remove);
		stock = product.price * product.quantity;
		
		System.out.println(product.toString());
		
		System.out.printf("Valor total em estoque: R$" + decimalFormat.format(stock));
		
		
		
		sc.close();
	}

}
