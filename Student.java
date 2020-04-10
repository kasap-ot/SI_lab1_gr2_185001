class Student {
	String index;
	String firstName;
	String lastName;

	int[] grades = {5, 6, 7, 8, 9, 10};

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		double average = 0.00;
		for (int grade : grades)
			average += grade;
		average /= grades.length;
		return average;
	}

	public int ECTSCredits() {
		int credits = 0;
		for (int grade : grades)
			if (grade > 5)
				credits += 6;
		return credits;
	}
}
