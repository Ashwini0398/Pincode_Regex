import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPincodeMatch {

	public static boolean IsPinCodeValid(String pincode)
	{
		String regexPincode="^[0-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}" ;   //pattern 
		Pattern pat = Pattern.compile(regexPincode);        //pattern entered to compile
		
		if(pincode== null)   //check wheather the pincode is null or not
		{
			return false;
		}
		Matcher match = pat.matcher(pincode);    //matches the pincode
		
		return match.matches(); //return if pincode match the regex
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n1="400088";     //6digit pincode  test1
		System.out.println(n1+""+IsPinCodeValid(n1));
		
		String n2="A400088";   //special character or alphabet     
		System.out.println(n2+""+IsPinCodeValid(n2));

	
	}
}




//output displays  400088 true
//A400088-false
