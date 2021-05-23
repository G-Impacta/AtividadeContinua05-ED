package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exceção de Pilha vazia.
@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
	
	public EmptyStackException(String error) {super(error);}

}