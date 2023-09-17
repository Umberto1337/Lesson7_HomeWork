public class Program {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Petrov", 1000);
        Master master1 = new Master("Ivanov", 75000);
        Master master2 = new Master("Sidorov", 80000);

        ExpCandidate candidate1 = new ExpCandidate("Zuev", 5);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(candidate1);

        for (int i = 0; i < 3; i++) {
            Vacancy googleVacancy = new Vacancy("Software Engineer", "Java Developer", 2, 55000);
            Vacancy yandexVacancy = new Vacancy("Backend Developer", "Python Developer", 3, 40000);
            Vacancy geekBrainsVacancy = new Vacancy("Web Developer", "Frontend Developer", 1, 38000);
        
            google.sendVacancy(googleVacancy);
            yandex.sendVacancy(yandexVacancy);
            geekBrains.sendVacancy(geekBrainsVacancy);
        }
        
    }

}