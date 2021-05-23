package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exceção árvore não está vazia, não é possivel criar uma raiz.
@SuppressWarnings("serial")
public class NonEmptyTreeException extends RuntimeException {
	
	public NonEmptyTreeException(String error) {super(error);}

}