/*
 * check if two strings are permutation of each other
 * */
public class PermutationComapre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="123123";
		String s2= "112233";
		int l1=s1.length();
		int l2=s2.length();
		if (l1!= l2){
			System.out.println("Not a permutation");
			System.exit(1);
		}
		int char_count[] = new int[128];
		for (int i =0;i < l1;i++)
			char_count[s1.charAt(i)]+=1;
		for (int i =0;i < l1;i++){
			char_count[s2.charAt(i)]--;  
			if(char_count[s2.charAt(i)] < 0){
				System.out.println("Not a permuatation");
				System.exit(1);
			}
		}
		System.out.println("Its a permutation");
			
	}

}
