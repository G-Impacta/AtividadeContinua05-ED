package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exce��o LISTA DE NODOS vazia.
@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	
	public EmptyListException(String error) {super(error);}

}