public abstract class AbstractCompany {
    private int age;
    private int experiences;
    private double salary;

    public AbstractCompany(int age, int experiences, double salary) {
        this.age = age;
        this.experiences = experiences;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperiences() {
        return experiences;
    }

    public void setExperiences(int experience) {
        this.experiences = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Критерий" +
                " age: " + age +
                ", experience: " + experiences +
                ", salary=" + salary;
    }

    public abstract void work();



}
