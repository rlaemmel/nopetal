import java.util.LinkedList;

@SuppressWarnings("serial")
public class IntList extends LinkedList<Integer> {
	public IntList() {
		super();
	}
	public IntList(int from, int to) {
		super();
		for (int i=from; i<=to; i++)
			add(i);		
	}	
	public long product() {
		long result = 1;
		for (int x : this)
			result *= x;
		return result;	
	}
}
