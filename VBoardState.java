
public class VBoardState {
	


	private char pos1;
	public char pos2;
	public char pos3;
	public char pos4;
	public char pos5;
	public char pos6;
	public char pos7;
	public char pos8;
	public char posM;
	
	public int num1;
	public int num2;
	public int num3;
	public int num4;
	public int num5;
	public int num6;
	public int num7;
	public int num8;
	public int numM;
	
	public char var1;
	public int var2;
	
	
	public VBoardState(char pos1, char pos2, char pos3, char pos4, char pos5, char pos6, char pos7, char pos8, char posM, char var1, int var2){
		
		this.pos1 = pos1;
		this.pos2 = pos2;
		this.pos3 = pos3;
		this.pos4 = pos4;
		this.pos5 = pos5;
		this.pos6 = pos6;
		this.pos7 = pos7;
		this.pos8 = pos8;
		this.posM = posM;
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		this.num7 = num7;
		this.num8 = num8;
		this.numM = numM;
		
		this.var1 = var1;
		this.var2 = var2;
		
	}
	
	public void printBs(){
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nVirtual:\n");
		System.out.println("    " + pos1 + " | " + pos2 + " | " + pos3 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos8 + " | " + posM + " | " + pos4 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos7 + " | " + pos6 + " | " + pos5 + " ");
		System.out.println("\n");
		System.out.println("var1: " + var1 + " var2: " + var2);
		
		
		}
	
	public void transform(){
		int new1 = this.num1 + var2;
		int new2 = this.num2 + var2;
		int new3 = this.num3 + var2;
		int new4 = this.num4 + var2;
		int new5 = this.num5 + var2;
		int new6 = this.num6 + var2;
		int new7 = this.num7 + var2;
		int new8 = this.num8 + var2;
		int newM = this.numM;
		
//		BoardState newBS = new BoardState(new1, new2, new3, new4, new5, new6, new7, new8, newM);
			
	}
	
	
	
}
