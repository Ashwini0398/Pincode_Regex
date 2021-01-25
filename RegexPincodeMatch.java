import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPincodeMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pincode Match Using Rejex");
		Pattern pat = Pattern.compile("^[0-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}");
		Matcher match = pat.matcher("400088");
		boolean result=match.matches();
		System.out.println(result);
	
	}
}
