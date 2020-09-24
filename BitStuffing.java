import java.util.*;
import java.lang.*;
class BitStuffing{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			String p=s.nextLine();
			int i=0,j=0;
			int count_of_1=0;
			for(i=0;i<p.length();i++){
				int count=0;				
				if(p.charAt(i)=='1'){
					for(j=i;count<=4;j++){
						if(p.charAt(j)=='1')
							count_of_1++;
						count++;}
					if(count_of_1==4)
						p.charAt(i)='0';
			
}
}
System.out.println(p);	
}
}
