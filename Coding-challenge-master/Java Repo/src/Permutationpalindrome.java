
/*
 * Check if a permutation of string is a palindrome
 * 
 * - count of character should be even and only one character can be odd so the final condition for odd count should be <=1  
 * 
 * */
public class Permutationpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample= "taicol j taicol";
		int odd=0;
		int count_table[] = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
		for (char i : sample.toCharArray()){
			if(i !=' '){
				int val= Character.getNumericValue(i);
				
				if (val>= Character.getNumericValue('a') && val<=Character.getNumericValue('z'))
					val =val-Character.getNumericValue('a');
				else if(val>= Character.getNumericValue('A') && val<=Character.getNumericValue('Z'))
					val =val-Character.getNumericValue('A');
				count_table[val]+=1;
				
				if(count_table[val] % 2 == 1)
					odd+=1;
				else
					odd-=1;	
				//System.out.println(odd);
			}
		}

		System.out.println((odd <=1 )? "permutable":"not permutable");
	}



}
