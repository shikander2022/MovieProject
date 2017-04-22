package sf.com;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	Customer customer;
	@Before
	public void setup() {
		customer = new Customer();
		ChildrenMovie childrenMovie = new ChildrenMovie();
	}

	@Test
	public void verifyChildrenMovie() throws Exception {
		String res = customer
.setChildrenMovie("This is Children movie");
		assertEquals(res, "This is Children movie");
	}

	@Test
	public void verifyRegularMovie() throws Exception {
		String res = customer.setRegularMovie("This is Regular movie");
		assertEquals(res, "This is Regular movie");

	}

	@Test
	public void verifyNewReleaseMovie() throws Exception {
		String res = customer.setRegularMovie("This is New movie");
		assertEquals(res, "This is New movie");

	}

	@Test
	public void VerifyChildernRentalAmount() throws Exception {
		ChildrenMovie childMovie1 = new ChildrenMovie();
		int res = childMovie1.setComputeForFistSevenDays(3);
		assertEquals(res, 3);
	}

	@Test
	public void verifyChildrenRentalAmountForMoreThanSevenDays()
			throws Exception {
		ChildrenMovie childMovie2 = new ChildrenMovie();
		int res = childMovie2.setComputeForMoreThanSevenDays(8);
		;
		assertEquals(res, 8);
	}

}
