package lab07;

public class Pair<K, V> {
	public final K first; // allow direct access since final
    public final V second; // allow direct access since final

    /**
     * Assigns parameters to the field values
     * @param first object of type K assigned to field first
     * @param second object of type V assigned to field second
     */
    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
