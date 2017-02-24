import java.util.Scanner;

public abstract class Kjoretoy {

	String registreringsNummer;
	String fabrikkMerke;
	String eierensNavn;
	
	int aarsavgift;
	
	public Kjoretoy(String regNr, String fabMerke, String eieren){
		this.registreringsNummer = regNr;
		this.fabrikkMerke = fabMerke;
		this.eierensNavn = eieren;
	}
	public Kjoretoy(){
		
	}
	public void lesInnData(Scanner in){
		System.out.println("Hva er registreringsnummer?: ");
		registreringsNummer = in.nextLine();
		System.out.println("Hva er fabrikk merke?: ");
		fabrikkMerke = in.nextLine();
		System.out.println("Hva er eierens navn?: ");
		eierensNavn = in.nextLine();		
	}
	public void skrivUtData(){
		System.out.println("Registreringsnummer: " + registreringsNummer);
		System.out.println("Fabrikk merke: " + fabrikkMerke);
		System.out.println("Eierens navn: " + eierensNavn);
	}
	public String getRegNr(){
		return registreringsNummer;
	}
	public String infoOmFabrikkMerke(){
		System.out.println("Fabrikkmerke er: " + fabrikkMerke);
		return fabrikkMerke;
		
	}
	public String getNavn(){
		System.out.println("Eierens navn er: " + eierensNavn);
		return eierensNavn;
	}
	public int beregnAaravgift() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
