public class Company {


    private String name;
    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void sendVacancy(Vacancy vacancy){

        jobAgency.sendVacancy(name, vacancy);
    }

}