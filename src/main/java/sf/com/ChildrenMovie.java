package sf.com;


public class ChildrenMovie extends CustomerPoint implements Computable {
	int onedayRental;
	int afterSevenDaysRental;
	int numberOfDaysRented;
	int totalForFirstSevenDays;
	int computeForFistSevenDays;
	int computeForMoreThanSevenDays;
	int totalForMoreThanSevenDays;
	int eachDayMovieRented;
	int totalPoints;

	public int getComputeForMoreThanSevenDays() {
		return computeForMoreThanSevenDays;
	}

	public int setComputeForMoreThanSevenDays(int computeForMoreThanSevenDays) {
		return this.computeForMoreThanSevenDays = computeForMoreThanSevenDays;
	}

	public int getNumberOfDaysRented() {
		return numberOfDaysRented;
	}

	public void setNumberOfDaysRented(int numberOfDaysRented) {
		this.numberOfDaysRented = numberOfDaysRented;
	}

	public int getTotalForFirstSevenDays() {
		return totalForFirstSevenDays;
	}

	public void setTotalForFirstSevenDays(int totalForFirstSevenDays) {
		this.totalForFirstSevenDays = totalForFirstSevenDays;
	}

	public int getComputeForFistSevenDays() {
		return computeForFistSevenDays;
	}

	public int setComputeForFistSevenDays(int computeForFistSevenDays) {
		return this.computeForFistSevenDays = computeForFistSevenDays;
	}

	public int getTotalForMoreThanSevenDays() {
		return totalForMoreThanSevenDays;
	}

	public int setTotalForMoreThanSevenDays(int totalForMoreThanSevenDays) {
		return this.totalForMoreThanSevenDays = totalForMoreThanSevenDays;
	}

	public void setOnedayRental(int onedayRental) {
		this.onedayRental = onedayRental;
	}

	public void setAfterSevenDaysRental(int afterSevenDaysRental) {
		this.afterSevenDaysRental = afterSevenDaysRental;
	}

	public int getOnedayRental() {
		return onedayRental;
	}

	public int getAfterSevenDaysRental() {
		return afterSevenDaysRental;
	}

	// Compute rental amount for children' movie
	public void totalCompute() {
		if (numberOfDaysRented < 7) {
			totalForFirstSevenDays = computeForFistSevenDays * 1;

		} else {
			totalForMoreThanSevenDays = computeForMoreThanSevenDays * 2;
		}

	}

	public void eachDayMovieRented() {

	}

	@Override
	public void eachDayMovieRentedCustomer() {
		if (numberOfDaysRented > 3) {
		totalPoints = eachDayMovieRented++;
		}


	}

}
