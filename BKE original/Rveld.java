
public class Rveld {
	
 
	private int rPos;
//Probleem is dat ik de volgende variabele juist niet static wil hebben maar dan geeft ie een error...
	private char rChar;
	private char gUI;
	
	public char getChar(){
		return rChar;
	}
	
	public void setChar(char c){
		rChar = c;
	}
	
	public void setrPos(int i){
		rPos = i;
	}
	
	public int getGUI(){
		return gUI;
	}
	
	public Rveld(int rPos, char rChar, int gUI){
		
		this.rPos = rPos;
		this.rChar = rChar;

	
}
	
//	public char geefChar(){
//		answer = this.rChar;
//		return answer;
//	}

}