import java.io.*;
public class TraceRoute{
	public static void runSystemCommand(String command){
		try{
			Process p =Runtime.getRuntime().exec(command);
			BufferedReader InputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s="";
			while((s=InputStream.readLine())!=null)
					System.out.println(s);
			}
		catch(Exception e){
				e.printStackTrace();
		}	
		}
	public static void main(String args[]){
			String ip="192.0.78.31";
			runSystemCommand("traceroute "+ip);
			java.util.Date date=new java.util.Date();
			System.out.print(date);
	}	
	}
	

