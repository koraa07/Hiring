public class Candidate{
    private int experience;
    private int age;
    private double expectedSalary;
    private String name;

    public Candidate(int experience, int age, double expectedSalary,String name) {
        this.experience = experience;
        this.age = age;
        this.expectedSalary = expectedSalary;
        this.name = name;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "experience: " + experience +" years, "+
                " age: " + age + " years old, " + " name: " + name +
                ", expected salary: " + expectedSalary;
    }
}
