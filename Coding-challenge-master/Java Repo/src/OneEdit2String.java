/*
 * Check If 2 string differ by only one edit 
 * */

public class OneEdit2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="pale";
		String s2="paale";
		System.out.println(checkString(s1, s2));
		
	}
	
	public static boolean checkString(String s1,String s2){		
		//identify shorter string 
		s1=s1.length()<s2.length()?s1:s2;
		s2=s1.length()<s2.length()?s2:s1;
		if(Math.abs(s2.length() -s1.length()) > 1){
			return false;
		}
		int s1_count=0;
		int s2_count=0;
		boolean flag = false; 
		while(s1_count < s1.length() && s2_count <s2.length()){
			//we dont have to traverse with long string so set s1 as short and s2 as long
			for (int i =0;i < s1.length(); i++){
				//if both the character at the given index is same increase the pointer 
				if(s1.charAt(i) == s2.charAt(i)){
					s1_count++;
				}
				// if characters are not same
				else{
					// you can allow up to one difference
					if(flag == true)
						return false;
					flag=true;
					//  a  b  c
					//  a  c  v
					// miss match at 2nd position v can allow one change so increase the short pointer
					s1_count++;
					
				}
				s2_count++;
			}
			
		}
		
		
		return true;
	}
}

