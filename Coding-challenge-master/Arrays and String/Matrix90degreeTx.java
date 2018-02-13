import java.util.Scanner;

public class Matrix90degreeTx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Matrix ROW X COLUMN count N:");
		int N = sc.nextInt();
		int matrix[][] = new int[N][N];
		for(int i=0;i<N;i++){
			for (int j=0; j<N;j++ ){
				matrix[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		matrix=transformation(matrix, N);
	    System.out.println();
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}

	private static int[][] transformation(int[][] matrix,int N) {
		// TODO Auto-generated method stub
		//identify number of layer if N=4 then no. of inner layer will be 1 similarly N=3 then inner layer will have 1
		//I need to loop through each layer
		
		for (int layer= 0; layer< N/2;layer++){
			/*
			 * For each layer I need 3 things to do the 90degree swap			 * 
			 * First of each layer - just the layer number
			 * Last of each layer
			 * offset for transformation
			 * */
		
			int first=layer;
			int last =N -1-layer; //N-1 is fixed for 0-1-2-3 for inner layer N-1-layer (think only the last element) 
			
			for (int i=first;i<last;++i){
				int offset= i-first;
				//keep the 1st element in temp
				int top= matrix[first][i];
				//left to top
				matrix[first][i] = matrix[last-offset][first];
				//bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];
				//right to left
				matrix[last][last-offset]=  matrix[i][last];
				//top to right
				matrix[i][last]= top;

			}
		}
		return matrix;
	}
	
}
