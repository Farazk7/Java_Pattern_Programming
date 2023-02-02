package Pattern_Program;

public class Eight_Pattern {
int n = 8;
public static void main(String[] args) {
Eight_Pattern e = new Eight_Pattern();
e.pattern();
}
public void pattern() {
	for (int i = 0 ; i<n ; i++) {
		for (int j = 0 ; j<n ; j++ ) {
			if (i==0 || j == 0 || i == (n-1)/2 || i == n-1 || j == n-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
		
	}
}

}
