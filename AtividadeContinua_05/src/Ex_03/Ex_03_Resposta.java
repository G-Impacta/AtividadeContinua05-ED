package Ex_03;

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

class Ex_03_Resposta {

	@Test
	void Exercicio3() { //Simula a aparencia de uma árvore ABB após as entradas (1, A), (2, B), (3, C), (4, D), (5, E).
		
		//Cria à árvore ABB.
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		
		//Adiciona às entradas na árvore.
		tree.put(1, "A"); 
		tree.put(2, "B");
		tree.put(3, "C");
		tree.put(4, "D");
		tree.put(5, "E");
		
		//Imprimi à árvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da árvore.
		assertEquals("(1(2(3(4(5)))))", tree.printExpression(tree.root()));
	}

}