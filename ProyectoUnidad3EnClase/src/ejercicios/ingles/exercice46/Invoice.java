package ejercicios.ingles.exercice46;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoice implements Comparable<Invoice> {
	
	private int id;
	private Customer customer;
	
	private double ammount;
	
	List<String> listacadena= new ArrayList<String>();
	
	Map<Integer,String> map = new HashMap<Integer,String>();

	
	public Invoice() {
		
		
	}
	
	public Invoice(int id, Customer customer, double ammount) {
		super();
		this.id = id;
		this.customer = customer;
		this.ammount = ammount;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + customer + ", ammount=" + ammount + "]";
	}

	@Override
	public int compareTo(Invoice o) {
		// TODO Auto-generated method stub
		return this.getCustomer().compareTo(o.getCustomer());
	}
	
	

}
