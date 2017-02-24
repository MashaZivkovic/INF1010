
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {


	private static Scanner in;
	private static File fil;
	private static int antallOrd = 5;
	private static String[] ord = new String[antallOrd];
	static Person[] personer = new Person[5];


	public static void main(String[] args){

		personer[0] = new Person("Masa", 35);
		personer[1] = new Person("Ervin", 40);
		personer[2] = new Person("Luka", 11);
		personer[3] = new Person("Veda", 2);
		personer[4] = new Person("Hanna", 16);

		finnEldstOgYngstPerson();
		
		//for(int i = 0; i < personer.length; i++){
			//ord[i] = personer[i].getNavn();
		//}
		//lesFil();
		
		ord[0] = "Ervin";
		ord[1] = "Masa";
		ord[2] = "Veda";
		ord[3] = "Luka";
		ord[4] = "Hanna";
		finnMinstOgStorstOrd();
		MinMaxBeholder m = new MinMaxBeholder();
		m.leggTil(new Person("Masa", 35));
		m.leggTil(new Person("Ervin", 40));


	}

	public static void lesFil(){

		fil = new File("ord.txt");
		try {
			in = new Scanner(fil);

		} catch (FileNotFoundException e) {
			System.out.println("Fil er ikke funnet");
			e.printStackTrace();
		}
		int index = 0;
		while(in.hasNextLine()){
			String ordene = in.nextLine();
			System.out.println(ordene);
			//for(int i = 0; i < antallOrd; i++){
			ord[index] = ordene;

			System.out.println(index + ord[index]);

			index++;

		}

	}


	public static void finnMinstOgStorstOrd(){

		String minst = ord[0]; 
		String storst = ord[0];
		for (int i = 0; i < ord.length; i++) {

			if(minst.compareToIgnoreCase(ord[i]) > 0 ){
				minst = ord[i];

			}
			if(storst.compareToIgnoreCase(ord[i]) < 0){
				storst = ord[i];
			}
		}
		System.out.println("Minste ord er:" + minst + " siden den starter paa bokstav " + minst.charAt(0)+ " og storst er: " + storst + " siden den starter paa bokstav " + storst.charAt(0));
	}


	public static void finnEldstOgYngstPerson(){

		Person yngst = personer[0];
		Person eldst = personer[0];

		for(int i = 0; i < personer.length; i++){

			if(yngst.compareTo(personer[i]) < 0){
				yngst = personer[i];

			}
			if(eldst.compareTo(personer[i]) > 0){
				eldst = personer[i];

			}
		}
		System.out.println("Eldst person er " + eldst.getNavn() + ", alder " + eldst.getAlder() +  " og yngste er " + yngst.getNavn() + " alder: " + yngst.getAlder());
	}
}


