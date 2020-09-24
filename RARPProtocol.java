import java.lang.*;
import java.util.*;
class RARPProtocol{
	public static void main(String args[]){
		int i=0,j=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the MAC address");
		String mac_address=s.nextLine();
		String mac[]=mac_address.split("\\:");
		int ip[]=new int[4];
		String ip_address="";
		for(i=0;i<4;i++)
			ip[i]=Integer.parseInt(mac[i],16);
		for(i=0;i<4;i++)
			ip_address=ip_address+(ip[i])+".";
		ip_address=ip_address.substring(0,ip_address.length()-1);	
		System.out.println("IP address is "+ip_address);
	}
}
