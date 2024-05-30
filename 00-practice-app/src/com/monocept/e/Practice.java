epackage com.monocept.e;

public class Practice {
	
	 public static boolean Input(String input,int minlength,int maxlength) {
		 if(input==null||input.length()<minlength||input.length()>maxlength)
			 return false;
		return true;
	 }
	  
	 public static boolean Rollnumber(String rollno) {
		 return Input(rollno,5,10);
	 }
	 public static boolean Name(String name) {
		 return Input(name,3,30);
	 }
	 public static boolean Address(String address) {
		 if(!Input(address,5,50))
			 return false;
		 if(!address.contains("/")||!address.contains(",")||!address.contains("-"))
			 return false;
	 return true;
	 }
	 public static boolean Phoneno(long pno) {
		if(pno<1000000000 && pno>999999999L)
			return false;
		return true;
	 }
	public static String result(String rollno,String name,String address,long pno) {
		boolean isRollnoValid= Rollnumber(rollno);
		boolean isnameValid=Name(name);
		boolean isaddressValid=Address(address);
	    boolean ispnoValid=Phoneno(pno);
	    if(isRollnoValid&&isnameValid&&isaddressValid&&ispnoValid)
			return "Valid everything is correct";
	return "invalid somthing is not correct";

		
	}
	

}
