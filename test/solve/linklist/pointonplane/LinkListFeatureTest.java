package solve.linklist.pointonplane;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkListFeatureTest {

	@Test
	public void testBuildTheList() {
		LinkListOnPlane linkList = new LinkListOnPlane(1, 2);
		linkList.insert(2, 3);
		linkList.insert(2, 4);
		linkList.insert(2, 5);
		linkList.insert(3, 4);
		linkList.insert(4, 4);
		linkList.insert(5, 4);
		assertTrue(linkList.size()==7);
		linkList.removePointsInLine();
		assertTrue(linkList.size()==5);
	}

}
