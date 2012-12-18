import java.util.LinkedList;
import java.util.List;

public class HaskellProfessor1 {
	public static long fac(int n) {
		List<Integer> l = new LinkedList<Integer>();
		for (int i=1; i<=n; i++)
			l.add(i);
		long result = 1;
		for (int x : l)
			result *= x;
		return result;
	}
}
