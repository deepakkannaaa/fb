package datatypes;

public class Datatypes {
	public static void main(String[] args) {
		int n=345;
		int i=0;
		int j=0;
		while(n>0) {
			i=n%10;
	j=(j*10)+i;
				n=n/10;
		}
		System.out.println(j);
		
	}
	
}
