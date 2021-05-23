package Ex_11_12;

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

class Ex_11_12_Resposta {
	
	static AVLTreeMap<Integer, String> tree = new AVLTreeMap<Integer, String>();

	@Test
	void Exercicio11() { //Simmula a inserção da chave (52, I)			

		//Monta à árvore com as entradas fornecidas do exercicio.
		tree.put(44, "A");
		tree.put(17, "B");
		tree.put(78, "C");
		tree.put(32, "D");
		tree.put(50, "E");
		tree.put(88, "F");
		tree.put(48, "G");
		tree.put(62, "H");
		
		//Imprimi à árvore antes da inserção da chave (52, I).
		System.out.println("Antes da inserção de 52\n" + tree.printExpression(tree.root()) + "\n");
		
		//Testa o estado inicial da árvore.
		assertEquals("((17(32))44(((48)50(62))78(88)))", tree.printExpression(tree.root()));
		
		tree.put(52, "I"); //Adiciona a chave (52, I).
		
		//Imprimi à árvore após a inserção da chave (52, I).
		System.out.println("Após a inserção de 52\n" + tree.printExpression(tree.root()) + "\n");
		
		//Testa o estado final da árvore.
		assertEquals("((17(32))44(((48)50(52))62(78(88))))", tree.printExpression(tree.root()));
	}

	@Test
	void Exercicio12() { //Simmula a remoção da chave (62, H).
		
		//Imprimi à árvore antes da remoção da chave (62, H).
		System.out.println("Antes da remoção de 62\n" + tree.printExpression(tree.root()) + "\n");
		
		//Testa o estado inicial da árvore.
		assertEquals("((17(32))44(((48)50(52))62(78(88))))", tree.printExpression(tree.root()));
		
		tree.remove(62); //Remove a chave (62, H).
		
		//Imprimi à árvore após a remoção da chave (62, H).
		System.out.println("Após a remoção de 62\n" + tree.printExpression(tree.root()) + "\n");
		
		//Testa o estado final da árvore.
		assertEquals("((17(32))44(((48)50(52))78(88)))", tree.printExpression(tree.root()));		
	}

}