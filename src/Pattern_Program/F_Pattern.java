package Pattern_Program;

public class F_Pattern {
	static int n = 8;
	public static void main(String[] args) {
		for(int i =0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < n ; j++ ) {
				if ( i==0 || i  == (n-1)/2  || (j==0 && i> 0)) {
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
