package Ex_01_TAD_Dicionario.Interfaces;

import java.util.Map;

/*Atividade Continua 05
 * 
 * Nome dos Integrantes:
 * Caio Victor dos Santos - 1904013
 * Cristhian Ocampo Quinteiro � 1902919
 * Thiago Souza do Amparo � 1904089
 * 
 */

//Interface para o TAD DICION�RIO.
public interface MultiMap<KEY, VALUE> {	
	
	//Retorna um inteiro com a quantidade de elementos contidos no DICION�RIO.
	public int size();
	
	//Retorna um valor booleano representando o status do DICION�RIO => True=Vazio, False=N�o Vazio.
	public boolean isEmpty();
	
	//Retorna o elemento com a 'key=chave' informada, se n�o houver retorna null.
	public Map.Entry<KEY,VALUE> get(KEY key) throws IllegalArgumentException;
	
	//Adiciona um elemento com 'key=chave' e 'value=valor' no dicion�rio.
	public Map.Entry<KEY,VALUE> put(KEY key, VALUE value) throws IllegalArgumentException;
	
	//Remove e retorna um elemento do DICION�RIO, se n�o houver retorna null.
	public Map.Entry<KEY,VALUE> remove(Map.Entry<KEY,VALUE> element) throws IllegalArgumentException;
	
	//Retorna uma cole��o iter�vel contendo todos os elementos do DICION�RIO com a 'chave=key' informada.
	public Iterable<Map.Entry<KEY,VALUE>> getAll(KEY key) throws IllegalArgumentException;
	
	//Retorna uma cole��o iter�vel de todos os elementos do DICION�RIO.
	public Iterable<Map.Entry<KEY,VALUE>> entrySet();

}