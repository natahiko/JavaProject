import java.util.Scanner;

public class A1_SimpleTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if(x>100 || x<999) return;
		String str = String.valueOf(x);
		System.out.println(str.charAt(0)+" "+str.charAt(1));
	}

}
