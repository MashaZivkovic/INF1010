
public abstract class Student extends Person {
	private String klass;
	private String larested;
	
	public Student(String nvn, int ald, String klassenavn, String larestedet){
		super(nvn, ald);
		this.klass = klassenavn;
		this.larested = larestedet;
		
	}
}
