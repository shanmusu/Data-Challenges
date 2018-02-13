
public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find if a string has all unique characters
		// With DS - Hash map
		// without DS O(n) complexity
		
		String sample = "asdegbh";
		char s[] =sample.toCharArray();
		boolean arr[]= new boolean[128];
		int flag=0;
		for(int i=0; i < s.length;i++){
			int pos = sample.charAt(i);
			if(arr[pos]){
				System.out.println("NOT UNIQUE");
				flag=1;
				break;
			}
			else{
				arr[pos] = true;
			}
		}
		if (flag==0)
			System.out.println("String is unique");
	}

}
