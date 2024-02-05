package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double X=0;
				for (int i=0; i<1000;i++) { 
					double A = Math.random();
					double B = Math.random();
					double L=Math.sqrt(A*A+B*B);
					if (L<1) {
						X++;
					}
				}
		double Pi=4*X/1000;
		System.out.println(Pi);

	}

}
