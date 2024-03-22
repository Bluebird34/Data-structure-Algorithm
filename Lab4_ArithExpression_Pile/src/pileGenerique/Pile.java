package pileGenerique;

public class Pile<E> {
	private int maxElements=1000;
	private E elements[];
	private int sommet;
	
	public Pile() {
			elements = (E[ ]) new Object[maxElements];
			sommet = -1;
	}
	
	public void empiler(E nouvElem) {
		if (sommet == (maxElements-1)) {
			System.out.println("Desole, la pile est pleine!");
		} else {
			//on empile l'�l�ment
			sommet = sommet + 1;
			elements[sommet] = nouvElem;
		}
	}
	
	public E depiler() {
		if (sommet < 0) {
			System.out.println("Errreur: la pile est vide, on ne peut pas depiler!");
			return (E) null;
		} else {			
			E elemDuHaut = (E) elements[sommet];
			sommet = sommet - 1;
			return elemDuHaut;
		}
	}
	
	public boolean vide(){
		return sommet==-1;
	}
	
	public E voir(){
		return(E) elements[sommet];
	}

	public String toString() {
		String data = "" ; //Be careful here, not to initialize as null
		for (int i = 0; i <= sommet; i++) {
			data += "(" + elements[i] + ")" + ",";
		}
		return "[" + data +  "]";
	}
	
}

