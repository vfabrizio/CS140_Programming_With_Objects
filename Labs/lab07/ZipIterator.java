package lab07;

import java.util.Iterator;

public class ZipIterator<K, V> implements Iterator<Pair<K, V>> {
	private K[] kArr;
	private V[] vArr;
	private int pos;
	

	public ZipIterator(K[] kArr, V[] vArr) {
		super();
		this.kArr = kArr;
		this.vArr = vArr;
	}

	@Override
	public boolean hasNext() {
		boolean retVal = true;
		if (pos >= kArr.length || pos >= vArr.length) {
			retVal = false;
		}
		return retVal;
	}

	@Override
	public Pair<K, V> next() {
		Pair<K, V> retPair = new Pair<>(kArr[pos], vArr[pos]);
		pos++;
		return retPair;
	}
	
	public Iterable<Pair<K, V>> toIterable() {
		return () -> this;
	}

}
