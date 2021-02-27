package demo.com.spring;

public class Vodaphone implements Sim {
	Vodaphone(){
		System.out.println("constructor vodaphone called");
	}
	public void calling() {
		System.out.println("vodaphone calling");
	}
	public void data() {
		System.out.println("data used by vodaphone");
	}
	

}
