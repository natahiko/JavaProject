import java.util.Scanner;

public class A19_SymepriaDegree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String str = String.valueOf(x);
		int i=0, j=str.length()-1;
		int count = 0;
		while(i!=j && i<j) {
			if(str.charAt(i)==str.charAt(j)) count++;
			i++; j--;
		}
		if(i==j) count++;
		System.out.println(count);
	}
}
