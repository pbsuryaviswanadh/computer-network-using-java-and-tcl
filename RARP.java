import java.util.*;
import java.lang.*;
import java.net.*;
class ARP{
	static int getOctet(String ip){
			int res=Integer.parseInt(ip);
			return res;
	}
	public static void main(String args[]){
		int i=0,j=0;
		String binary_address="";
		String mac_address="";
		String ip_address;
		int octet_int[]=new int[4];
		int binary_int[]=new int[4];
		String hexa_dec[]=new String[6];
		Scanner s=new Scanner(System.in);
		ip_address=s.nextLine();
		int ip_length=ip_address.length();
		String octet[]=ip_address.split("\\.");
	
		for(j=0;j<4;j++){
			int res=getOctet(octet[j]);
			octet_int[j]=res;
			//System.out.println(octet_int[j]);
			binary_int[j]=Integer.parseInt(Integer.toBinaryString(octet_int[j]));
			hexa_dec[j]=Integer.toHexString(octet_int[j]);
			}
		for(j=0;j<4;j++){
			//System.out.println(binary_int[j]);
			binary_address=(binary_address+binary_int[j]).toString()+".";
			
			}
			binary_address=binary_address.substring(0,binary_address.length()-1);
			System.out.println("Binary form of IP is "+binary_address);
		hexa_dec[4]=((octet_int[0]&octet_int[1]))+"";
		hexa_dec[5]=((octet_int[2]&octet_int[3]))+"";	
		for(j=0;j<6;j++){
				//System.out.println(hexa_dec[j]);
				mac_address=mac_address+hexa_dec[j]+":";
				}
				mac_address=mac_address.substring(0,mac_address.length()-1);	
				System.out.println("Mac address is "+mac_address);
}
}

