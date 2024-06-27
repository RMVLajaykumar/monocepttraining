package com.monocept.test;
import java.util.function.Predicate;
import java.util.regex.Pattern;
public class EmailPredicate {
    public static void main(String[] args) {
        
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Predicate<String> predicate = (String)->{
        
          if(pattern.matcher(String).matches())
        	  return true;
          return false;
        };
        if (predicate.test("ak@gmail.com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
