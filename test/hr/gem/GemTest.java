package hr.gem;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GemTest {

	@Test
	public void test() {
		List<String> sample = Arrays.asList(new String[]{"abcdde","baccd","eeabg"});
		assertEquals(2,Solution.findGemCount(sample));
	}

}
