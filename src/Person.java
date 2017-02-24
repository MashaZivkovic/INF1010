
public class Person implements Comparable<Person> {

	private String navn;
	private int alder;

	public Person(String navn, int alder){

		this.navn = navn;
		this.alder = alder;

	}
	@Override
	public int compareTo(Person o) {

		if(this.alder < o.alder){
			return 1;
		}else if(this.alder > o.alder){
			return -1;
		}else{
			return 0;
		}
	}
	
	public int getAlder(){
		return alder;
	}
	
	public String getNavn(){
		return navn;
	}

}
