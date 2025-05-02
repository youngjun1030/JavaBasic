package hw250430;

public class TalkableTest{
	
	static void speak(Talkable t) {
		t.talk();
	}
	
	
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}
