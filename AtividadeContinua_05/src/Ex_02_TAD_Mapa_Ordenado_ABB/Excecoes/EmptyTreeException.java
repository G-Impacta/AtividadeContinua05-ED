package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exce��o �rvore est� vazia.
@SuppressWarnings("serial")
public class EmptyTreeException extends RuntimeException {
	
	public EmptyTreeException(String error) {super(error);}

}