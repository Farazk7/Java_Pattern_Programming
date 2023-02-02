package Pattern_Program;

public class Diagonal_Program {
static int n = 15;
public static void main(String[] args) {
	for(int i = 0 ; i<n ; i++) {
		for (int j = 0 ; j<n ;j++) {
			if (i==j || i+j ==n-1) {// diagonal line 
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		// second pattern
		System.out.print(" ");
		for (int j = 0 ; j<n ;j++) {
			if (i+j == (n-1)/2|| i-j ==(n-1)/2 ||j-i == (n-1)/2 || i+j == n-1 + (n-1)/2) {// diamond pattern 
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
		// third pattern
		System.out.print("  ");
		for (int j = 0 ; j<n ;j++) {
			if((i==0 && j<= (n-1)/2) || (j==0 && i <= (n-1)/2) || i+j <=(n-1)/2 || 
					(i<=(n-1)/2 && j==0) || (i==n-1 && j<= (n-1)/2) || i-j >=(n-1)/2 ||
					(i<=(n-1)/2 && j== n-1) || (j>=(n-1)/2 && i==0 ) || j-i >= (n-1)/2 ||
					(i== n-1 && j<=(n-1)/2) || j== n-1 && i>= (n-1)/2 || i+j >= (n-1) + (n-1)/2 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	
}
}
