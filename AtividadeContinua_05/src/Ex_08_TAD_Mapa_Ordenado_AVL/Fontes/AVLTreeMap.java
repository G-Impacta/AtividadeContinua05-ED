package Ex_08_TAD_Mapa_Ordenado_AVL.Fontes;

import java.util.Comparator;

import Ex_02_TAD_Mapa_Ordenado_ABB.Excecoes.InvalidKeyException;
import Ex_02_TAD_Mapa_Ordenado_ABB.Fontes.BTNode;
import Ex_02_TAD_Mapa_Ordenado_ABB.Fontes.BinarySearchTree;
import Ex_02_TAD_Mapa_Ordenado_ABB.Interfaces.BTPosition;
import Ex_02_TAD_Mapa_Ordenado_ABB.Interfaces.Entry;
import Ex_02_TAD_Mapa_Ordenado_ABB.Interfaces.Map;
import Ex_02_TAD_Mapa_Ordenado_ABB.Interfaces.Position;

/*Atividade Continua 05
 * 
 * Nome dos Integrantes:
 * Caio Victor dos Santos - 1904013
 * Cristhian Ocampo Quinteiro – 1902919
 * Thiago Souza do Amparo – 1904089
 * 
 */

public class AVLTreeMap<KEY, VALUE> extends BinarySearchTree<KEY, VALUE> implements Map<KEY, VALUE> {
	
	public AVLTreeMap(Comparator<KEY> comparator) {super(comparator);}
	
	public AVLTreeMap() {super();}
	
	protected static class AVLNode<KEY, VALUE> extends BTNode<Entry<KEY, VALUE>> {
		
		protected int height;

		AVLNode() {super(null, null, null, null);}
		
		@SuppressWarnings("unchecked")
		AVLNode(Entry<KEY, VALUE> element, BTPosition<Entry<KEY, VALUE>> parent, BTPosition<Entry<KEY, VALUE>> left, BTPosition<Entry<KEY, VALUE>> right) {
			
			super(element, parent, left, right);
			
			height = 0;
			
			if (left != null) height = Math.max(height, 1 + ((AVLNode<KEY, VALUE>) left).getHeight());
			if (right != null) height = Math.max(height, 1 + ((AVLNode<KEY, VALUE>) right).getHeight());			
		}
		
		public void setHeight(int height) {this.height = height;}

		public int getHeight() {return height;}		
	}
	
	protected BTPosition<Entry<KEY, VALUE>> createNode(Entry<KEY, VALUE> element, BTPosition<Entry<KEY, VALUE>> parent, BTPosition<Entry<KEY, VALUE>> left, BTPosition<Entry<KEY, VALUE>> right) {

		return new AVLNode<KEY, VALUE>(element, parent, left, right);
	}
	
	@SuppressWarnings("unchecked")
	protected int height(Position<Entry<KEY, VALUE>> position) {return ((AVLNode<KEY, VALUE>) position).getHeight();}
	
	@SuppressWarnings("unchecked")
	protected void setHeight(Position<Entry<KEY, VALUE>> position) {

		((AVLNode<KEY, VALUE>) position).setHeight(1 + Math.max(height(left(position)), height(right(position))));
	}
	
	protected boolean isBalanced(Position<Entry<KEY, VALUE>> position) {

		int balancing = height(left(position)) - height(right(position));

		return ((-1 <= balancing) && (balancing <= 1));
	}
	
	protected Position<Entry<KEY, VALUE>> tallerChild(Position<Entry<KEY, VALUE>> position) {

		if (height(left(position)) > height(right(position))) {return left(position);}
		else if (height(left(position)) < height(right(position))) {return right(position);}		

		if (isRoot(position)) {return left(position);}
		
		if (position == left(parent(position))) {return left(position);}
		else {return right(position);}
	}
	
	protected void rebalance(Position<Entry<KEY, VALUE>> position) {

		if (isInternal(position)) {setHeight(position);}

		while (!isRoot(position)) {
	
			position = parent(position);	
			setHeight(position);
	
			if (!isBalanced(position)) {			
		
				Position<Entry<KEY, VALUE>> children = tallerChild(tallerChild(position));		
				position = restructure(children);				
		
				setHeight(left(position));		
				setHeight(right(position));		
				setHeight(position);
			}
		}
	}
	
	public VALUE put(KEY key, VALUE value) throws InvalidKeyException {

		VALUE inserted = super.put(key, value);

		rebalance(this.position);

		return inserted;
	}
	
	public VALUE remove(KEY key) throws InvalidKeyException {

		VALUE removed = super.remove(key);

		if (removed != null) {rebalance(this.position);}
		return removed;
	}
	
}