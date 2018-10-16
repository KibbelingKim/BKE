
public class BoardState {

	public char vak1;
	public char vak2;
	public char vak3;
	public char vak4;
	public char vak5;
	public char vak6;
	public char vak7;
	public char vak8;
	public char vakM;
	
	public BoardState(char v1, char v2, char v3, char v4, char v5, char v6, char v7, char v8, char vM){	
		this.vak1 = v1;
		this.vak2 = v2;
		this.vak3 = v3;
		this.vak4 = v4;
		this.vak5 = v5;
		this.vak6 = v6;
		this.vak7 = v7;
		this.vak8 = v8;
		this.vakM = vM;
	}
	
	public void printBs(int var1){
		if(var1 == 0){
		System.out.println();
		System.out.println("    " + vak1 + " | " + vak2 + " | " + vak3 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak8 + " | " + vakM + " | " + vak4 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak7 + " | " + vak6 + " | " + vak5 + " ");
		System.out.println();
		}
		else if(var1 == 2){
		System.out.println();
		System.out.println("    " + vak7 + " | " + vak8 + " | " + vak1 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak6 + " | " + vakM + " | " + vak2 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak5 + " | " + vak4 + " | " + vak3 + " ");
		System.out.println();
		}
		else if(var1 == 4){
		System.out.println();
		System.out.println("    " + vak5 + " | " + vak6 + " | " + vak7 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak4 + " | " + vakM + " | " + vak8 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak3 + " | " + vak2 + " | " + vak1 + " ");
		System.out.println();
		}
		else if(var1 == 6){
		System.out.println();
		System.out.println("    " + vak3 + " | " + vak4 + " | " + vak5 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak2 + " | " + vakM + " | " + vak6 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + vak1 + " | " + vak8 + " | " + vak7 + " ");
		System.out.println();
		}
		
	}
	
}
