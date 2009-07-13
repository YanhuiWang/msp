import java.net.InetAddress;
import java.net.UnknownHostException;


public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(null);
			System.out.println(ia);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
