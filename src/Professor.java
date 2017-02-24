
public class Professor extends Forsker{
	String underviserKurs;
	
	public Professor(String nvn, int ald, double timlon, String fagOm, String kurs){
		super(nvn, ald, timlon, fagOm);
		this.underviserKurs = kurs;
		
	}
}
