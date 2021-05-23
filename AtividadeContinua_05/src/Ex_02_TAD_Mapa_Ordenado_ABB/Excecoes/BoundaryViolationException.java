package Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes;

//Exceção Posição Fora do Intervalo Permitido.
@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {
	
	public BoundaryViolationException(String error) {super(error);}

}