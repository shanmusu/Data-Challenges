
/**
 *insert %20 in to the space in string 
 *String is immutable. So use it as character array
 */
 
public class InsertSymbolInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "asde gb h ";
		int space_cont=0;
		char string[]=sample.toCharArray();
		for(int i =0;i<sample.length();i++){
			if(string[i]==' ')
				space_cont++;
		}
		System.out.println(space_cont);
		int new_count = string.length+space_cont*2;
		//create new character array
	char new_string[] =new char[new_count];
		int k=0;
		for(int i =0; i < string.length;i++){
			if(string[i]==' '){
				new_string[k] =  '%';
				new_string[k+1] ='2';
				new_string[k+2] ='0';
				k+=3;
			}
			else{
				new_string[k] = string[i];
				k+=1;
			}
		}
	System.out.println(new_string);

	/*			string[new_count]='\0';
		for(int i =string.length; i >=0;i--){
			if(string[i]==' '){
				string[new_count-1] ='%';
				string[new_count-2] ='2';
				string[new_count-3] ='0';
				new_count-=3;
				
			}
			else{
				string[new_count-1] = string[i];
				new_count-=1;
			}
		}
		System.out.println(string);
	*/
	}

}
