
public class CharacterCountStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaacccccccvvvvv";
		System.out.println(charactercount(s));
	}

	public static String charactercount(String s){
		StringBuilder new_string = new StringBuilder(); 
		// At beginning - lenghth is 0 and capacity is 16
		System.out.println("Initial length "+new_string.length());
		System.out.println("Initial Capacity "+new_string.capacity());
		new_string.append("adddddingggggg characters");
		//after 16 length capacity is 34 and increases dynamically
		System.out.println("Modified length "+new_string.length());
		System.out.println("Modified capacity "+new_string.capacity());
		
		
		new_string.delete(0,new_string.length());
		
		/*
		 *
		 int cseq_count=1; 
		 int i=0;		
		 while(i<s.length() && i+1<s.length()){
			while(s.charAt(i) == s.charAt(i+1)){
				cseq_count++;
				i++;
				if(i+1 == s.length()-1){
					break;
				}
			}
			new_string.append(s.charAt(i));
			new_string.append(cseq_count);
			System.out.println(new_string.toString());
			cseq_count=0;
			i++;
		}
 		 
		 */
		int cseq_count=1;
		for(int i=0 ;i<s.length();i++){
			cseq_count++;
			if( i+1>=s.length()||s.charAt(i)!=s.charAt(i+1)){
				new_string.append(s.charAt(i));
				new_string.append(cseq_count);
				cseq_count=0;
			}
		}
				
		return new_string.toString();
	} 
}
