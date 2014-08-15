package hr.serviceLane;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceLane {

	@Test
	public void smallestVechileShouldGo() {
		int[] widhtArray = {2,3,1,2,3,2,3,3}; 
		assertEquals(1,Solution.getVehiclesType(0, 3, widhtArray));
		assertEquals(2,Solution.getVehiclesType(4, 6, widhtArray));
		assertEquals(3,Solution.getVehiclesType(6, 7, widhtArray));
		assertEquals(2,Solution.getVehiclesType(3, 5, widhtArray));
		assertEquals(1,Solution.getVehiclesType(0, 7, widhtArray));
	}
	
	@Test
	public void testLongInput() throws Exception {
		int[] width = {2,2,2,2,3,3,3,3,3,3,2,3,3,3,2,2,2,3,3,3,2,2,2,2,2,2,3,3,3,2,3,3,3,3,2,2,2,3,3,2,2,3,3,3,3,2,2,3,3,3,2,3,3,3,3,3,3,3,2,2,3,3,2,2,3,2,3,3,3,2,3,3,2,3,2,3,3,2,2,2,3,2,3,3,3,2,2,3,3,3,3,3,2,3,3,3,3,2,3,2,3,2,3,3,3,2,2,2,2,2,2,2,2,3,3,2,2,3,3,3,2,2,2,3,2,2,2,3,2,3,2,3,2,3,2,3,3,2,2,2,2,2,2,3,2,3,3,2,2,2,3,3,2,2,2,2,2,2,2,2,2,2,2,2,3,2,3,3,3,3,3,3,2,3,2,2,2,3,2,2,3,3,3,2,3,3,2,3,2,2,2,2,2,2,2,2,2,3,3,3,3,2,3,3,3,3,3,3,3,3,3,2,2,3,2,2,2,3,3,2,3,3,2,2,3,2,2,2,2,3,3,3,3,2,2,2,2,3,3,3,2,2,3,2,3,2,2,2,3,2,2,2,3,3,2,3,3,2,3,3,3,2,2,2,3,2,2,3,3,3,2,3,2,3,2,3,3,2,3,2,2,2,3,2,3,3,3,2,2,2,2,3,2,2,2,3,3,2,2,2,2,2,2,2,2,2,3,3,2,3,2,3,3,3,3,2,2,2,2,2,2,2,2,2,3,2,2,2,2,2,2,2,3,2,2,3,2,2,2,3,3,2,2,2,3,3,2,2,3,2,2,3,3,2,3,2,2,3,2,3,2,2,3,3,3,2,2,3,2,2,2,3,3,2,3,2,3,3,2,2,3,3,3,2,3,3,2,2,2,2,3,2,3,2,3,2,2,3,3,2,2,2,3,3,2,2,3,2,3,2,2,3,3,2,3,2,3,2,2,3,2,3,2,3,2,3,3,2,3,3,3,3,3,2,2,3,3,3,3,2,3,2,3,2,2,3,3,3,3,3,2,3,3,2,3,3,2,2,3,3,3,2,2,2,3,2,2,2,3,3,2,3,3,2,3,3,3,2,2,2,2,3,3,3,3,2,2,3,3,3,2,2,2,2,3,3,2,3,3,2,2,3,3,2,3,2,3,2,3,2,2,3,3,2,2,2,2,2,2,3,3,2,2,3,3,3,2,3,2,3,3,2,3,2,2,2,3,2,3,2,2,3,3,3,3,3,3,2,3,3,3,2,2,3,2,3,2,2,2,2,2,2,3,3,2,3,3,3,3,2,3,3,2,2,2,3,3,2,3,2,3,3,3,3,2,3,2,3,3,3,3,3,3,2,2,3,2,2,3,3,2,2,3,2,3,3,2,2,3,3,3,3,2,2,2,3,3,3,2,2,2,3,2,3,2,2,2,2,2,3,3,3,2,2,3,3,2,3,3,3,3,2,2,3,2,3,2,3,2,2,2,2,2,2,3,2,2,3,2,3,3,3,2,3,2,3,2,2,3,3,3,2,2,2,3,2,3,2,2,3,2,2,3,2,2,2,2,2,3,2,3,2,2,3,3,2,3,3,2,2,3,3,2,3,3,3,3,2,3,3,3,2,3,2,2,3,2,3,2,2,3,3,2,3,3,2,3,2,3,3,2,2,3,2,3,2,3,3,3,3,2,2,3,2,3,3,3,3,2,3,3,2,3,2,3,2,2,3,2,3,2,2,2,3,2,3,2,3,2,3,2,3,3,3,3,2,3,2,2,3,2,3,3,3,3,3,3,3,2,3,3,2,3,3,2,3,2,2,2,3,3,3,2,2,2,3,3,3,3,3,3,3,2,2,2,2,3,3,3,3,2,2,2,3,3,2,2,2,2,3,3,3,2,3,3,2,2,2,2,3,3,3,3,2,3,3,2,3,3,3,2,3,2,2,3,3,2,3,3,2,2,2,3,2,3,3,3,3,3,3,3,3,2,2,3,3,3,3,2,2,2,3,2,2,3,3,2,2,2,3,2,3,2,2,3,3,3,2,3,2,3,2,3,3,2,2,3,3,3,3,2,2,2,2,2,2,3,2,2,3,2,2,2,2,2,2,3,3,2,2,2,2,2,3,3,2,2,2,2,3,2,2,3,2,2,2,2,3,2,2,2,2,3,3,2,3,3,2,3,3,2,3,3,3,2,3,3,2,3,3,2,3,3,3,2,3,3,2,2,2,3,3,2,2,2,3,3,3,3,2,2,3,3,2,2,2,3,2,2,2,3,2,2,3,2,2,2,3,2,3,3,3,2,2,3,2,3,3,3,2,3,3,3,3,3,2,3,2,2,3,3,3,2,3,2,2,3,3,3,3,2,3,3,2,3,2,2,2,3,3,2,3,2,3,2,2,3,3,2,3,2,3,3,2,2,3,2,3,2,2,3,2,3,2,2,2,2,2,2,2,3,2,3,2,3,3,2,3,2,2,2,2,2,3,3,2,3,3,2,3,3,3,2,2,3,2,2,3,3,2,3,2,2,2,2,2,3,2,3,3,3,3,2,3,3,3,3,2,2,3,3,2,2,3,2,3,2,3,3,3,3,2,3,2,3,2,2,2,2,3,2,3,2,2,2,3,3,2,3,3,3,3,3,2,2,2,3,2,3,2,3,2,3,3,2,2,3,2,2,3,3,2,3,2,2,3,3,3,3,3,3,3,2,2,3,2,2,2,3,3,3,2,2,2,3,2,2,2,3,2,2,2,3,3,2,3,2,2,3,2,3,2,3,3,2,2,3,3,2,2,2,3,3,2,3,2,3,3,3,2,2,3,2,3,2,3,2,2,3,3,2,2,3,3,3,2,3,2,3,2,3,3,3,2,2,3,2,3,2,3,3,2,2,3,3,2,2,2,3,3,3,3,3,3,3,2,3,2,3,2,2,2,3,2,2,3,3,2,2,3,2,3,2,2,3,3,3,3,3,2,3,3,3,2,2,2,3,3,3,2,3,3,2,2,3,2,2,2,2,2,2,2,2,2,3,3,3,2,2,3,2,3,2,3,2,2,2,3,3,3,3,2,2,3,2,2,3,2,2,3,3,2,2,3,2,3,2,2,3,2,3,3,2,3,2,2,3,2,3,2,3,2,2,2,3,2,2,2,3,2,3,2,3,3,3,3,2,3,3,3,3,2,2,3,3,3,3,2,3,2,2,3,2,2,3,3,3,3,3,2,3,3,2,2,2,3,2,3,2,3,2,3,2,3,3,3,2,2,2,3,3,2,2,3,3,3,3,2,2,2,2,2,3,2,2,2,3,2,3,3,2,3,2,2,2,3,3,2,2,3,2,3,2,2,2,3,2,3,3,2,2,3,2,3,3,3,3,2,3,2,3,3,2,3,3,2,3,3,3,3,2,3,2,2,3,2,3,3,2,2,2,2,3,2,3,2,3,3,2,3,3,3,2,3,3,2,2,2,3,3,3,3,2,3,2,3,3,3,3,3,2,3,3,3,3,3,2,3,2,2,2,3,2,2,3,3,2,3,3,3,2,2,3,2,3,3,3,2,2,2,2,2,3,3,2,3,2,2,2,2,2,2,2,2,2,3,3,3,2,2,2,2,2,3,2,3,2,3,2,3,2,2,3,3,3,3,2,2,3,2,2,2,2,2,2,3,3,2,2,3,2,2,3,3,2,3,2,2,3,2,3,3,2,3,2,2,2,3,2,2,3,2,2,2,3,2,3,2,2,3,2,3,3,3,2,3,3,2,2,2,3,3,3,3,2,3,3,3,2,3,3,2,2,3,2,3,3,3,3,2,2,3,3,3,3,3,3,2,3,3,2,2,2,3,2,3,2,3,2,3,3,3,3,3,2,3,2,3,2,3,3,2,3,2,3,2,3,2,2,3,3,2,3,2,3,3,3,3,3,3,2,2,2,3,3,2,2,3,3,2,2,3,2,3,3,2,3,3,2,3,2,2,3,3,2,2,3,3,2,2,2,2,2,2,2,3,2,2,2,3,3,2,2,3,2,2,3,3,3,2,3,3,2,2,2,2,3,3,3,3,3,3,3,3,3,3,2,3,2,2,2,3,3,3,2,3,3,2,2,2,2,3,3,2,2,3,2,3,3,3,2,2,2,3,2,3,3,2,2,3,3,2,2,2,3,2,3,2,2,3,2,2,3,3,2,3,3,2,2,2,3,2,2,3,3,2,2,2,3,2,3,2,3,3,2,2,2,3,3,2,2,3,3,3,3,3,2,2,2,2,2,3,2,2,3,2,3,3,2,2,2,2,2,3,3,2,3,3,3,2,2,3,2,3,3,3,2,3,3,2,2,3,2,2,3,3,2,2,2,3,2,2,3,2,3,2,2,3,2,3,3,2,3,3,3,2,2,3,3,3,2,3,2,2,2,2,3,2,2,3,3,3,2,2,3,3,3,2,2,3,3,2,3,2,3,2,2,2,3,2,3,3,3,2,3,3,2,2,2,2,2,3,3,2,2,3,3,3,3,2,2,2,2,3,3,3,3,3,3,2,3,3,2,3,3,3,2,3,2,2,3,2,2,3,2,2,2,3,3,3,3,3,3,3,2,2,3,3,2,2,3,3,3,3,2,2,3,3,3,3,3,3,3,3,2,3,3,2,2,2,3,2,3,2,3,3,3,2,2,3,3,2,2,2,3,3,3,2,2,2,3,3,3,2,3,3,3,2,3,2,3,2,2,2,3,3,2,2,2,2,3,3,2,3,3,2,2,2,2,2,3,2,2,2,2,3,2,2,3,3,2,2,2,2,3,3,3,3,3,3,3,2,2,2,3,2,2,2,2,2,2,3,2,2,2,3,3,2,3,3,3,3,3,3,3,2,2,2,3,3,2,3,3,2,3,3,2,3,3,3,3,3,2,2,2,2,3,3,2,2,2,2,3,2,3,2,2,2,2,2,3,2,3,3,3,2,2,3,3,3,2,2,2,3,2,2,3,3,2,2,3,2,2,2,2,3,2,3,3,3,3,3,3,2,2,2,2,2,2,3,3,2,3,3,3,2,2,3,3,2,3,3,2,3,3,3,2,2,2,2,3,3,3,2,3,3,3,3,3,3,2,2,3,3,3,3,3,3,2,3,3,3,2,2,2,3,3,2,3,3,2,2,2,3,3,3,2,2,2,3,3,2,3,2,3,3,3,3,2,3,2,2,2,2,2,2,3,3,3,3,2,3,3,2,3,2,3,3,2,3,3,3,3,2,2,2,3,3,3,2,3,3,2,3,3,2,2,3,3,3,2,3,2,3,3,3,2,2,3,2,3,2,2,2,2,2,2,2,3,2,2,2,3,2,2,3,2,2,2,3,3,2,2,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,3,2,2,2,2,2,2,3,2,2,3,3,3,3,3,2,2,2,3,2,3,3,2,3,3,2,3,2,2,2,2,3,2,3,3,2,3,3,3,2,3,2,3,2,3,3,3,2,3,2,2,3,2,2,2,3,2,2,3,2,2,2,3,2,3,3,3,2,2,2,2,2,3,2,2,2,3,3,2,2,2,2,3,2,2,2,3,2,2,3,2,2,3,2,2,2,3,3,2,3,2,3,3,3,3,2,3,2,3,2,2,3,2,2,3,3,2,3,3,2,2,2,2,3,2,2,3,3,2,3,2,2,2,2,3,3,2,2,3,3,2,2,3,3,2,2,2,2,3,3,2,3,3,2,2,3,2,3,2,2,3,3,2,3,3,3,3,3,2,2,2,2,2,3,3,2,2,3,2,3,3,2,3,2,2,3,2,3,3,2,3,2,3,2,3,2,3,2,3,3,3,2,2,3,3,3,2,3,3,2,3,2,3,2,2,3,3,2,2,2,3,2,2,2,2,2,3,3,2,2,3,3,2,3,3,2,2,3,3,3,3,2,3,2,2,2,2,2,2,2,2,3,2,3,2,2,3,3,2,3,3,3,3,2,2,2,2,2,3,3,2,2,2,3,3,2,3,3,2,2,3,3,3,2,2,3,2,3,2,2,2,2,3,3,2,3,3,2,2,2,3,2,3,3,3,2,2,3,3,2,3,2,3,2,2,3,2,3,2,2,3,3,2,3,2,2,2,2,2,2,2,2,2,3,3,2,3,3,3,2,2,2,3,3,2,3,3,2,2,3,3,2,2,3,3,3,2,3,3,2,2,3,2,2,3,2,2,2,3,3,3,3,3,2,3,2,3,2,2,2,3,3,2,2,3,3,3,3,2,2,3,2,3,2,3,2,2,3,3,3,3,2,3,2,2,2,2,3,2,3,3,3,2,3,3,3,2,2,2,3,2,2,3,2,2,2,2,2,2,3,3,3,3,2,3,3,2,2,3,2,3,2,2,3,2,3,3,2,2,3,3,2,3,3,2,3,3,3,3,3,2,3,2,2,3,2,3,2,2,2,2,3,3,2,2,3,2,3,3,2,3,3,2,2,2,3,2,3,2,3,3,2,2,3,2,2,3,2,2,3,2,2,2,3,3,3,2,3,2,2,3,3,3,3,2,3,2,2,2,2,3,3,3,2,3,3,2,2,3,2,2,2,2,2,3,3,3,2,2,2,2,3,3,3,3,3,2,3,3,2,2,3,2,3,3,3,2,3,3,2,3,3,2,3,2,3,3,3,3,3,3,3,3,3,2,2,2,2,3,2,3,3,3,3,2,2,2,3,3,3,3,2,3,3,3,3,2,2,2,2,2,2,3,3,3,2,3,3,2,2,3,3,2,2,2,2,2,2,3,3,2,2,3,3,3,3,2,2,3,2,2,3,2,3,2,3,3,3,3,2,2,2,3,2,3,2,2,3,2,2,3,2,2,2,3,2,3,3,2,3,2,2,2,2,3,3,2,3,2,3,3,2,3,2,2,2,2,3,2,3,3,3,3,3,3,3,3,3,2,3,2,2,3,2,3,3,3,3,2,2,2,3,2,3,3,3,2,2,2,2,3,3,3,2,2,2,3,2,3,2,3,3,2,3,2,3,2,3,2,2,3,2,3,2,2,2,3,2,2,3,2,3,2,3,2,2,3,3,2,3,3,2,2,2,3,2,3,3,2,2,3,3,2,2,3,2,2,2,2,3,3,2,2,3,3,2,2,3,2,2,2,3,2,2,3,3,3,3,2,3,3,3,2,3,3,2,2,2,2,2,3,2,3,3,3,2,2,3,3,2,2,3,3,2,2,3,2,3,2,2,2,3,2,2,2,3,2,2,3,3,3,2,3,2,2,2,2,2,2,2,2,2,3,3,2,3,2,2,2,2,3,2,3,3,3,2,2,3,2,2,2,3,2,3,3,2,2,2,2,2,2,2,2,3,2,2,3,2,3,3,3,2,2,2,3,3,2,3,2,3,3,3,2,2,2,2,2,2,2,3,2,2,3,2,3,3,3,2,2,2,2,3,2,2,3,3,3,2,2,3,3,2,2,3,2,3,3,2,3,3,3,2,3,3,2,3,2,3,3,2,3,3,3,3,3,3,2,2,3,3,2,2,3,2,3,3,3,3,3,3,2,3,3,2,2,3,3,2,3,2,3,2,2,2,2,3,3,2,2,2,3,2,2,2,2,2,3,2,3,3,3,3,2,2,3,2,3,2,2,2,3,3,3,3,2,3,2,3,3,2,2,3,2,2,3,3,2,3,3,3,2,2,3,2,2,2,2,3,3,2,2,2,2,3,3,2,2,3,3,3,2,3,2,2,2,2,3,2,3,2,2,3,2,3,3,2,3,3,2,2,3,2,2,3,3,3,3,3,3,3,2,3,2,3,3,2,3,3,3,2,3,3,3,2,2,2,2,3,3,2,2,2,2,2,2,3,2,3,2,3,2,3,2,3,2,3,3,3,2,2,3,2,3,2,2,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,2,2,2,2,2,2,3,2,2,2,2,2,2,2,3,2,3,2,3,2,3,3,3,3,2,2,2,3,2,3,3,2,3,3,3,3,3,2,2,2,3,2,2,3,3,3,2,2,2,3,2,3,2,3,2,3,2,3,2,2,2,3,2,3,3,3,3,2,2,3,2,3,3,2,2,2,2,2,2,2,2,2,3,2,2,2,3,2,3,2,2,3,3,2,2,2,2,3,3,2,2,3,3,2,2,3,2,2,2,3,2,2,3,3,2,3,3,2,3,2,2,3,3,3,2,2,2,2,3,3,2,2,2,3,2,2,2,2,2,2,3,2,2,3,2,3,2,3,3,2,2,3,3,3,2,3,3,2,3,3,3,3,3,2,2,3,2,3,3,3,3,3,3,2,2,3,3,2,3,2,2,3,3,2,2,3,3,2,2,3,3,3,2,2,3,3,3,2,2,2,3,3,3,2,3,3,2,2,2,3,2,2,2,3,2,2,3,2,2,3,3,3,2,3,3,2,2,2,2,2,3,3,2,2,3,3,2,3,2,2,2,2,2,2,2,3,3,3,3,3,2,2,3,2,3,2,2,2,3,2,2,2,3,2,2,3,2,2,2,2,2,3,2,3,3,2,2,2,3,3,2,3,3,3,2,2,3,2,2,2,3,3,2,2,3,3,3,3,3,2,3,2,3,2,3,2,2,3,3,2,2,3,3,3,2,3,3,3,2,2,2,3,3,2,3,2,3,3,2,3,3,3,3,2,3,2,2,2,3,3,2,3,2,3,2,2,3,3,2,3,3,2,2,2,2,3,3,2,2,3,3,3,2,2,3,2,2,2,2,3,3,2,2,2,3,2,2,2,3,2,3,3,2,3,3,3,3,2,3,3,3,2,3,2,2,2,2,2,2,2,3,2,2,3,2,3,3,2,2,2,3,3,3,3,3,3,2,2,3,3,3,3,3,2,3,3,3,3,3,3,3,2,3,3,3,3,2,2,2,2,3,3,2,2,2,3,3,3,3,3,2,2,2,2,3,3,3,2,2,3,3,3,3,3,2,3,2,2,3,2,3,2,3,3,3,2,2,2,3,3,3,3,3,3,3,2,2,3,2,2,2,2,3,3,3,3,2,3,2,2,2,3,2,3,2,3,3,2,2,2,3,3,2,2,3,3,3,3,2,3,2,2,3,3,2,2,3,2,2,3,2,2,2,3,3,2,2,3,2,2,3,3,2,3,3,3,3,2,2,3,2,2,2,3,2,2,2,3,2,2,2,3,2,2,2,3,2,2,2,2,3,2,3,3,3,2,2,2,3,2,2,3,3,2,2,3,2,2,2,2,2,2,3,2,2,3,2,2,2,2,2,3,2,3,2,2,3,2,2,2,2,2,3,3,2,2,2,2,2,2,3,3,2,2,3,2,2,3,2,2,2,2,3,2,3,3,2,3,3,3,3,3,3,3,3,2,3,3,2,3,2,3,2,2,2,2,3,2,3,3,2,3,2,3,2,3,2,2,2,3,3,2,2,3,3,3,3,2,3,3,3,3,3,2,3,3,2,2,3,3,2,3,3,2,2,3,3,2,3,2,3,3,2,3,2,3,3,3,3,2,2,2,3,3,2,2,2,2,3,3,2,3,2,3,3,2,2,2,2,3,2,3,2,2,3,2,3,2,3,2,2,2,3,3,3,3,3,2,2,2,3,2,3,2,3,2,2,3,3,3,2,3,2,3,2,3,3,3,3,3,2,3,3,3,2,2,2,2,2,2,2,2,2,2,2,3,2,2,2,3,3,3,3,2,2,3,3,3,2,3,2,2,2,3,3,3,2,2,3,2,2,3,2,3,3,2,2,2,3,3,3,2,2,2,2,2,3,2,3,2,3,2,2,3,3,2,2,3,2,3,2,2,3,2,3,2,3,2,2,2,3,2,2,3,2,3,3,2,3,2,2,2,2,2,3,2,2,2,3,2,3,3,3,2,2,2,3,3,2,3,3,3,3,3,2,2,2,3,2,3,2,2,3,2,2,3,2,3,3,2,3,2,3,2,3,3,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,2,2,2,2,2,3,3,2,2,3,3,2,3,3,3,3,2,2,2,3,3,3,2,2,2,3,3,3,3,3,2,3,3,3,3,3,2,2,2,2,3,3,2,3,2,3,2,2,2,2,2,3,3,2,2,2,2,3,3,3,2,3,2,2,2,3,3,2,3,3,2,3,3,2,2,3,2,2,2,2,2,2,3,3,2,3,3,2,3,2,3,3,2,3,3,2,2,3,3,2,2,3,3,3,2,3,3,2,3,3,2,3,3,3,2,3,3,2,2,2,2,3,3,2,3,3,3,3,2,2,3,2,3,2,2,3,3,3,3,2,2,3,3,3,3,2,2,2,2,2,2,2,2,3,3,3,2,2,2,2,2,2,3,3,2,3,3,2,2,2,2,2,2,2,3,3,2,3,3,2,2,3,2,2,2,3,3,3,3,3,3,3,3,2,3,2,3,2,2,3,2,2,3,2,2,2,3,2,2,2,2,2,3,3,2,2,2,3,3,2,2,2,3,2,3,2,2,2,2,2,2,3,2,3,3,3,2,3,3,2,3,2,2,3,3,2,3,3,3,2,3,3,2,3,3,3,3,3,2,2,3,2,3,2,3,2,3,3,3,2,3,3,2,3,2,3,3,3,3,2,3,2,2,3,3,3,3,3,3,3,3,2,3,2,2,2,2,3,2,2,2,3,3,2,3,3,2,2,2,3,3,3,3,3,2,3,2,3,2,3,2,3,2,3,3,2,2,3,2,2,3,2,3,2,2,2,3,2,3,3,3,2,2,3,3,3,2,3,2,2,3,3,3,3,2,2,3,2,3,3,2,3,3,2,3,2,2,3,2,3,2,2,3,3,3,2,2,3,2,2,3,3,3,2,2,2,2,3,2,3,3,3,2,2,3,2,2,3,3,3,3,3,3,2,2,2,3,2,3,3,3,2,2,2,2,2,2,2,3,3,3,2,2,2,3,3,2,3,2,3,2,3,2,3,2,3,3,3,3,2,2,2,2,2,3,2,2,3,2,3,2,2,2,2,2,3,3,2,2,2,3,3,3,3,2,3,2,2,2,2,2,2,2,3,2,3,3,2,3,2,2,3,2,2,2,2,3,3,2,3,3,3,2,3,2,3,2,3,3,3,3,3,3,3,2,2,3,2,2,2,2,2,3,2,2,3,2,3,3,2,3,2,3,3,3,3,2,2,2,3,3,3,3,2,3,3,2,2,3,3,2,3,3,3,3,2,3,3,3,2,3,2,2,2,2,2,2,2,2,2,2,3,2,3,3,3,2,2,3,2,3,3,3,2,2,3,2,3,2,2,3,2,2,2,2,2,2,2,3,2,3,3,3,3,2,2,2,2,2,3,2,3,2,2,2,2,3,2,2,3,2,3,3,3,3,2,3,3,2,2,3,3,3,2,2,3,3,2,2,3,3,2,3,3,2,3,2,3,3,2,3,2,3,2,3,3,2,2,2,3,3,2,2,2,2,3,2,3,3,2,3,3,2,2,2,3,3,2,2,2,2,3,2,2,2,3,3,2,2,3,3,3,3,2,3,2,3,3,3,2,3,2,3,2,2,2,3,3,2,3,2,3,3,2,3,3,2,2,3,2,3,3,3,3,3,2,3,2,2,2,2,3,3,2,3,3,2,2,3,2,2,3,3,3,3,2,2,3,2,3,3,2,2,2,3,3,3,2,3,3,2,2,2,3,2,2,3,2,2,2,2,2,3,2,3,2,2,3,2,3,3,3,3,3,2,2,3,3,2,2,2,2,2,2,2,2,2,3,2,3,3,3,3,2,3,3,2,3,2,2,2,3,2,3,3,2,3,2,3,3,2,3,2,3,3,2,3,2,3,2,3,2,3,2,2,2,3,2,3,2,3,2,3,3,3,2,3,3,2,2,2,3,3,2,2,2,2,3,2,3,3,3,3,2,2,3,2,3,2,2,3,3,2,3,2,3,3,3,2,2,3,3,3,2,3,3,2,2,2,3,3,2,2,3,2,2,2,3,2,2,3,3,3,3,2,3,2,2,2,3,2,3,2,3,3,3,2,2,3,2,3,3,2,3,2,3,2,2,2,2,3,3,3,2,2,2,2,2,2,2,3,2,2,3,3,3,3,3,3,2,3,2,3,2,2,3,3,2,2,3,2,3,2,3,3,2,3,3,2,3,2,2,3,2,3,2,3,2,3,3,3,3,3,2,3,3,2,2,3,2,3,3,3,3,3,2,3,2,2,3,2,2,3,3,2,3,2,3,3,3,2,2,2,2,3,3,3,3,3,3,3,2,2,2,3,3,2,2,2,2,2,2,2,3,3,2,2,3,2,2,3,2,2,3,2,3,3,2,2,2,3,3,3,3,3,2,3,2,3,3,2,3,3,3,2,2,3,3,2,3,3,3,2,3,2,2,3,3,2,3,2,3,3,3,3,2,3,2,2,2,3,3,3,2,2,2,2,3,3,2,3,2,3,3,3,2,3,2,3,2,2,3,3,3,2,2,3,2,2,2,2,3,3,2,3,3,2,2,2,3,2,3,3,2,2,2,2,2,3,3,2,3,3,3,2,3,2,3,3,2,3,2,2,2,2,3,3,2,3,2,3,2,3,2,2,2,2,2,2,3,3,2,2,2,3,2,2,3,2,3,2,3,3,2,2,3,3,3,3,3,3,2,3,3,2,3,3,3,3,3,2,2,3,3,3,2,3,3,2,3,2,2,3,2,2,3,3,3,2,3,2,2,3,3,3,2,2,2,3,3,3,3,2,2,2,3,2,2,2,2,3,2,2,2,2,2,3,2,2,2,3,2,2,2,2,3,2,2,3,3,2,2,3,2,2,3,3,2,3,3,3,3,3,3,3,2,2,3,2,2,3,3,2,3,3,2,2,2,3,3,3,3,3,2,3,3,2,2,3,3,3,2,2,2,2,2,2,2,3,2,2,2,3,2,3,3,3,3,3,2,2,2,3,3,3,2,2,3,2,3,2,3,2,3,3,2,3,2,2,2,2,2,2,2,2,3,3,3,2,2,3,2,2,2,3,3,2,3,2,2,2,3,3,2,2,3,2,3,3,2,3,3,2,3,3,3,2,2,2,2,2,2,2,3,2,3,2,3,2,3,3,2,2,3,3,2,2,3,3,3,2,2,2,2,3,2,3,3,2,2,3,3,2,3,2,2,2,2,3,2,3,3,2,3,2,3,3,2,3,2,3,3,2,3,3,3,3,3,2,2,3,3,3,3,2,3,3,2,3,3,2,3,2,3,2,2,2,2,2,3,2,3,2,3,2,2,2,2,3,3,2,2,2,3,3,3,2,2,3,3,3,2,2,3,3,3,3,3,3,3,3,3,2,3,2,3,3,3,3,2,2,3,2,2,2,3,3,2,2,3,3,3,3,2,3,2,3,2,3,2,2,2,3,2,2,2,3,3,3,2,2,3,3,2,3,3,2,3,3,2,2,3,3,3,3,2,3,2,3,2,2,3,3,3,3,3,3,3,2,2,3,2,3,3,3,3,2,3,2,2,3,2,3,2,3,2,3,2,2,2,2,2,3,3,3,2,2,3,3,3,3,3,3,3,2,2,2,2,3,2,2,2,2,3,3,3,3,2,3,3,2,3,3,3,3,3,3,3,2,3,2,3,2,2,2,2,2,2,2,2,2,3,2,2,2,3,3,2,3,2,3,3,2,3,2,3,2,2,2,2,3,3,3,3,3,2,3,3,2,3,3,3,2,2,3,3,3,3,3,3,3,2,2,3,3,3,2,3,3,3,3,2,2,3,3,3,3,2,2,3,3,2,2,2,2,2,3,3,3,2,2,2,2,3,2,2,2,2,3,3,3,3,3,3,2,2,2,3,2,3,2,3,3,3,3,3,3,2,2,2,2,3,2,3,2,2,3,2,3,2,3,2,3,2,2,3,2,2,2,2,3,3,3,2,2,3,3,3,3,2,3,2,3,3,3,3,2,2,3,3,2,2,3,2,2,3,3,2,2,2,2,3,3,3,2,3,2,3,2,2,3,3,2,2,2,3,3,2,3,2,3,3,2,3,3,2,2,3,2,2,3,2,2,2,2,2,3,2,3,3,2,3,2,2,3,2,3,3,3,2,3,2,2,2,3,3,2,2,2,3,2,3,3,2,3,3,2,2,2,2,3,2,3,3,3,2,2,2,3,3,3,3,3,3,3,3,2,3,3,3,2,3,2,2,2,2,3,2,2,3,2,2,2,3,3,3,2,3,3,3,2,2,2,2,3,3,3,2,3,2,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,2,3,3,3,3,3,2,3,3,3,2,3,2,2,2,2,2,3,3,3,3,2,3,3,3,2,3,3,2,2,3,2,3,2,3,3,3,3,2,2,3,3,3,3,3,3,3,3,3,3,3,2,3,2,3,2,2,2,2,2,2,3,2,2,3,2,3,2,3,3,3,2,2,2,2,2,2,3,3,3,2,2,3,2,3,2,2,3,2,2,2,2,3,2,2,2,2,3,3,2,3,2,2,3,2,2,3,2,2,3,3,2,3,2,2,2,2,3,2,2,3,2,3,3,2,3,3,3,3,2,3,2,2,3,3,3,2,3,3,2,2,3,2,3,3,3,2,2,2,2,2,3,2,3,2,2,3,2,3,2,2,2,2,3,2,3,2,2,2,3,2,2,2,2,2,2,3,2,2,3,2,2,3,2,2,3,2,3,3,2,3,2,2,3,3,2,2,3,2,3,2,2,3,3,3,3,3,2,3,3,2,3,3,3,3,3,2,2,2,2,2,3,2,2,2,3,3,3,2,3,2,2,2,3,3,3,3,2,3,2,3,3,2,3,2,3,2,3,3,3,3,3,2,3,2,3,2,3,2,2,2,2,2,2,3,2,3,2,2,3,3,2,2,3,3,3,2,3,2,2,2,3,3,3,2,3,2,2,2,2,2,3,2,2,3,3,2,3,2,3,2,3,3,2,2,2,3,2,3,3,2,2,2,2,3,2,3,3,2,2,3,2,3,3,3,2,2,3,3,2,2,3,3,3,2,3,3,3,2,3,3,2,3,3,2,2,2,2,3,2,2,2,3,3,3,2,3,3,3,3,2,2,2,3,3,2,3,3,2,3,2,3,3,3,2,2,3,2,2,2,3,2,2,2,3,3,2,2,2,3,3,2,3,2,2,3,2,3,2,2,2,2,3,3,3,2,3,2,2,3,2,3,3,2,3,2,3,3,3,3,3,2,2,2,2,2,3,3,3,3,3,3,3,3,2,2,3,2,2,3,3,2,3,3,2,2,3,3,2,2,3,3,3,3,3,3,3,3,2,2,2,2,3,2,3,3,2,2,3,3,3,3,3,2,2,2,3,3,3,3,2,2,2,3,3,3,2,2,2,3,2,3,3,3,3,2,3,3,2,2,2,3,3,2,2,3,2,3,3,3,2,3,2,2,2,3,3,2,2,2,3,2,3,2,2,2,2,3,3,2,3,2,2,3,2,2,2,2,3,3,3,3,2,3,3,2,3,2,3,3,2,2,3,3,3,3,3,3,2,3,2,2,3,2,3,3,2,3,3,3,3,2,2,3,2,3,2,3,3,3,2,2,3,3,3,2,3,3,2,3,2,2,3,3,2,2,2,2,2,3,3,3,3,3,2,3,2,2,2,3,3,2,3,3,2,3,3,3,2,3,2,2,3,2,3,3,2,3,3,2,2,2,3,3,3,2,3,3,2,3,3,2,2,2,3,2,3,2,3,3,2,3,3,3,3,2,3,2,3,2,2,3,3,2,3,2,2,2,2,2,3,3,2,3,3,3,3,3,2,2,2,2,2,2,3,3,2,2,3,2,3,2,3,2,2,2,2,2,2,2,2,2,3,3,3,3,2,3,2,2,3,2,2,3,2,2,3,3,2,2,3,3,2,2,3,2,3,2,2,3,2,3,3,2,2,3,3,2,2,3,3,3,3,3,3,2,3,2,3,2,2,2,3,3,2,3,3,3,3,2,3,3,3,2,3,3,3,2,3,3,3,2,3,3,2,2,3,3,2,2,3,2,2,3,3,2,2,3,2,3,3,3,2,2,3,2,3,3,2,2,2,2,3,3,3,3,3,2,2,3,2,2,2,2,3,3,2,3,2,2,2,3,3,2,3,3,2,2,2,3,3,2,3,2,2,2,3,3,2,3,3,2,3,3,2,2,2,2,3,3,3,3,2,2,2,2,3,2,2,3,3,3,2,2,3,2,2,2,3,2,2,2,2,3,3,2,2,2,3,3,3,2,3,3,2,3,3,2,3,2,3,3,3,3,3,3,3,2,3,3,2,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,2,3,3,2,3,2,3,2,2,2,3,3,2,3,2,3,2,2,2,3,3,3,2,2,2,3,2,2,2,3,3,3,2,2,3,3,3,2,2,3,2,3,2,3,2,3,2,3,3,2,2,2,3,3,2,3,2,2,2,2,3,3,3,2,2,2,3,3,2,3,2,3,3,2,2,3,3,2,2,2,2,3,2,3,2,2,3,2,2,3,2,2,2,2,2,2,2,3,3,3,3,3,2,2,2,2,3,3,2,2,2,2,3,2,3,3,3,2,3,3,3,3,3,2,3,3,2,2,3,2,3,2,3,3,2,3,3,3,3,3,3,3,3,2,3,2,3,2,3,2,2,2,2,3,2,3,3,3,3,2,3,2,2,2,3,2,2,2,3,3,3,3,2,2,3,3,3,3,2,2,3,2,2,3,3,3,3,2,2,2,2,3,3,2,3,2,2,3,3,2,2,2,3,2,3,2,2,2,3,2,2,3,2,2,2,3,3,3,2,3,2,2,2,3,3,2,3,3,3,2,3,2,3,2,2,2,3,2,2,2,2,2,3,2,2,2,2,2,3,2,3,3,2,2,2,3,2,2,3,3,2,2,3,3,3,2,3,2,2,3,2,3,3,2,3,2,2,3,2,3,3,3,3,2,3,3,3,3,3,2,3,2,3,2,3,2,2,3,2,3,2,2,2,2,2,3,2,2,3,2,2,2,3,3,2,3,2,2,2,2,2,3,2,3,2,3,3,2,2,3,3,3,2,3,3,2,3,3,3,2,3,3,2,2,2,3,3,2,3,2,2,3,3,2,3,3,2,2,2,2,2,3,3,2,3,2,2,2,3,3,2,2,2,2,3,2,3,2,3,2,2,3,2,2,2,3,3,2,3,3,2,3,3,2,3,2,2,2,2,2,3,2,2,2,2,3,2,2,2,3,2,2,3,2,2,3,3,2,3,3,3,3,2,2,3,2,2,2,2,2,2,3,2,2,3,3,2,2,3,2,3,3,2,2,2,3,3,3,3,2,2,2,2,3,3,3,3,3,3,3,2,3,2,2,2,2,3,2,2,2,2,3,2,2,2,2,3,3,3,2,2,2,3,2,3,2,3,2,3,3,3,3,2,3,2,2,3,3,2,3,2,2,3,2,3,3,2,2,2,3,3,2,3,2,2,2,2,2,2,3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,2,2,2,2,2,2,2,3,3,3,3,3,2,3,3,2,3,2,2,2,2,3,3,2,3,3,2,3,2,3,2,2,3,2,3,2,3,3,3,2,2,3,3,2,2,3,3,3,3,3,3,3,2,2,3,3,2,2,3,2,3,3,2,3,2,3,3,3,2,2,3,3,3,2,3,2,3,2,3,3,3,3,2,3,3,2,3,3,2,2,3,3,3,2,2,3,3,3,2,2,2,3,3,3,2,2,3,3,3,3,2,2,2,3,2,3,3,3,3,3,3,2,2,2,2,3,2,2,2,2,2,2,2,3,2,2,3,3,3,2,2,2,3,2,3,3,2,2,2,3,3,3,3,3,3,2,2,3,2,3,2,2,3,2,3,3,2,2,3,3,3,3,3,2,2,2,3,2,2,3,3,3,2,2,3,3,2,3,3,2,2,3,2,2,3,3,3,3,2,2,2,3,2,2,3};
		assertEquals(2,Solution.getVehiclesType(3313, 4010, width));
	}
}