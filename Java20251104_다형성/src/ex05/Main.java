package ex05;

public class Main {

	public static void main(String[] args) {

		CreditCard cr = new CreditCard();
		cr.fare(10000);
				
		SamsungPay sa = new SamsungPay();
		sa.charge(10000);
		System.out.println("-----------------");
		
		
		Payment p = new KakaoPay();
		p.pay(50000);
		
		func(new KakaoPay(), 5000);
		
	}
	
	public static void func(Payment p, int money) {
		p.pay(money);
	}

}
