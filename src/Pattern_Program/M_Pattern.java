package Pattern_Program;

public class M_Pattern {
	static int n= 9;
	public static void main(String[] args) {
		for (int i=0; i  < n ; i++) {
			for (int j = 0 ; j<n ;j++) {
				 if(j==0&&i>=0||i==j&&i<n/2||i+j==n-1&&i<n/2||j==n-1&&i>=0) {
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
