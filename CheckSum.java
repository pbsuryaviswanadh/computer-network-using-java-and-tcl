import java.util.Scanner;
import java.lang.*;
class CheckSum{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			String p=s.nextLine();
			String d=s.nextLine();
			int p1=Integer.parseInt(p);
			int d1=Integer.parseInt(d);
			System.out.println(p1^d1);
			
	
}
}
