
public class Vveld {
	
	private int vPos;
	private char vChar;	
	private int var2;
	private int rPos;
	
	public void setvPos(int vP){
		vPos = vP;
	}
	
	public void setvChar(char vC){
		vChar = vC;
	}
	
	public int getvPos(){
		return vPos;
	}
	
	public char getvChar(){
		return vChar;
	}
	
	public Vveld(int vPos, char vChar){
		
		this.vPos = vPos;
		this.vChar = vChar;
		
		
		
	}


	public int transform(){
		rPos = this.vPos + var2;
		return rPos;
	}
	
}
