
public class BachelorStudent extends Student{
	private int begrensetInngang;
	public  BachelorStudent(String nvn, int ald, String klassenavn, String larested, int inngang){
		super(nvn, ald, klassenavn, larested);
		this.begrensetInngang = inngang;
	}
}
