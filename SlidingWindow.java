import java.lang.*;
import java.util.*;
class SlidingWindow extends Thread{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n,i=0,j;
		String p;
		System.out.println("enter the message at sender's side");
		p=s.nextLine();
		System.out.println("enter the size of each frame");
		n=s.nextInt();
		int msg_length=p.length();
		while(i<msg_length){
			String rec=s.nextLine();
			int count=0,incr=0;
			j=0;
			int l=i;
			while(incr<rec.length()){
				if(p.charAt(l)==rec.charAt(j)){
						l++;
						j++;
						count++;
				}
			incr++;	
			if(count==n){
				System.out.println("message received successfully "+rec);
				i=i+n;
			}
			else if(rec.length()!=n){
					//System.out.println("Window length not matching");				}
					if(i+rec.length()>=msg_length){
						int t=0;
						count=0;
						for(int f=i;f<msg_length;f++)
								if(p.charAt(f)==rec.charAt(t)){count++;t++;}
						if(count==rec.length()){
								System.out.println("message received successfully "+rec);incr++;i++;break;}
					
					}
					
					
			}
			else if(incr==rec.length()){
				System.out.println("error detected");
			try{Thread.sleep(1500);}
			catch(InterruptedException e){
					System.out.println(e);}
			System.out.println("Negative acknowledgement received\nsend the frame again");
			}
		}
	}
}
}
