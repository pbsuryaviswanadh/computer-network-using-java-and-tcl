import java.io.*;
public class Ping{
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
			String ip="google.com";
			runSystemCommand("ping "+ip);
			java.util.Date date=new java.util.Date();
			System.out.print(date);
	}	
	}
	

