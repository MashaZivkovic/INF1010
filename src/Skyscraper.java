
public class Skyscraper extends Byggning{
	private String tekst;
	private double brutoAreal;
	private int antallEtasjer;
	
	public Skyscraper(String tekst, double bru, int antEt){
		super(tekst, bru);
		this.brutoAreal = bru;
		this.antallEtasjer = antEt;
		
	}
	public String getTekst(){
		return tekst;
	}
	Byggning s = new Skyscraper("fgg", 56, 89);
	//d)ja
	
}
