package JavaExercise;

public class Exercise13 {

	public static void main(String[] args) {
		//Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
		//Write a program that solves the following equation and displays the value for x and y:
		//3.4x + 50.2y = 44.5
		//3.4x + 50.2y = 44.5
		
		System.out.println("Q1.13");
		
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + 0.55y =  5.9");
        System.out.println("x = ((44.5 * 0.55) - (50.2 * 5.9))/ ((3.4 * 0.55) - (50.2 *2.1))");
        System.out.println("x = " + ((44.5 * 0.55) - (50.2 * 5.9))/ ((3.4 * 0.55) - (50.2 *2.1)));
        System.out.println("y = ((3.4 * 5.9) - (44.5 * 2.1))/ ((3.4 * .55) - (50.2 * 2.1))");
        System.out.println("y = " + ((3.4 * 5.9) - (44.5 * 2.1))/ ((3.4 * 0.55) - (50.2 * 2.1)));

	}

}
