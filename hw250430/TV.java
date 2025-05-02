package hw250430;

public class TV extends Controller{
	
	public TV(boolean power) {
		this.power = power;
	}
	
	public void show() {
		System.out.println("TV가 " + getName());
	}
	
	public String getName() {
		if (power == true) {
			return "켜졌습니다.";
		} else {
			return "꺼졌습니다.";
		}
	}

}
