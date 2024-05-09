package Task2;

import java.util.Scanner;

public class product {
	private int pid;
	private double price;
	private int quantity;
	
	product(int pid, double price, int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	int getPid(){
		return pid;
	}
	
	double getPrice(){
		return price;
	}
	
	int getQuantity(){
		return quantity;
	}

	static double totalAmount(product arr[]){
		double total = 0;
		for(int i=0;i<arr.length;i++){
			total+=(arr[i].getPrice()*arr[i].getQuantity());
		}
		return total;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		product arr[] = new product[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter the pid, price and quantity for product "+(i+1)+": ");
			int pid = sc.nextInt();
			double price = sc.nextDouble();
			int quantity = sc.nextInt();
			product p = new product(pid,price,quantity);
			arr[i]=p;
		}
		int pid=0;
		double price = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].getPrice()>price){
				price = arr[i].getPrice();
				pid= arr[i].getPid();
			}
		}
		System.out.println("\n\nPid of product with highest price is: "+pid+"\nhaving price of: "+price);

		double total = product.totalAmount(arr);
		System.out.println("\n\ntotal amount spent on all products is: "+total);
	}
	
}
