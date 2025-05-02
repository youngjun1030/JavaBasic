package hw250430;

public class Radio extends Controller{
	
	public Radio(boolean power) {
		this.power = power;
	}

	public void show() {
		System.out.println("라디오가 " + getName());
	}
	
	public String getName() {
		if (power == true) {
			return "켜졌습니다.";
		} else {
			return "꺼졌습니다.";
		}
	}

}
