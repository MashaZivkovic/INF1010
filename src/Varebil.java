import java.util.Scanner;

public class Varebil extends Kjoretoy{
	int vekt;
	
	public Varebil(String regNr, String fabMerke, String eieren, int vekten){
		super(regNr, fabMerke, eieren);
		this.vekt = vekten;
	}
	public Varebil(){
		
	}
	public int beregnAarsAvgift(){
		return 4 * vekt;
	}
	public void lesInnData(Scanner in){
		super.lesInnData(in);
		System.out.println("Hva er maks vekt? : ");
		String v = in.nextLine();
		vekt = Integer.parseInt(v);		
	}
	public void skrivUtData(){
		super.skrivUtData();
		System.out.println("Maks vekt: " + vekt);
	}
	
}
