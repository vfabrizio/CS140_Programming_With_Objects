package lab06;

public class Partitioner {
	private Parent[] parents;
	private Child[] children;

	public Parent[] getParents() {
		return parents;
	}

	public Child[] getChildren() {
		return children;
	}

	public void partition(Parent[] array) {
		int cLength = 0;
		int pLength = 0;
		int cIndex = 0;
		int pIndex = 0;
		for (Parent e : array) {
			if (e.isChild()) {
				cLength += 1;
			}else {
				pLength += 1;
			}
		}
		parents = new Parent[pLength];
		children = new Child[cLength];
		for (Parent e : array) {
			if (e.isChild()) {				
				children[cIndex] = (Child) e;
				cIndex++;
			}else {
				parents[pIndex] = e;
				pIndex++;
			}
		}
	}
}
