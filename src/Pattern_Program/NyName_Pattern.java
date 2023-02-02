package Pattern_Program;

public class NyName_Pattern {
	static int n =  9;
	public static void main(String[] args) {
		for (int i = 0 ; i<n ;i++) { //F
			for ( int j = 0 ; j < n ; j++ ) {
				if ( i==0 || i  == (n-1)/2  || (j==0 && i> 0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				} 
			}
			
			System.out.print(" ");
			for (int j = 0 ; j<n ;j++) { //A
				if(i==0 && j>0 && j< (n-1)/2 || j==0 & i>0 || i == (n-1)/2 && j <=(n-1)/2  || j==(n-1)/2 && i>0 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for (int j = 0 ; j<n ;j++) {  //R
				if(j==0 || j==(n-1)/2 && i<(n-1)/2 || i==(n-1)/2 && j < (n-1)/2 || i-j ==(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for (int j = 0 ; j<n ;j++) { //A
				if(i==0 && j>0 && j< (n-1)/2 || j==0 & i>0 || i == (n-1)/2 && j <=(n-1)/2  || j==(n-1)/2 && i>0 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("");
			for (int j = 0 ; j<n ;j++) { //Z
				if(i==0  || i+j ==n-1 || i ==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			for (int j = 0 ; j<n ;j++) { //K
				if(j==0 || i+j == (n-1)/2|| i-j ==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("");
				for ( int j = 0 ; j < n ; j++ ) { //H
					if ( j==0 || i  == (n-1)/2 || j== n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				System.out.print("  ");
				for (int j = 0 ; j<n ;j++) { //A
					if(i==0 && j>0 && j< (n-1)/2 || j==0 & i>0 || i == (n-1)/2 && j <=(n-1)/2  || j==(n-1)/2 && i>0 ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			
				System.out.print(" ");
				for (int j = 0 ; j<n ;j++) {//N
					if ( j==0 || j== n-1 || (i==j ) ) {
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

		