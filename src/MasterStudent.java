
public class MasterStudent extends Student{
	private int friInngang;
	
	public MasterStudent(String nvn, int ald, String klasseNavn, String larested, int inngang){
		super(nvn, ald, klasseNavn, larested);
		this.friInngang = inngang;
	}
}
