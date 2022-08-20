package JavaExercise;

public class Exercise12 {

	public static void main(String[] args) {
		//Average speed in kilometers - Assume a runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
		double kilometer =24*1.6;
		double velocity = ((60*60)+(40*60)+35);
		double kilometerperhour= kilometer/velocity;
		System.out.println("kilometerperhour=" + kilometerperhour);
	}

}
