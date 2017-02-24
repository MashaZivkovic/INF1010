import java.util.Scanner;

public class Personbil extends Kjoretoy{
	int sittePlass;

	public Personbil(String regNr, String fabMerke, String eieren, int sittePlasser){
		super(regNr,fabMerke,eieren);
		this.sittePlass = sittePlasser;
	}
	public Personbil(){
		
	}
	public int beregnAaravgift(){
		return 3000;
	}
	public void lesInnData(Scanner in){
		super.lesInnData(in);
		System.out.println("Hva er antall seter? : ");
		String seter = in.nextLine();
		sittePlass = Integer.parseInt(seter);		
	}
	public void skrivUtData(){
		super.skrivUtData();
		System.out.println("Antall seter: " + sittePlass);
	}
	public void skrivUtAarsavgift(){
		System.out.println("Aarsavgift er: " + aarsavgift);
		
	}
}
