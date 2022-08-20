package JavaExercise;

public class Exercise04 {
	//Print a table - Write a program that displays the following table.
	public static void main (String[] args) {
		//a  a^2 a^3
        //1  1   1
        //2  4   8
        //3  9   27
        //4  16  64
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        
        /*System.out.print("" + Math.pow(a, 1)); 
        System.out.print("  " + Math.pow(a, 2));
        System.out.println("   " + Math.pow(a, 3));
        System.out.print("" + Math.pow(b, 1)); 
        System.out.print("  " + Math.pow(b, 2)); 
        System.out.println("   " + Math.pow(b, 3)); 
        System.out.print("" + Math.pow(c, 1)); 
        System.out.print("  " + Math.pow(c, 2)); 
        System.out.println("   " + Math.pow(c, 3));
        System.out.print("" + Math.pow(d, 1)); 
        System.out.print("  " + Math.pow(d, 2)); 
        System.out.print("   " + Math.pow(d, 3));*/
        System.out.print(a + "\t" + a*a + "\t" + a*a*a + "\n");
        System.out.print(b + "\t" + b*b + "\t" + b*b*b + "\n");
        System.out.print(c + "\t" + c*c + "\t" + c*c*c + "\n");
        System.out.print(d + "\t" + d*d + "\t" + d*d*d + "\n");
        
        
	}
}
