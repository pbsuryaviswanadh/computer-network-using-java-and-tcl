import java.net.*;
import java.lang.*;
import java.util.*;
class Inet{
	public static void main(String args[]){
		try{
		System.out.println(InetAddress.getByName("anits.edu.in"));
		System.out.println(InetAddress.getAllByName("anits.edu.in"));
		String p=InetAddress.getLocalHost().getHostAddress();
		System.out.println("Host Address: "+p);
		p=InetAddress.getLocalHost().getHostName();
		System.out.println("Host Name :"+p);
		p=InetAddress.getLocalHost().toString();
		System.out.println("Local Host :"+p);
		byte[] ipAddr = new byte[]{(byte)192,(byte)0,(byte)78,(byte)30};
		InetAddress ip=InetAddress.getByAddress(ipAddr);
		System.out.println(Arrays.toString(ip.getAddress()));  

		
		
	}
	catch(UnknownHostException ie){}
	}
}
