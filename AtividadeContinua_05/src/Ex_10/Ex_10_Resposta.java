package Ex_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ex_08_TAD_Mapa_Ordenado_AVL.Fontes.AVLTreeMap;

/*Atividade Continua 05
 * 
 * Nome dos Integrantes:
 * Caio Victor dos Santos - 1904013
 * Cristhian Ocampo Quinteiro – 1902919
 * Thiago Souza do Amparo – 1904089
 * 
 */

class Ex_10_Resposta {
	
	/*
	 * Uma forma de como podemos mostrar que o professor Amongus está errado é construindo
	 * duas Árvores AVL com duas sequencias númericas contendo os mesmos
	 * números porém em ordens diferentes.
	 * 
	 *  Neste exemplo utilizamos às seguintes sequencias númericas:
	 *  
	 *  Modelo A: 1, 2, 3, 4, 5.
	 *  Modelo B: 5, 4, 3, 2, 1.
	 *  
	 *  É possivel perceber que o modelo B fica com sua ordem inversa ao modelo A.
	 */

	@Test
	void ModeloA() { //Modelo A: 1, 2, 3, 4, 5.
		
		//Cria à árvore AVL.
		AVLTreeMap<Integer, String> tree = new AVLTreeMap<Integer, String>();
		
		//Adiciona às entradas na árvore.
		tree.put(1, "A"); 
		tree.put(2, "B");
		tree.put(3, "C");
		tree.put(4, "D");
		tree.put(5, "E");
		
		//Imprimi à árvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da árvore.
		assertEquals("((1)2((3)4(5)))", tree.printExpression(tree.root()));
	}	

	@Test
	void ModeloB() { //Modelo B: 5, 4, 3, 2, 1.
		
		//Cria à árvore AVL.
		AVLTreeMap<Integer, String> tree = new AVLTreeMap<Integer, String>();
		
		//Adiciona às entradas na árvore.
		tree.put(5, "E"); 
		tree.put(4, "D");
		tree.put(3, "C");
		tree.put(2, "B");
		tree.put(1, "A");
		
		//Imprimi à árvore.
		System.out.println(tree.printExpression(tree.root()));
		
		//Testa o resultado da árvore.
		assertEquals("(((1)2(3))4(5))", tree.printExpression(tree.root()));
	}

}