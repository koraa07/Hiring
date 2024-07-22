public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate(3,25,150000.0,"Zoe");
        System.out.println(candidate.toString());

        Company company = new Company(25,5,100000.0);
        System.out.println(company.toString());
        company.checkResume(3,25,1500000.0);



    }
}