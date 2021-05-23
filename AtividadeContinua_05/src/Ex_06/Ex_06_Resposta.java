package Ex_06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Ex_02_TAD_Mapa_Ordenado_ABB.Fontes.BinarySearchTree;

/*Atividade Continua 05
 * 
 * Nome dos Integrantes:
 * Caio Victor dos Santos - 1904013
 * Cristhian Ocampo Quinteiro � 1902919
 * Thiago Souza do Amparo � 1904089
 * 
 */

public class Ex_06_Resposta {
	
	/*
	 * Resultado dos testes:
	 * 
	 * (1(2(3)))
	 * (1((2)3))
	 * ((1)2(3)) - Repetido
	 * ((1)2(3)) - Repetido
	 * ((1(2))3)
	 * (((1)2)3)
	 * 
	 * 
	 * Chegamos � conclus�o que o total de �rvores diferentes que a sequencia {1,2,3}
	 * pode gerar s�o 5 �rvores diferentes, haja visto que a sequencia {2,1,3} e {2,3,1}
	 * geram a mesma �rvore.
	 * 
	 */
	
	@Test
	void Arvore1() { //Testa � entrada (1,2,3) na �rvore de busca.	
		
		//Cria � �rvore ABB.
		BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
		
		//Adiciona �s entradas na �rvore.
		tree.put(1, 1); 
		tree.put(2, 2);
		tree.put(3, 3);
		
		//Imprimi � �rvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da �rvore.
		assertEquals("(1(2(3)))", tree.printExpression(tree.root()));		
	}	
	
	@Test
	void Arvore2() { //Testa � entrada (1,3,2) na �rvore de busca.	
		
		//Cria � �rvore ABB.
		BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
		
		//Adiciona �s entradas na �rvore.
		tree.put(1, 1); 
		tree.put(3, 3);
		tree.put(2, 2);
		
		//Imprimi � �rvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da �rvore.
		assertEquals("(1((2)3))", tree.printExpression(tree.root()));		
	}	
	
	@Test
	void Arvore3() { //Testa � entrada (2,1,3) na �rvore de busca.	
		
		//Cria � �rvore ABB.
		BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
		
		//Adiciona �s entradas na �rvore.
		tree.put(2, 2);
		tree.put(1, 1); 
		tree.put(3, 3);
		
		//Imprimi � �rvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da �rvore.
		assertEquals("((1)2(3))", tree.printExpression(tree.root()));		
	}	
	
	@Test
	void Arvore4() { //Testa � entrada (2,3,1) na �rvore de busca.	
		
		//Cria � �rvore ABB.
		BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
		
		//Adiciona �s entradas na �rvore.
		tree.put(2, 2);
		tree.put(3, 3);
		tree.put(1, 1); 
		
		//Imprimi � �rvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da �rvore.
		assertEquals("((1)2(3))", tree.printExpression(tree.root()));		
	}	
	
	@Test
	void Arvore5() { //Testa � entrada (3,1,2) na �rvore de busca.	
		
		//Cria � �rvore ABB.
		BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
		
		//Adiciona �s entradas na �rvore.		
		tree.put(3, 3);
		tree.put(1, 1); 
		tree.put(2, 2);
		
		//Imprimi � �rvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da �rvore.
		assertEquals("((1(2))3)", tree.printExpression(tree.root()));		
	}	
	
	@Test
	void Arvore6() { //Testa � entrada (3,2,1) na �rvore de busca.	
		
		//Cria � �rvore ABB.
		BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
		
		//Adiciona �s entradas na �rvore.		
		tree.put(3, 3);		 
		tree.put(2, 2);
		tree.put(1, 1);
		
		//Imprimi � �rvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da �rvore.
		assertEquals("(((1)2)3)", tree.printExpression(tree.root()));		
	}
}