package assignment09;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static ArrayList<Integer> selection(ArrayList<Integer> list) {
		ArrayList<Integer> retList = null; 
		if (list != null) {
			retList = new ArrayList<>();
			if (list.size() > 0) {
				Integer min = Collections.min(list);
				list.remove(min);
				retList.add(min);
				retList.addAll(selection(list));
			}
		}
		return retList;
	}
	
	public static boolean inOrder(ArrayList<Integer> list) {
		if (list == null || list.size() <= 0) {
			return true;
		}
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i - 1).compareTo(list.get(i)) > 0) {
				return false;
			}
		}
		return true;
	}
	
	private static ArrayList<Integer> less(ArrayList<Integer> list) {
		ArrayList<Integer> retList = new ArrayList<>();
		if (list.size() >= 2) {
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < list.get(0)) {
					retList.add(list.get(i));
				}
			}
		}
		return retList;
	}
	
	private static ArrayList<Integer> geq(ArrayList<Integer> list) {
		ArrayList<Integer> retList = new ArrayList<>();
		if (list.size() >= 2) {
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) >= list.get(0)) {
					retList.add(list.get(i));
				}
			}
		}
		return retList;
	}
	
	public static ArrayList<Integer> qsort(ArrayList<Integer> list) {
		ArrayList<Integer> retList = null;
		if (list != null) {
			retList = new ArrayList<>();
			if (list.size() > 0) {
				if (inOrder(list)) {
					retList = list;
				}else {
					Integer pivot = list.get(0);
					retList = qsort(less(list));
					retList.add(pivot);
					retList.addAll(qsort(geq(list)));
					
				}
			}
		}
		return retList;
	}
}
