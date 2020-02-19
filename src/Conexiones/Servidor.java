package Conexiones;
import java.net.ServerSocket;
import java.net.InetAddress;
public class Servidor {
	private final int port; 
	private InetAddress address;
	Servidor(int puerto, int backlog){
		port=puerto;
		try {
			address = InetAddress.getByName("127.0.0.1");
		}
		catch (Exception e) {
			System.out.print("Error");
			
		}
		
	}
	Servidor(){
		address = Servidor.HostExcep("127.0.0.1");
		port=0;
		
		
	}
	public static InetAddress HostExcep(String ipString) {
		boolean flag=true;
		InetAddress ip=null;
		while(flag) {
			try {
				ip = InetAddress.getByName(ipString);
				flag=false;
			}
			catch(Exception e) {
				continue;
			}
		}
		return ip;
	}
	

}
