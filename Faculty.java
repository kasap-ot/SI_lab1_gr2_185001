class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public int numStudents() {
        return students.size();
    }

    public double averageGrade() {
        double result = 0.00;
        for (Student s : students)
            result += s.getAverage();
        result /= (double)(students.size());
        return result;
    }
}