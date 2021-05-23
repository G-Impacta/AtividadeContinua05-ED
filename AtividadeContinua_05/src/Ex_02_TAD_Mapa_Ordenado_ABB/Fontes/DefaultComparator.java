package Ex_02_TAD_Mapa_Ordenado_ABB.Fontes;

import java.util.Comparator;

public class DefaultComparator<TYPE> implements Comparator<TYPE> {
	
	@SuppressWarnings("unchecked")
	public int compare(TYPE keyOne, TYPE keyTwo) throws ClassCastException {		
		return ((Comparable<TYPE>) keyOne).compareTo(keyTwo);
	}
	
}