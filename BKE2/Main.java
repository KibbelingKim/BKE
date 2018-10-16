import java.util.Scanner;


public class Main {
	

	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner inScan = new Scanner(System.in);
		
		Veld Veld1 = new Veld('1');
		Veld Veld2 = new Veld('2');
		Veld Veld3 = new Veld('3');
		Veld Veld4 = new Veld('4');
		Veld Veld5 = new Veld('5');
		Veld Veld6 = new Veld('6');
		Veld Veld7 = new Veld('7');
		Veld Veld8 = new Veld('8');
		Veld Veld9 = new Veld('9');	
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nBoter, fucking kaas en eieren, yo!");
		
		loop1:
		for (int i = 0; i < 9999; ++i) {
			
			System.out.println("\n    " + Veld1.waarde + " | " + Veld2.waarde + " | " + Veld3.waarde);
			System.out.println("   ---+---+---");
			System.out.println("    " + Veld4.waarde + " | " + Veld5.waarde + " | " + Veld6.waarde);
			System.out.println("   ---+---+---");
			System.out.println("    " + Veld7.waarde + " | " + Veld8.waarde + " | " + Veld9.waarde);
			System.out.println("\nVoer het nummer van een veld in en toets <enter>...\n");
			char input1 = inScan.next().charAt(0);
			
			if(input1 == 'X'){
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nKeppie! 'X' betekent dat dat veld al door jou bezet is!");
				continue loop1;
			}
			else if(input1 == 'O'){
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nKeppie! 'O' betekent dat dat veld al door mij bezet is!");
				continue loop1;
			}
			else if(input1 == Veld1.waarde && Veld2.waarde == '2' && Veld3.waarde == '3' && Veld4.waarde == '4' && Veld5.waarde == '5' && Veld6.waarde == '6' && Veld7.waarde == '7' && Veld8.waarde == '8' && Veld9.waarde == '9'){
				Veld1.waarde = 'X';
				Veld5.waarde = 'O';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + ", ik kies 5!");
			}
			else if(input1 == Veld2.waarde){
				Veld2.waarde = 'X';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + "!");
			}
			else if(Veld1.waarde == '1' && Veld2.waarde == '2' && input1 == Veld3.waarde && Veld4.waarde == '4' && Veld5.waarde == '5' && Veld6.waarde == '6' && Veld7.waarde == '7' && Veld8.waarde == '8' && Veld9.waarde == '9'){
				Veld3.waarde = 'X';
				Veld5.waarde = 'O';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + ", ik kies 5!");
			}
			else if(input1 == Veld4.waarde){
				Veld4.waarde = 'X';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + "!");
			}
			else if(input1 == Veld5.waarde && Veld2.waarde == '2' && Veld3.waarde == '3' && Veld4.waarde == '4' && Veld6.waarde == '6' && Veld7.waarde == '7' && Veld8.waarde == '8' && Veld9.waarde == '9'){
				Veld5.waarde = 'X';
				Veld1.waarde = 'O';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + ", ik kies 1!");
				continue loop1;
			}
			else if(input1 == Veld6.waarde){
				Veld6.waarde = 'X';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + "!");
			}
			else if(Veld1.waarde == '1' && Veld2.waarde == '2' && Veld3.waarde == '3' && Veld4.waarde == '4' && Veld5.waarde == '5' && Veld6.waarde == '6' && input1 == Veld7.waarde && Veld8.waarde == '8' && Veld9.waarde == '9'){
				Veld7.waarde = 'X';
				Veld5.waarde = 'O';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + ", ik kies 5!");
			}
			else if(input1 == Veld8.waarde){
				Veld8.waarde = 'X';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + "!");
			}
			else if(Veld1.waarde == '1' && Veld2.waarde == '2' && Veld3.waarde == '3' && Veld4.waarde == '4' && Veld5.waarde == '5' && Veld6.waarde == '6' && Veld7.waarde == '7' && Veld8.waarde == '8' && input1 == Veld9.waarde){
				Veld9.waarde = 'X';
				Veld5.waarde = 'O';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nJij koos " + input1 + ", ik kies 5!");
			}
			else if(input1 == 'R'){
				Veld1.waarde = '1';
				Veld2.waarde = '2';
				Veld3.waarde = '3';
				Veld4.waarde = '4';
				Veld5.waarde = '5';
				Veld6.waarde = '6';
				Veld7.waarde = '7';
				Veld8.waarde = '8';
				Veld9.waarde = '9';
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAlle velden zijn gereset, yo!");
			}
			else{System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nEr is iets mis met je input!");
				
			}

								
		}
		
	}

}
