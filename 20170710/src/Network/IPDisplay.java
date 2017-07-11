package Network;
import java.net.*;
public class IPDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ia = null;
		InetAddress[] ia2 = null;
		try {
			ia = InetAddress.getByName("www.youtube.com");
			System.out.println("server HostAddress : "+ia.getHostAddress());
			System.out.println("server HostName : "+ia.getHostName());
			System.out.println("============================");
			ia = InetAddress.getLocalHost();
			System.out.println("local HostAddress : "+ia.getHostAddress());
			System.out.println("local hostName : "+ia.getHostName());
			System.out.println("============================");
			ia2 = InetAddress.getAllByName("www.youtube.com");
			for(InetAddress aa:ia2){
				System.out.println(aa.getHostAddress());
				System.out.println(aa.getHostName());
			}
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
