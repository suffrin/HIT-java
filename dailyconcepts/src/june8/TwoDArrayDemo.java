package june8;
public class TwoDArrayDemo {
	public static void main(String[] args) {
		//int mark[]= new int[5];
		//for(int i=0; i<mark.length;i++) {
		//	System.out.println(mark[i]);
		//}
		int twod[][]={
				{22,33,44,55}, 
				{34,43,54,55}, {23,45,66,90}
		};
		//int twod[][]= new int[2][2];
		for(int i=0; i<twod.length;i++) {
			for(int j=0; j<twod[i].length;j++) {
					System.out.printf("%d ",twod[i][j]);
			}
		System.out.println( );	
		}
		int unevenarray[][]= {  //uneven multidimensional array
				{12,34,56},
				{56,23},
				{55,88,99,12}
		};	
		System.out.println("Entering unarray multidimensional array" );
		for(int i[]:unevenarray) {
			for(int k:i) {
				System.out.print(k+"  ");
			}
			System.out.println();
		}
		System.out.println("haii..." );
		int unevenarray1[][]=new int[3][];
		unevenarray1[0]=new int[3];
		unevenarray1[1]=new int[5];
		unevenarray1[2]=new int[2];
		for(int i[]:unevenarray1) {
			for(int k:i) {
				System.out.print(k+"  ");
			}
			System.out.println();
		}
	}
}