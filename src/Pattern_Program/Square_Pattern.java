package Pattern_Program;

public class Square_Pattern {
int n = 5;
public static void main(String[] args) {
	Square_Pattern sq =new Square_Pattern();
	sq.pattern();
}

public void pattern() {
	for (int  i =0 ; i<n ; i++)
	{
		for  (int j = 0 ; j<n ; j++)
		{
			if (i==0 || j==0 ||  i==4 || j ==4) {
				System.out.print("*");
			}
			else  {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

}
