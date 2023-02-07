package it.xeniaconsulting.decimaltoroman;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DecimalToRomanTest2 {
	private String expected;
	private int value;
	
	@Parameters
	public static Collection<Object[]> getParam() {
		return Arrays.asList(new Object[][] {
			{"I",1},
			{"IV",4},
			{"VI",6},
			{"XVII",17},
			{"XXXIII",33},
			{"LIX",59},
			{"CLXXVIII",178},
			{"CD",400},
			{"DLXVIII",568},
			{"CMXXIII",923},
			{"MMDCCLXXXVI",2786}
		});
	}
	
	public DecimalToRomanTest2(String expected, int value) {
		this.expected = expected;
		this.value = value;
	}
	
	@Test
	public void test() {
		assertEquals(expected, DecimalToRoman.converti(value));
	}
}
