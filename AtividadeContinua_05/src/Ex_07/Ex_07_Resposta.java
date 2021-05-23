package Ex_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ex_02_TAD_Mapa_Ordenado_ABB.Fontes.BinarySearchTree;

/*Atividade Continua 05
 * 
 * Nome dos Integrantes:
 * Caio Victor dos Santos - 1904013
 * Cristhian Ocampo Quinteiro – 1902919
 * Thiago Souza do Amparo – 1904089
 * 
 */

class Ex_07_Resposta {
	
	/*
	 * Uma forma de como podemos mostrar que o professor Amongus está errado é construindo
	 * duas Árvores Binárias de Pesquisa com duas sequencias númericas contendo os mesmos
	 * números porém em ordens diferentes.
	 * 
	 *  Neste exemplo utilizamos às seguintes sequencias númericas:
	 *  
	 *  Modelo A: 2, 4, 6, 8, 10.
	 *  Modelo B: 6, 2, 4, 8, 10.
	 *  
	 * Para o Modelo A temos uma árvore com uma cadeia de valores filhos para direita.
	 * Para o Modelo B temos uma arvore melhor estruturada e distribuida.
	 */

	@Test
	void ModeloA() { //Modelo A: 2, 4, 6, 8, 10.		
		
		//Cria à árvore ABB.
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		
		//Adiciona às entradas na árvore.
		tree.put(2, "A"); 
		tree.put(4, "B");
		tree.put(6, "C");
		tree.put(8, "D");
		tree.put(10, "E");
		
		//Imprimi à árvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da árvore.
		assertEquals("(2(4(6(8(10)))))", tree.printExpression(tree.root()));
	}	

	@Test
	void ModeloB() { //Modelo B: 6, 2, 4, 8, 10.		
		
		//Cria à árvore ABB.
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		
		//Adiciona às entradas na árvore.
		tree.put(6, "C"); 
		tree.put(2, "A");
		tree.put(4, "B");
		tree.put(8, "D");
		tree.put(10, "E");
		
		//Imprimi à árvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da árvore.
		assertEquals("((2(4))6(8(10)))", tree.printExpression(tree.root()));
	}

}