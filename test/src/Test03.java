
public class Test03 {
	public static void main(String[] args) {
		String s1 = "sadsfasdf;asdfasdf;";
		String[] s2 = s1.split(";");
		System.out.println("s1.length:" + s2.length);
		for (int i = 0, n = s2.length; i < n; i++) { 
			System.out.println(s2[i]);
		}
	}
}
