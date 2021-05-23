package Ex_05;

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

class Ex_05_Resposta {

	@Test
	void Exercicio5() { //Simula a aparencia de uma árvore ABB após as entradas 30, 40, 24, 58, 48, 26, 11, 13.
		
		//Cria à árvore ABB.
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		
		//Adiciona às entradas na árvore.
		tree.put(30, "A"); 
		tree.put(40, "B");
		tree.put(24, "C");
		tree.put(58, "D");
		tree.put(48, "E");		
		tree.put(26, "F"); 
		tree.put(11, "G");
		tree.put(13, "H");
		
		//Imprimi à árvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da árvore.
		assertEquals("(((11(13))24(26))30(40((48)58)))", tree.printExpression(tree.root()));
	}

}