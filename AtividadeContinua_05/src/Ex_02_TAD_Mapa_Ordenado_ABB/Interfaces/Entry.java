package Ex_02_TAD_Mapa_Ordenado_ABB.Interfaces;

//Interface para a entrada do TAD MAPA.
public interface Entry<KEY, VALUE> {
	
	//Retorna a chave pertecente uma dada entrada.
	public KEY getKey();
	
	//Retorna o valor pertecente uma dada entrada.
	public VALUE getValue();
	
}