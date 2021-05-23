package Ex_02_TAD_Mapa_Ordenado_ABB.Interfaces;

import Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes.EmptyStackException;

//Interface para o TAD PILHA USANDO LSE.
public interface Stack<TYPE> {
	
	//Retorna um inteiro com a quantidade de elementos contidos na PILHA.
	public int size();
	
	//Retorna um valor booleano representando o status da PILHA => True=Vazia, False=Não Vazia.
	public boolean isEmpty();
	
	//Retorna o elemento do topo da PILHA, sem remove-lo.
	public TYPE top() throws EmptyStackException;
	
	//Adiciona um 'element=elemento' no topo da PILHA.
	public void push(TYPE element);
	
	//Remove e retorna o elemento do topo da PILHA.
	public TYPE pop() throws EmptyStackException;

}