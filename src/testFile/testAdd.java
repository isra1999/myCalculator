package testFile;

import static org.junit.Assert.*;

import org.junit.Test;

import mainFile.myCalculator;
import static org.junit.Assert.assertEquals;
public class testAdd {

	@Test
	public void test() {
		myCalculator cal = new myCalculator();
		int ev = cal.Add(1, 1);
		assertEquals(2, ev);
		
	}

}
