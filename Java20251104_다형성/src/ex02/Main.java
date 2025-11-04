package ex02;

abstract class Player {  //추상클래스
	abstract void play(int pos);  //추상메소드
	abstract void stop();  //추상메소드
	
	void func() {
		
	}
}

class AudioPlayer extends Player {
	@Override
	void play(int pos) {
		System.out.println("AudioPlayer");
	}
	@Override
	void stop() {
		
	}
	
}

class CdPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("CdPlayer");
	}

	@Override
	void stop() {
		
	}
	
}

abstract class MymyPlayer extends Player {

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

}



public class Main {

	public static void main(String[] args) {

		// 1. 추상클래스는 객체 생성 불가
//		Player p1 = new Player();
		
		Player p = new AudioPlayer();
		p.play(1);
		
		p = new CdPlayer();
		p.play(1);
		
//		p = new MymyPlayer();  // MymyPlayer() 가 추상클래스
	}

}
