package sf.com;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class RegularMovieTest {

	RegularMovie regularMovie;

	@Before
	public void setup() {
		regularMovie = new RegularMovie();

	}

	@Test
	public void verifyRentalAmountForRegularMovie() throws Exception {
		int res = regularMovie.setComputeForFistFiveDays(8);
		// System.out.println(regularMovie.getComputeForFistFiveDays());
		assertEquals(res, regularMovie.getComputeForFistFiveDays());

	}

}
