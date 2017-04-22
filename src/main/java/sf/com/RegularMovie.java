package sf.com;


public class RegularMovie implements Computable {

	int onedayRental;
	int afterSevenDaysRental;
	int numberOfDaysRented;
	int totalForFirstfiveDays;
	int computeForFistFiveDays;
	int computeForMoreThanfiveDays;
	int totalForMoreThanfiveDays;


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

	public int getTotalForFirstfiveDays() {
		return totalForFirstfiveDays;
	}

	public int setTotalForFirstfiveDays(int totalForFirstfiveDays) {
		return this.totalForFirstfiveDays = totalForFirstfiveDays;
	}

	public int getComputeForFistFiveDays() {
		return computeForFistFiveDays;
	}

	public int setComputeForFistFiveDays(int computeForFistFiveDays) {
		return this.computeForFistFiveDays = computeForFistFiveDays;
	}

	public int getComputeForMoreThanfiveDays() {
		return computeForMoreThanfiveDays;
	}

	public void setComputeForMoreThanfiveDays(int computeForMoreThanfiveDays) {
		this.computeForMoreThanfiveDays = computeForMoreThanfiveDays;
	}

	public int getTotalForMoreThanfiveDays() {
		return totalForMoreThanfiveDays;
	}

	public void setTotalForMoreThanfiveDays(int totalForMoreThanfiveDays) {
		this.totalForMoreThanfiveDays = totalForMoreThanfiveDays;
	}


	// Compute rental amount for regular movie
	public void totalCompute() {
		if (numberOfDaysRented < 5) {
			totalForFirstfiveDays = computeForFistFiveDays * 2;

		} else {
			totalForMoreThanfiveDays = computeForMoreThanfiveDays * 3;
		}

	}

	public void eachDayMovieRented() {
		// TODO Auto-generated method stub

	}


}
