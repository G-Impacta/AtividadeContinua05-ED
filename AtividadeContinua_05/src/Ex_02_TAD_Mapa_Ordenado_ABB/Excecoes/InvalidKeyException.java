package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exceção chave informada invalida.
@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	
	public InvalidKeyException(String error) {super(error);}
	
}