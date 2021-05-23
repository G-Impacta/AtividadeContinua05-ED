package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exceção entrada informada invalida.
@SuppressWarnings("serial")
public class InvalidEntryException extends RuntimeException {
	
	public InvalidEntryException(String error) {super(error);}

}