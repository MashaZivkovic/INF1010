
public class MinMaxBeholder<E extends Comparable <E>>{

	E[] beholder = (E[]) new Object[2];



	public void leggTil(E element){

		E minst = beholder[0];
		E storst = beholder[0];

		for(int i = 0; i < beholder.length; i++){
			if(beholder[i] == null){
				beholder[i] = element;
			}else if(element.compareTo(minst) < 0){
				minst = element;
			}else if(element.compareTo(storst) > 0){
				storst = element;
			}else{
				throw new IndexOutOfBoundsException();
			}
		}
	}
}
