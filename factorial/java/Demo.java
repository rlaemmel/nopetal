import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Demo {

	@Test
	public void testHaskellFreshman() {
		assertEquals(120,HaskellFreshman.fac(5));
	}
	
	@Test
	public void testHaskellProfessor1() {
		assertEquals(120,HaskellProfessor1.fac(5));
	}

	@Test
	public void testHaskellProfessor2() {
		assertEquals(120,HaskellProfessor2.fac(5));
	}

	@Test
	public void testJavaStyle() {
		assertEquals(120,JavaStyle.fac(5));
	}

}
