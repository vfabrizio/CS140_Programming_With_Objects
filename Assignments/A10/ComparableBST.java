package assignment10;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to implement the Binary Search Tree data structure of
 * Comparable elements. The structure is generic in the type of 
 * Comparable Objects it contains.
 * @param <T> the type of the Comparable elements this structure is to hold
 */
public class ComparableBST<T extends Comparable<? super T>> {
	private T data;
	private ComparableBST<T> left;
	private ComparableBST<T> right;
	
	/**
	 * Constructs a ComparableBST with data
	 * @param data the data this BST should hold
	 */
	public ComparableBST(T data) { // THIS IS THE ONLY CONSTRUCTOR
		this.data = data;
	}
	
	/**
     * Inserts an element into this BST
     * @param element the element to insert into this BST
     */
    public void insert(T element) {
    	if (data == null) {
    		data = element;
    	}
    	else if (!element.equals(data)) {
        	if (data.compareTo(element) < 0) {
        		if (left == null) {
        			left = new ComparableBST<T>(element);
        		}else {
        			left.insert(element);
        		}
        	}
        	if (data.compareTo(element) > 0) {
        		if (right == null) {
        			right = new ComparableBST<T>(element);
        		}else {
        			right.insert(element);
        		}
        	}
        }
    }
    
    /**
     * Searchs for a given element in this BST
     * @param element the element to search this BST for
     * @return the element in this BST matching the given element, if found,
     *         otherwise null if the given element is not in this BST
     */
    public T find(T element) {
    	if (element == null) {
    		return null;
    	}
        if (data.compareTo(element) == 0) {
        	return element;
        }
    	if (data.compareTo(element) < 0) {
        	if (left == null) {
        		return null;
        	}
        	return left.find(element);
        }
        if (right == null) {
        	return null;
        }
        return right.find(element);
    }
    
    /**
     * Gathers all the elements of this BST in order
     * @return a List holding the elements in this BST in order
     */
    public List<T> getElements() {
        List<T> list = new ArrayList<>();
        if (left != null) {
        	list.addAll(left.getElements());
        }
        list.add(data);
        if (right != null) {
        	list.addAll(right.getElements());
        }
        return list;
    }

    /**
     * Pretty prints the contents of this BST in a horizontal tree-like fashion
     */
    public void prettyPrint() {
        prettyPrint(0);
    }

    private void prettyPrint(int indentLevel) {
        if (data != null) {
        	if (left != null) {
        		left.prettyPrint(indentLevel+1);
        	}
        	for (int i = 0; i < indentLevel; i++) {
            	System.out.print("  ");
            }
        	System.out.println(data);
        	if (right != null) {
        		right.prettyPrint(indentLevel+1);
        	}
        }
        // similar to printInOrder from assignment09,
        // but print `indentLevel` amount of spaces before printing data on its own line
        // you may use a for loop to print `indentLevel` amount of spaces
        // each time you recurse, you add to indentLevel
    }
    
    public ArrayList<T> bftravers() {
		ArrayList<ComparableBST<T>> list = new ArrayList<>();
		list.add(this);
		return bftravers(list);
	}
	
	private ArrayList<T> bftravers(ArrayList<ComparableBST<T>> nodeQueue) {
		ArrayList<T> retVal = new ArrayList<>();
		if (nodeQueue.size() > 0) {
			retVal.add(nodeQueue.get(0).data);
			ComparableBST<T> temp = nodeQueue.remove(0);
			if (temp.left != null) {
				nodeQueue.add(temp.left);
			}
			if (temp.right != null) {
				nodeQueue.add(temp.right);
			}
			retVal.addAll(bftravers(nodeQueue));
		}
		return retVal;
	}
	
	public int height() {
		return height(this);
	}
	
	private int height(ComparableBST<T> tr) {
		int retVal = 0;
		if (tr != null) {
			retVal = 1 + Math.max(height(tr.left), height(tr.right));
		}
		return retVal;
	}
	
	public boolean heightBalanced() {
		return heightBalanced(this);
	}
	
	private boolean heightBalanced(ComparableBST<T> tr) {
		if (tr == null) {
			return true;
		}
		if (height(tr.left) - height(tr.right) <= 1) {
			if (heightBalanced(tr.left) && heightBalanced(tr.right)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
