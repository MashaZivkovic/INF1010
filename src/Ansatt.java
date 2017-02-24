
public abstract class Ansatt extends Person{
	private double timesLonn;
	
	public Ansatt(String nvn, int ald, double timLon){
		super(nvn, ald);
		this.timesLonn = timLon;
	}
}
