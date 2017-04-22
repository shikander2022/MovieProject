package sf.com;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NewReleaseMovieTest {

	NewReleaseMovie newReleaseMovie;

	@Before
	public void setup() {
		newReleaseMovie = new NewReleaseMovie();

	}

	@Test
	public void verifyRentalAmountForNewReleaseMovie() throws Exception {

		int res = newReleaseMovie.setComputeForFistThreeDays(5);
		// System.out.println(newReleaseMovie.getComputeForFistThreeDays());
		assertEquals(res, 5);
		// System.out.println(newReleaseMovie.getTotalForFirstThreeDays());

	}

	@Test
	public void verifyRentalAmountForNewReleaseMovieForMoreThenThreeDays()
			throws Exception {
		NewReleaseMovie newReleaseMovie1 = new NewReleaseMovie();
		int res = newReleaseMovie1.setComputeForMoreThanThreeDays(5);
		// assertEquals(newReleaseMovie1.getTotalForMoreThanThreeDays(), res);
		// System.out.println(newReleaseMovie1.getTotalForMoreThanThreeDays());

	}

}
