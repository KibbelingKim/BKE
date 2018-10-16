
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner inScan = new Scanner(System.in);
		
		Rveld rV1 = new Rveld(1, '1', 1);
		Rveld rV2 = new Rveld(2, '2', 2);
		Rveld rV3 = new Rveld(3, '3', 3);
		Rveld rV4 = new Rveld(4, '6', 6);
		Rveld rV5 = new Rveld(5, '9', 9);
		Rveld rV6 = new Rveld(6, '8', 8);
		Rveld rV7 = new Rveld(7, '7', 7);
		Rveld rV8 = new Rveld(8, '4', 4);
		Rveld rV9 = new Rveld(9, '5', 5);
		
		char pos1 = rV1.getChar();
		char pos2 = rV2.getChar();
		char pos3 = rV3.getChar();
		char pos4 = rV4.getChar();
		char pos5 = rV5.getChar();
		char pos6 = rV6.getChar();
		char pos7 = rV7.getChar();
		char pos8 = rV8.getChar();
		char posM = rV9.getChar();
		
		BoardState bS0 = new BoardState(pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,posM);
		bS0.printBs();
		System.out.println("Kies!");
		int input1 = inScan.next().charAt(0);
	
		char var1 = '0';
		int var2;

//Bepalen van rotatie var2
		if(input1 == '1' | input1 == '2' | input1 == 'M') {
			var2 = 0;
		}
		else if(input1 == '3' | input1 == '6') {
			var2 = 2;
		}
		else if(input1 == '9' | input1 == '8') {
			var2 = 4;
		}
		else if(input1 == '7' | input1 == '4') {
			var2 = 6;
		}
		
		Vveld vv1 = new Vveld(1, '1');
		Vveld vv2 = new Vveld(2, '2');
		Vveld vv3 = new Vveld(3, '3');
		Vveld vv4 = new Vveld(4, '4');
		Vveld vv5 = new Vveld(5, '5');
		Vveld vv6 = new Vveld(6, '6');
		Vveld vv7 = new Vveld(7, '7');
		Vveld vv8 = new Vveld(8, '8');
		Vveld vv9 = new Vveld(9, '9');

//Bepalen van optie var1
		if(input1 == '5') {
			var1 = 'M';
			BoardState rBSM = new BoardState('O','2','3','4','5','6','7','8','X');
			rBSM.printBs();
		}
		else if(input1 == '1' | input1 == '3' | input1 == '9' | input1 == '7') {
			var1 = 'H';
			vv1.setvChar('X');
			vv9.setvChar('O');		
			BoardState rBSH = new BoardState('X','2','3','4','5','6','7','8','O');
			rBSH.printBs();
		}
		else if(input1 == '2' | input1 == '6' | input1 == '8' | input1 == '4') {
			var1 = 'K';
			vv2.setvChar('X');
			vv9.setvChar('O');
			BoardState rBSK = new BoardState('1','X','3','4','5','6','7','8','O');
			rBSK.printBs();
		}
		
		int vPos1 =  vv1.getvPos();
		int vPos2 =  vv2.getvPos();
		int vPos3 =  vv3.getvPos();
		int vPos4 =  vv4.getvPos();
		int vPos5 =  vv5.getvPos();
		int vPos6 =  vv6.getvPos();
		int vPos7 =  vv7.getvPos();
		int vPos8 =  vv8.getvPos();
		int vPos9 =  vv9.getvPos();		
		
		int rPos1 = vv1.transform();
		int rPos2 = vv1.transform();
		int rPos3 = vv1.transform();
		int rPos4 = vv1.transform();
		int rPos5 = vv1.transform();
		int rPos6 = vv1.transform();
		int rPos7 = vv1.transform();
		int rPos8 = vv1.transform();
		int rPos9 = vv1.transform();
		

		
		System.out.println("Kies!");
		int input2 = inScan.next().charAt(0);
		
		}
		
	}
