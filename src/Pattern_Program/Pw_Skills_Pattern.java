package Pattern_Program;

public class Pw_Skills_Pattern {
	static int n =  9;
	public static void main(String[] args) {
		for (int i = 0 ; i<n ;i++) {
		for (int j = 0 ; j<n ;j++) { //	P
			if(j==0 || i==0&& j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print(""); 
		for (int j = 0 ; j<n ;j++) {// W
			if(j==0 ||i==j&&i>n/2||i+j==n-1&&i>n/2||  j==n-1 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("        ");
		for (int j = 0 ; j<n ;j++) { //S
			if(j==0 && i <= (n-1)/2  || i==0 && j <=(n-1)/2 || i== (n-1)/2  && j<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 ||  i==n-1 && j<=(n-1)/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("");
		for (int j = 0 ; j<n ;j++) { //K
			if(j==0 || i+j == (n-1)/2|| i-j ==(n-1)/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.print("");
		for (int j = 0 ; j<n ;j++) { //I
			if(j==(n-1)/2 && i>=0 || i==0 || i==n-1  ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		for (int j = 0 ; j<n ;j++) {
			if(j==0 || i==n-1 && j<=(n-1)/2 ) { //L
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.print(" ");
		for (int j = 0 ; j<n ;j++) { // L
			if(j==0 || i==n-1 && j<=(n-1)/2 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("");
		for (int j = 0 ; j<n ;j++) { //S
			if(j==0 && i <= (n-1)/2  || i==0 && j <=(n-1)/2 || i== (n-1)/2  && j<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 ||  i==n-1 && j<=(n-1)/2) {
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
