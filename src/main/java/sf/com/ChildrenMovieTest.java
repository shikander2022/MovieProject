package sf.com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ChildrenMovieTest {

	ChildrenMovie childrenMovie;

	@Before
	public void setup() {
		childrenMovie = new ChildrenMovie();

	}

	@Test
	public void verifyRentalAmountForChildrenMovie() throws Exception {

		int res = childrenMovie.setComputeForFistSevenDays(5);
		// System.out.println(regularMovie.getComputeForFistFiveDays());
		assertEquals(res, 5);

	}

	@Test
	public void verifyRentalAmountForChildrenMovieForMoreThenSevenDays()
			throws Exception {
		ChildrenMovie childMovie1 = new ChildrenMovie();
		int res = childMovie1.setComputeForMoreThanSevenDays(5);
		assertEquals(res, childMovie1.getComputeForMoreThanSevenDays());
	}

}
