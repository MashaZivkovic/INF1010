
public class Forsker extends Ansatt {
	private String fagomraade;
	
	public Forsker(String nvn, int ald,double timlon, String fagOm){
		super(nvn, ald, timlon);
		this.fagomraade = fagOm;
	}
}
