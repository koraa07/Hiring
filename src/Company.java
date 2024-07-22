public class Company extends AbstractCompany implements Resume{
    public Company(int age, int experiences, double salary) {
        super(age, experiences, salary);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getExperiences() {
        return super.getExperiences();
    }

    @Override
    public void setExperiences(int experience) {
        super.setExperiences(experience);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public void work() {
        System.out.println("печатаем");
    }

    @Override
    public void checkResume(int experience, int age, double expectedSalary) {
        if(experience >= getExperiences() && age >= getAge() && expectedSalary <= getSalary()){
            System.out.println("подходите");
        }
    }
}
