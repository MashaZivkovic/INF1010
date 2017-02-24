
public class MainPerson {
	Person studenter;
	Person[] stud;
	public static void main(String[] args){
		MainPerson p = new MainPerson();
		p.finnStudenter();
	}
 Student bachelorStudent = new BachelorStudent("Masa", 34, "INF1010", "UIO", 12);
 Student masterStudent = new MasterStudent("Ervin", 39, "LED4010", "UIO", 24);
 Ansatt professor = new Professor("Ingve", 77, 6776, "ING3399","uioi" );
 Ansatt forsker = new Forsker("Rebekka", 55, 44, "djhd");
 Person[] personer = new Person[]{bachelorStudent, masterStudent, professor, forsker};
 
@SuppressWarnings("unused")//DEAD CODE!!!!!!!whyyyyyy??????
public Person finnStudenter(){
 for(int i = 0; i < personer.length; i++){
	 if(personer[i] instanceof Student){
		 System.out.println(personer[i].toString());
		 studenter = personer[i];
		 stud[i] = studenter;
		
	 }
	 return studenter;
 }


return null;

}
}
