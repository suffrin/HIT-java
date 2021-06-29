package june15;
public class PbvPbr {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		System.out.println("Initial size of laddu..:"+laddu.getSize());
		
		PBV pbvObj=new PBV();
		pbvObj.modifySizeOfLaddu(laddu.size);
		
		System.out.println("Size of Laddu after PBV...:"+laddu.getSize());
		
		PBR pbrObj=new PBR();
		pbrObj.modifySizeOfLaddu(laddu);
		
		System.out.println("Sizeof Laddu after PBR...:"+laddu.getSize());
	}
}
//all primitives types, a copy is made when it is passed - viz. int,short,byte,long,char etc
//all complex types viz.laddu is always pass by reference, does not make a copy.
class PBV{
	public void modifySizeOfLaddu(int size) {
		size=size-5;
	}
}
class PBR{
	public void modifySizeOfLaddu(Laddu laddu) {
		laddu.setSize(5);
	}
}
class Laddu{
	int size;
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return this.size;
	}
}