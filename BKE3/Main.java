import java.util.Scanner;

public class Main {	
	Scanner inScan = new Scanner(System.in);
	Veld p1 = new Veld('1');
	Veld p2 = new Veld('2');
	Veld p3 = new Veld('3');
	Veld p4 = new Veld('6');
	Veld p5 = new Veld('9');
	Veld p6 = new Veld('8');
	Veld p7 = new Veld('7');
	Veld p8 = new Veld('4');
	Veld pM = new Veld('5');

/*
	void geefWeer(){
		int var1 = 0;
		if(var1 == 2){
			draaiN();
		}
		else if(var1 == 4){
			draaiN();
			draaiN();
		}
		else if(var1 == 6){
			draaiN();
			draaiN();
			draaiN();
		}
		printBs();
	}
*/
	
	char inputCheck(){
		char input = '?';
		boolean ipVer = false;
		while(ipVer == false){
			input = inScan.next().charAt(0);
			if((input != p1.getWaarde() && input != p2.getWaarde() && input != p3.getWaarde() && input != p4.getWaarde() 
					&& input != p5.getWaarde() && input != p6.getWaarde() && input != p7.getWaarde() && input != p8.getWaarde() 
					&& input != pM.getWaarde()) | input == 'X' | input == 'O'){
				System.out.println("Je invoer kwam niet overeen met een beschikbare optie.\nProbeer opnieuw!");
			}	
			else{
				ipVer = true;
			}
		}
		return input;
	}
	
	void makeMove(char ip){
		if(ip == p1.getWaarde()){
			p1.setWaarde('X');
		}
		else if(ip == p2.getWaarde()){
			p2.setWaarde('X');
		}
		else if(ip == p3.getWaarde()){
			p3.setWaarde('X');
		}
		else if(ip == p4.getWaarde()){
			p4.setWaarde('X');
		}
		else if(ip == p5.getWaarde()){
			p5.setWaarde('X');
		}
		else if(ip == p6.getWaarde()){
			p6.setWaarde('X');
		}
		else if(ip == p7.getWaarde()){
			p7.setWaarde('X');
		}
		else if(ip == p8.getWaarde()){
			p8.setWaarde('X');		
		}
		else if(ip == pM.getWaarde()){
			pM.setWaarde('X');
		}	
	}
	
	public void draaiN(){
		char oud1 = p1.getWaarde();
		char oud2 = p2.getWaarde();
		char oud3 = p3.getWaarde();
		char oud4 = p4.getWaarde();
		char oud5 = p5.getWaarde();
		char oud6 = p6.getWaarde();
		char oud7 = p7.getWaarde();
		char oud8 = p8.getWaarde();
		p1.setWaarde(oud7);
		p2.setWaarde(oud8);
		p3.setWaarde(oud1);
		p4.setWaarde(oud2);
		p5.setWaarde(oud3);
		p6.setWaarde(oud4);
		p7.setWaarde(oud5);
		p8.setWaarde(oud6);
	}
	
	char botLC(){
		char botLChar = '#';
		boolean fin = false;
		for(int i = 0; i < 4; i++){
			if(p1.getWaarde() == 'O' && p2.getWaarde() == 'O' && p3.getWaarde() != 'O' && p3.getWaarde() != 'X' && fin == false){
				botLChar = p3.getWaarde();
				p3.setWaarde('O');
				fin = true;
			}
			else if(p1.getWaarde() == 'O' && pM.getWaarde() == 'O' && p5.getWaarde() != 'O' && p5.getWaarde() != 'X' && fin == false){
				botLChar = p5.getWaarde();
				p5.setWaarde('O');
				fin = true;
			}		
			else if(p1.getWaarde() == 'O' && p8.getWaarde() == 'O' && p7.getWaarde() != 'O' && p7.getWaarde() != 'X' && fin == false){
				botLChar = p7.getWaarde();
				p7.setWaarde('O');
				fin = true;
			}
			else if(p1.getWaarde() == 'O' && p3.getWaarde() == 'O' && p2.getWaarde() != 'O' && p2.getWaarde() != 'X' && fin == false){
				botLChar = p2.getWaarde();
				p2.setWaarde('O');
				fin = true;
			}
			else if(p1.getWaarde() == 'O' && p5.getWaarde() == 'O' && pM.getWaarde() != 'O' && pM.getWaarde() != 'X' && fin == false){
				botLChar = pM.getWaarde();
				pM.setWaarde('O');
				fin = true;
			}
			else if(p2.getWaarde() == 'O' && p6.getWaarde() == 'O' && pM.getWaarde() != 'O' && pM.getWaarde() != 'X' && fin == false){
				botLChar = pM.getWaarde();
				pM.setWaarde('O');
				fin = true;
			}
			else if(p2.getWaarde() == 'O' && pM.getWaarde() == 'O' && p6.getWaarde() != 'O' && p6.getWaarde() != 'X' && fin == false){
				botLChar = p6.getWaarde();
				p6.setWaarde('O');
				fin = true;
			}
			draaiN();
		}
		return botLChar;
	}
	
	char enemyLC(){		
		char enemyLChar = '#';
		for(int i = 0; i < 4; i++){
			if(p1.getWaarde() == 'X' && p2.getWaarde() == 'X' && p3.getWaarde() != 'O'){
				enemyLChar = p3.getWaarde();
				p3.setWaarde('O');
			}
			else if(p1.getWaarde() == 'X' && pM.getWaarde() == 'X' && p5.getWaarde() != 'O'){
				enemyLChar = p5.getWaarde();
				p5.setWaarde('O');
			}
			else if(p1.getWaarde() == 'X' && p8.getWaarde() == 'X' && p7.getWaarde() != 'O'){
				enemyLChar = p7.getWaarde();
				p7.setWaarde('O');
			}
			else if(p1.getWaarde() == 'X' && p3.getWaarde() == 'X' && p2.getWaarde() != 'O'){
				enemyLChar = p2.getWaarde();
				p2.setWaarde('O');
			}
			else if(p1.getWaarde() == 'X' && p5.getWaarde() == 'X' && pM.getWaarde() != 'O'){
				enemyLChar = pM.getWaarde();
				pM.setWaarde('O');
			}
			else if(p2.getWaarde() == 'X' && p6.getWaarde() == 'X' && pM.getWaarde() != 'O'){
				enemyLChar = pM.getWaarde();
				pM.setWaarde('O');
			}
			else if(p2.getWaarde() == 'X' && pM.getWaarde() == 'X' && p6.getWaarde() != 'O'){
				enemyLChar = p6.getWaarde();
				p6.setWaarde('O');
			}		
			draaiN();
		}
		return enemyLChar;
	}

	char makeAny(){
		char anyChar = '#';
		for(int i = 0; i < 4; i++){
			if(anyChar == '#' && p4.getWaarde() != 'X' && p4.getWaarde() != 'O'){
			anyChar = p4.getWaarde();
			p4.setWaarde('O');	
			}
			draaiN();
		}
		for(int ii = 0; ii < 4; ii++){
			if(anyChar == '#' && p5.getWaarde() != 'X' && p5.getWaarde() != 'O'){
				anyChar = p5.getWaarde();
				p5.setWaarde('O');
			}
			draaiN();
		}
		return anyChar;
	}
	
	
	public static void main(String[] args) {
		Main main1 = new Main();
		
//weergave eerste board (leeg)
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\nTijd om een potje boter kaas en eieren te spelen...");
		BoardState bs1 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
				main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
		bs1.printBs(0);
		System.out.println("Kies!");
		char input1 = main1.inputCheck();	
//input
		
		char optie1 = '0';
		int var1 = 0;
		
//bepalen optie1 (Hoek, Kant of Midden)
		if(input1 == '1' | input1 == '3' | input1 == '9' | input1 == '7'){
			optie1 = 'H';
		}
		else if(input1 == '2' | input1 == '6' | input1 == '8' | input1 == '4'){
			optie1 = 'K';
		}
		else if(input1 == '5'){
			optie1 = 'M';
		}
		
//bepalen var1 (input rotatie (2 komt overeen met 90 graden, 4 met 180, 6 met 270))
		if(input1 == '1' | input1 == '2' | input1 == '5'){
			var1 = 0;
		}
		else if(input1 == '3' | input1 == '6'){
			var1 = 2;
		}
		else if(input1 == '9' | input1 == '8'){
			var1 = 4;
		}
		else if(input1 == '7' | input1 == '4'){
			var1 = 6;
		}
		
//draaien naar virtual board		
		if(var1 == 2){
			main1.draaiN();
			main1.draaiN();
			main1.draaiN();
		}
		else if(var1 == 4){
			main1.draaiN();
			main1.draaiN();
		}
		else if(var1 == 6){
			main1.draaiN();
		}
		
		char botMove1 = '?';
		
//maken van eerste move van zowel speler als bot		
		if(optie1 == 'H'){
			main1.p1.setWaarde('X');
			botMove1 = main1.pM.getWaarde();
			main1.pM.setWaarde('O');
		}
		else if(optie1 == 'K'){
			main1.p2.setWaarde('X');
			botMove1 = main1.pM.getWaarde();
			main1.pM.setWaarde('O');
		}
		else if(optie1 == 'M'){
			main1.pM.setWaarde('X');
			botMove1 = main1.p1.getWaarde();
			main1.p1.setWaarde('O');
		}
		
//weergave tweede board (na eerste move)
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Jij koos " + input1 + ", ik kies " + botMove1 + "...");
		BoardState bs2 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
				main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
		bs2.printBs(var1);
		System.out.println("Kies!");
		char input2 = main1.inputCheck();
//input		
		
//maken van tweede move van speler
		main1.makeMove(input2);
		
//enemy lethal-check en zo nodig maken van tweede move van bot
		char botMove2 = main1.enemyLC();

//maken van tweede move van bot wanneer enemy lethal-check negatief was
		if(botMove2 == '#'){
			for(int ii = 0; ii < 4; ii++){
				if(main1.p2.getWaarde() == 'X' && main1.p4.getWaarde() == 'X'){
					botMove2 = main1.p3.getWaarde();
					main1.p3.setWaarde('O');
				}
				main1.draaiN();
			}
		}
		
		if(botMove2 == '#'){
			for(int ii = 0; ii < 4; ii++){
				if(main1.p1.getWaarde() == 'X' && main1.p5.getWaarde() == 'X' && main1.p6.getWaarde() != 'O'){
					botMove2 = main1.p2.getWaarde();
					main1.p2.setWaarde('O');
				}
				main1.draaiN();
			}
		}
		
		if(botMove2 == '#'){
			for(int ii = 0; ii < 4; ii++){
				if(main1.p1.getWaarde() != 'X' && main1.p1.getWaarde() != 'O' && main1.p5.getWaarde() != 'X'){
					botMove2 = main1.p1.getWaarde();				
					main1.p1.setWaarde('O');	
				}
				main1.draaiN();
			}
		}	
							
//weergave derde board (na tweede move)		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Jij koos " + input2 + ", ik kies " + botMove2 + "...");
		BoardState bs3 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
				main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
		bs3.printBs(var1);
		System.out.println("Kies!");
		char input3 = main1.inputCheck();
//input
		
//maken van derde move van speler
		main1.makeMove(input3);
		
//bot lethal-check en zo mogelijk enden van game
		char botMove3 = main1.botLC();
		if(botMove3 != '#'){
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Jij koos " + input3 + ", ik kies " + botMove3 + "...");
			System.out.println("BOTER KAAS EN EIEREN");
			BoardState bsE1 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
					main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
			bsE1.printBs(var1);
			System.out.println("Verloren tegen een bot met boter kaas en eieren...\nGa je schamen!");
			System.exit(0);
		}				
		
//enemy lethal-check en zo nodig maken van derde move van bot
		botMove3 = main1.enemyLC();
		
//anyMove
		if(botMove3 == '#'){
			botMove3 = main1.makeAny();
		}
			
//weergave vierde board (na derde move)
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Jij koos " + input3 + ", ik kies " + botMove3 + "...");
		BoardState bs4 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
				main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
		bs4.printBs(var1);
		System.out.println("Kies!");
		char input4 = main1.inputCheck();
//input
		
//maken van vierde move van speler
				main1.makeMove(input4);
		
//bot lethal-check en zo mogelijk enden van game
		char botMove4 = main1.botLC();
		if(botMove4 != '#'){
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Jij koos " + input3 + ", ik kies " + botMove4 + "...");
			System.out.println("BOTER KAAS EN EIEREN");
			BoardState bsE2 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
					main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
			bsE2.printBs(var1);
			System.out.println("Verloren tegen een bot met boter kaas en eieren...\nGa je schamen!");
			System.exit(0);
		}
		


//enemy lethal-check en zo nodig maken van vierde move van bot
		botMove4 = main1.enemyLC();
		
//anyMove
		if(botMove4 == '#'){
			botMove4 = main1.makeAny();
		}
		
//weergave vijfde board (na vierde move)
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Jij koos " + input4 + ", ik kies " + botMove4 + "...");
		BoardState bs5 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
				main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
		bs5.printBs(var1);
		System.out.println("Kies!");
		char input5 = main1.inputCheck();
//input
		
//maken van vijfde move van speler
		main1.makeMove(input5);
		
//weergave zesde en laatste board (na vijfde move van speler die het board vol maakt)
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Jij koos " + input4 + ", ik kies " + botMove4 + "...");
		BoardState bs6 = new BoardState(main1.p1.getWaarde(), main1.p2.getWaarde(), main1.p3.getWaarde(), main1.p4.getWaarde(), 
				main1.p5.getWaarde(), main1.p6.getWaarde(), main1.p7.getWaarde(), main1.p8.getWaarde(), main1.pM.getWaarde());
		bs6.printBs(var1);
		System.out.println("Alle velden zijn bezet...");
		System.out.println("Gelijk spel :(");
		System.exit(0);
			
	}		
	
}	

/*
 *
 * 
 * bot lethal check, enemy lethal check, any move
 * 
 * spiegelen?
 * 
 * terug roteren voordat print method wordt aangeroepen (geen if else gedoe in BoardState class).
 * 
 * method maken van digen die vaker terug komen.
 * 
 * Maar ook al heeft de bot niet direct lethal, hij heeft misschien wel een 2-turn guaranteed lethal. Denk hier over na!!!
 * Ik weet niet zeker of het mogelijk is dat de speler al een fatale fout heeft gemaakt (multi-turn-guaranteed-lethal)...
 * ...Denkt het wel!!! Dit is belangrijk!!! Op deze manier kan de bot de speler echt outplayen!!!!!
 * zo mogelijk moet de bot wel de best case scenario's open houden lijkt me.
 */
