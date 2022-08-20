package JavaExercise;

public class Exercise07 {
	public static void main(String [] args) {
		//Approximatep - pi can be computed using the following formula: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		
		double pi = 4*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println(pi);


        double pii = 4*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));
        System.out.println(pii);
	}

}
