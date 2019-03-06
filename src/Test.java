
public class Test {
	public static void main(String[] args) {
		
		String sentence = "Hey fellow warriors abc";
		
		// split string into an array using spaces 
	    String[] splitted = sentence.split("\\s+");
	    
	    // get length of arrray 
	    int arrayLength = splitted.length;
	    
	    String result = "";
	    
	    // loop through each word
	    for(int i = 0; i < splitted.length; i++) {
		    // if word is 5 or more characters 
	    	if(splitted[i].length() >= 5) {
	    		// for each character 
	    		for(int j = splitted[i].length(); j >0; j--) {
	    			// store word backwards in a string variable  
	    			result += splitted[i].charAt(j-1);
	    		}
	    		// add space between words 
	    		result += " ";
	    	}else{
	    		result += splitted[i] + " ";
	    	}
	    }
	    System.out.println(result);
	}		 
}
