package Pattern_Program;

public class Triangle_Pattern {
	static int n =  9;
	public static void main(String[] args) {
		for(int i = 0 ; i<n ; i++) {
			for (int j = 0 ; j<n ;j++) {
				if(i+j == (n-1)/2|| j-i == (n-1)/2 || i==(n-1)/2){// diagonal line 
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
