import java.util.Scanner;

public class A27_CyclicSlide {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int max = 0;
		String str = Integer.toBinaryString(x);
		for(int i=str.length()-1; i>=0; i--) {
			str += str.charAt(0);
			str = str.substring(1);
			int n = Integer.valueOf(Integer.parseInt(str,2));
			if(max<n) max = n;
		}
		System.out.println(max);
	}

}
