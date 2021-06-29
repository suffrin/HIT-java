package june15;
public class PBRArrayDemo {
	static int classVariable;//class variable
	int instanceVariable;//instance variable
	static int arr[]=new int[5];
	int array[]=new int[5];
	public static void main(String[] args) {
		System.out.println(classVariable);
		PBRArrayDemo pba=new PBRArrayDemo();
		System.out.println(pba.instanceVariable);
		
		int localVariable=0;//local variable -- local variables are not initialized by default...
		System.out.println(localVariable);
		
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i:pba.array) {
			System.out.print(i+"\t");
		}
		System.out.println();
		int localArray[]=new int[5];//arrays are initialised by default even if they are locally declared
		for(int i:localArray) {
			System.out.print("\tlocal..:"+i);
		}
		
	}
}