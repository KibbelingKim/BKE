
public class BoardState {

	public int var2;
	
	Rveld rV1 = new Rveld(1, '1', 1);
	Rveld rV2 = new Rveld(2, '2', 2);
	Rveld rV3 = new Rveld(3, '3', 3);
	Rveld rV4 = new Rveld(4, '6', 6);
	Rveld rV5 = new Rveld(5, '9', 9);
	Rveld rV6 = new Rveld(6, '8', 8);
	Rveld rV7 = new Rveld(7, '7', 7);
	Rveld rV8 = new Rveld(8, '4', 4);
	Rveld rV9 = new Rveld(9, '5', 5);
	
	private char pos1 = rV1.getChar();
	private char pos2 = rV2.getChar();
	private char pos3 = rV3.getChar();
	private char pos4 = rV4.getChar();
	private char pos5 = rV5.getChar();
	private char pos6 = rV6.getChar();
	private char pos7 = rV7.getChar();
	private char pos8 = rV8.getChar();
	private char posM = rV9.getChar();

		public BoardState(char pos1, char pos2, char pos3, char pos4, char pos5, char pos6, char pos7, char pos8, char posM){
			
			this.pos1 = pos1;
			this.pos2 = pos2;
			this.pos3 = pos3;
			this.pos4 = pos4;
			this.pos5 = pos5;
			this.pos6 = pos6;
			this.pos7 = pos7;
			this.pos8 = pos8;
			this.posM = posM;
			
		}
		
		public void printBs(){
				
		if(var2 == 0){	
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nReal:\n");
		System.out.println("    " + pos1 + " | " + pos2 + " | " + pos3 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos8 + " | " + posM + " | " + pos4 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos7 + " | " + pos6 + " | " + pos5 + " ");
		System.out.println("\n");
		}
		
		else if(var2 == 2){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nReal:\n");
		System.out.println("    " + pos7 + " | " + pos8 + " | " + pos1 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos6 + " | " + posM + " | " + pos2 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos5 + " | " + pos4 + " | " + pos3 + " ");
		System.out.println("\n");
		}
			
		else if(var2 == 4){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nReal:\n");
		System.out.println("    " + pos5 + " | " + pos6 + " | " + pos7 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos4 + " | " + posM + " | " + pos8 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos3 + " | " + pos2 + " | " + pos1 + " ");
		System.out.println("\n");	
		}
		
		else if(var2 ==6){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nReal:\n");
		System.out.println("    " + pos3 + " | " + pos4 + " | " + pos5 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos2 + " | " + posM + " | " + pos6 + " ");
		System.out.println("   ---+---+---");
		System.out.println("    " + pos1 + " | " + pos8 + " | " + pos7 + " ");
		System.out.println("\n");
		}
			}
		
		}

