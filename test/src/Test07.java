import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class Test07 {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		byte[] dataByte = "王燕辉".getBytes("UTF-8");
		System.out.println(dataByte);
	}
}
