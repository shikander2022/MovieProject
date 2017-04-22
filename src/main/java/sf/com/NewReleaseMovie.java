package sf.com;


public class NewReleaseMovie extends CustomerPoint implements Computable {
	int onedayRental;
	int afterSevenDaysRental;
	int numberOfDaysRented;
	int totalForFirstThreeDays;
	int computeForFistThreeDays;
	int computeForMoreThanThreeDays;
	int totalForMoreThanThreeDays;
	int totalPoints;
	private int eachDayMovieRented = 2;

	public int getOnedayRental() {
		return onedayRental;
	}

	public void setOnedayRental(int onedayRental) {
		this.onedayRental = onedayRental;
	}

	public int getAfterSevenDaysRental() {
		return afterSevenDaysRental;
	}

	public void setAfterSevenDaysRental(int afterSevenDaysRental) {
		this.afterSevenDaysRental = afterSevenDaysRental;
	}

	public int getNumberOfDaysRented() {
		return numberOfDaysRented;
	}

	public void setNumberOfDaysRented(int numberOfDaysRented) {
		this.numberOfDaysRented = numberOfDaysRented;
	}

	public int getTotalForFirstThreeDays() {
		return totalForFirstThreeDays;
	}

	public void setTotalForFirstThreeDays(int totalForFirstThreeDays) {
		this.totalForFirstThreeDays = totalForFirstThreeDays;
	}

	public int getComputeForFistThreeDays() {
		return computeForFistThreeDays;
	}

	public int setComputeForFistThreeDays(int computeForFistThreeDays) {
		return this.computeForFistThreeDays = computeForFistThreeDays;
	}

	public int getComputeForMoreThanThreeDays() {
		return computeForMoreThanThreeDays;
	}

	public int setComputeForMoreThanThreeDays(int computeForMoreThanThreeDays) {
		return this.computeForMoreThanThreeDays = computeForMoreThanThreeDays;
	}

	public int getTotalForMoreThanThreeDays() {
		return totalForMoreThanThreeDays;
	}

	public void setTotalForMoreThanThreeDays(int totalForMoreThanThreeDays) {
		this.totalForMoreThanThreeDays = totalForMoreThanThreeDays;
	}

	// Compute rental amount for regular movie
	public void totalCompute() {
		if (numberOfDaysRented < 3) {
			totalForFirstThreeDays = (computeForFistThreeDays * 3);

		} else {
			totalForMoreThanThreeDays = computeForMoreThanThreeDays * 6;
		}

	}

	public void eachDayMovieRented() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eachDayMovieRentedCustomer() {
		totalPoints = eachDayMovieRented++;

	}
}
