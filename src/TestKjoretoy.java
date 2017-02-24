import java.util.Scanner;
import java.util.ArrayList;

public class TestKjoretoy {

	
	
	static ArrayList<Kjoretoy> kjoretoyBeholder = new ArrayList<Kjoretoy>();

	public static void main(String[] args){	
		
		try{
			int svar = 0;
			Scanner in = new Scanner(System.in);
			
			while(svar != 5){
				System.out.println("Meny (tast inn nummer ved siden av valg) :");
				System.out.println("1:Registrer ny bil");
				System.out.println("2.Les info om bilen");
				System.out.println("3.Summen paa aarsavgiften");
				System.out.println("4.Skrive ut alle kjoretoy");
				System.out.println("5.Slutt");
						
				while(in.hasNextLine()){
					String line = in.nextLine();
					svar = Integer.parseInt(line);
					if(svar == 1){
						
						System.out.println("Hva slags type kjoretoy vil du registrere?");
						String typeKjoretoy =  in.nextLine();
						
						if(typeKjoretoy.equalsIgnoreCase("personbil")){
							Personbil personbil = new Personbil();
							personbil.lesInnData(in);
							kjoretoyBeholder.add(personbil);
						} else if (typeKjoretoy.equalsIgnoreCase("varebil")){
							Varebil varebil = new Varebil();
							varebil.lesInnData(in);
							kjoretoyBeholder.add(varebil);
						} else if (typeKjoretoy.equalsIgnoreCase("bus")){
							Bus bus = new Bus();
							bus.lesInnData(in);
							kjoretoyBeholder.add(bus);
						}	else{
							System.out.println("Ugyldig type bil. Du kan velge mellom personbil, lastebil og buss.");
							System.out.println("Meny (tast inn nummer ved siden av valg) :");
							System.out.println("1:Registrer ny bil");
							System.out.println("2.Les info om bilen");
							System.out.println("3.Summen paa aarsavgiften");
							System.out.println("4.Skrive ut alle kjoretoy");
							System.out.println("5.Slutt");
									
						}
					}
					else if(svar == 2){
						System.out.println("Hva er registreringsnummeret til kjoretoyet?");
						String brukerRegNr = in.nextLine();
						for(Kjoretoy k : kjoretoyBeholder){
							if(brukerRegNr == k.getRegNr()){
								System.out.println("Her er info om merke til kjoretoyet: " + k.infoOmFabrikkMerke() + ",og eieren heter: " + k.getNavn());
							}
						}
					}
					else if(svar == 3){
						System.out.println("Hva heter person eller firma du vil se aarsavgiften for?");
						String svarNavn = in.nextLine();
						for(Kjoretoy k : kjoretoyBeholder){
							if(k.getNavn().equals(svarNavn)){
								System.out.println(svarNavn + " har aaravgift paa: " + k.beregnAaravgift());
							}
						}
					}
					else if(svar == 4){
						for(Kjoretoy k : kjoretoyBeholder){
							k.skrivUtData();
						}
					}
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}



	}


}




