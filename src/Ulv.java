
public class Ulv implements Rovdyr{
	private String name;
	private boolean jakt;

	public Ulv(String name, boolean jakt){
		this.name = name;
		this.jakt = jakt;
	}
	@Override
	public boolean jakt() {
		if(this.jakt){
			System.out.println("Denne ulven jakter");
			return true;
		} else {
			System.out.println("Denne ulven jakter ikke");
			return false;
		}
	}
}
