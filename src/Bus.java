import java.util.Scanner;

public class Bus extends Kjoretoy{
	private int antPlass;
	
	public Bus(int antallPlasser, String regNr, String fabMerke, String eieren){
		super(regNr, fabMerke, eieren);
		this.antPlass = antallPlasser;
	}
	public Bus(){
		
	}
	public void lesInnData(Scanner in){
		super.lesInnData(in);
		System.out.println("Hva er antall seter? : ");
		String seter = in.nextLine();
		antPlass = Integer.parseInt(seter);		
	}
	public void skrivUtData(){
		super.skrivUtData();
		System.out.println("Antall seter: " + antPlass);
	}
	
}
