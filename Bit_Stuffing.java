import java.util.*;
import java.lang.*;
class Bit_Stuffing{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			String p=s.nextLine();
			int array[]=new int[10];
			int i=0,j=0;
			for(i=0;i<10;i++)
				array[i]=0;
			int count=0;
			for(i=0;i<p.length();i=i+5){
			count=0;
					if(p.charAt(i)=='1' && p.charAt(i+1)=='1' && p.charAt(i+2)=='1' && p.charAt(i+3)=='1' && p.charAt(i+4)=='1')
		count++;
		if(count==1){
			array[j]=i+5;j++;}
			
}
					j=0;
/*			for(j=0;j<10;j++)
			System.out.println(array[j]);*/			
			for(i=0;i<p.length();i++){
				System.out.print(p.charAt(i));
				if(array[j]==i+1){
				System.out.print(0);j++;}

}
}	
}

