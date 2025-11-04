package ex04;

public interface Payment {

	void pay(int amount);
}


class CreditCard {
	void fare(int amount) {
		System.out.printf("신용카드로 %d 결제 했습니다.\n", amount);
	}
}


class KakaoPay {
	void fee(int amount) {
		System.out.printf("카카오페이로 %d 결제 했습니다.\n", amount);
	}
	
}


class SamsungPay {
	void charge(int amount) {
		System.out.printf("삼성페이로 %d 결제 했습니다.\n", amount);
	}
	
}