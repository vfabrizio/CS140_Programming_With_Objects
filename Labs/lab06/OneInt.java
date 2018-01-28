package lab06;

import java.util.ArrayList;

public class OneInt {
	private int one;

	public OneInt(int one) {
		this.one = one;
	}

	public int sum() {
		return one;
	}

	public String toString() {
		return "" + one;
	}

	public static int sumAll(ArrayList<OneInt> list) {
		int returnValue = -1;
		if (list != null) {
			returnValue = 0;
			if (list.size() > 0) {
				for (OneInt element : list) {
					if (element != null) {
						returnValue += element.sum();
					}
				}
			}
		}
		return returnValue;
	}
}
