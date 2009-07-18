import java.io.DataInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class Test01 {
	private static final String HANDHELD_PORT = "922";
	private static final String BES_HOST = "localhost";
	private static final int BES_PORT = 80;	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {		
		//URL url = new URL("http", BES_HOST, BES_PORT, "/info/Test1?DESTINATION=wyh&PORT=80&REQUESTURI=/");
//		URL url = new URL("http://www.hbca.org.cn/bak/HBCA/sqb.doc");
		URL url = new URL("http://192.168.1.13/info/RedirectServlet");		
		System.out.println("Sending to" + url.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET"); // post the data to the BES			

		InputStream ins = conn.getInputStream();
		int contentLength = conn.getContentLength();

		System.out.println("Content Type:" + conn.getContentType());
		System.out.println("Content length:" + contentLength);
		if (contentLength > 0) {
			byte[] someArray = new byte[contentLength];
			DataInputStream dins = new DataInputStream(ins);
			dins.readFully(someArray);
			System.out.println(new String(someArray));
		}
		ins.close();
		conn.disconnect();
	}

}
