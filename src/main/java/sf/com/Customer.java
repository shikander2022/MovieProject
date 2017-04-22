package sf.com;


public class Customer {

	String childrenMovie;
	String regularMovie;
	String newReleaseMovie;

	ChildrenMovie childrenMovieMethod;

	int points;
	int numberOfDaysRented;

	public String getChildrenMovie() {
		return childrenMovie;
	}

	public String setChildrenMovie(String childrenMovie) {
		return this.childrenMovie = childrenMovie;
	}

	public String getRegularMovie() {
		return regularMovie;
	}

	public String setRegularMovie(String regularMovie) {
		return this.regularMovie = regularMovie;
	}

	public String getNewReleaseMovie() {
		return newReleaseMovie;
	}

	public void setNewReleaseMovie(String newReleaseMovie) {
		this.newReleaseMovie = newReleaseMovie;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getNumberOfDaysRented() {
		return numberOfDaysRented;
	}

	public void setNumberOfDaysRented(int numberOfDaysRented) {
		this.numberOfDaysRented = numberOfDaysRented;
	}


}
