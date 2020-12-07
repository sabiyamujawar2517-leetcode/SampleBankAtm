package bankatmcode;

import accountHolder.AccuntHolder;
import model.model;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Hera pheri Atm");
        model account = new model();
        AccuntHolder accountHolder = new  AccuntHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Sabiya");
		t2.setName("Sayali");
		t1.start();
		t2.start();
		System.out.println("Thank you for chooseing Us");
	}

}
