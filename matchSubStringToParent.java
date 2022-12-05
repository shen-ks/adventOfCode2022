
public class matchSubStringToParent {
	//class to match a substring to a parent
	public static void main(String[] args){
		//function to match string 1 and string 2
		String s1 = "2345678";
		String s2 = "89101112";

		//find if there is a matching character between string1 and string 2 , if there is a match, return true, if there is no match, return false
		//for loop to iterate through string 1
		for(int i = 0; i < s1.length(); i++){
			//for loop to iterate through string 2
			for(int j = 0; j < s2.length(); j++){
				//if the character in string 1 is equal to the character in string 2
				if(s1.charAt(i) == s2.charAt(j)){
					//return true
					System.out.println("True");
				}
				
			}
		}
		/* code segment to find subset
			if(s2.contains(s1)){
		 	System.out.println("True");
		 }
		 else if(s1.contains(s2)) {
		 	System.out.println("True");
		 }
		 else {
		 	System.out.println("False");
		 }
		*/
	}
}

