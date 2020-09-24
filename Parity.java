import java.lang.*;
import java.util.Scanner;
class Parity{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			String p=s.nextLine();
			int i=0,count=0;
			for(i=0;i<p.length();i++){
				if (p.charAt(i)=='1')
				count++;}
			if(count%2==0){
				System.out.println("Even parity");
				p=p+'0';
				System.out.println("The corrected message is "+p);
}
			else{
				System.out.println("Odd parity");
				p=p+'1';
				System.out.println("The corrected message is "+p);
}
}
}
