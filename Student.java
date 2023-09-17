public class Student implements Observer{

    private String name;
    private int requiredSalary;

    public Student(String name, int requiredSalary) {
        this.name = name;
        this.requiredSalary = requiredSalary;
    }

    @Override
    public void receiveVacancy(String nameCompany, Vacancy vacancy) {
        if (this.requiredSalary >= vacancy.getRequiredSalary()) {
            System.out.printf("%s %s: Мне подходит вакансия! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    this.getClass().getSimpleName(), name, nameCompany, vacancy.getTitle(), vacancy.getRequiredSalary());
            this.requiredSalary = vacancy.getRequiredSalary();
        } else {
            System.out.printf("%s %s: Эта вакансия не для меня. (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    this.getClass().getSimpleName(), name, nameCompany, vacancy.getTitle(), vacancy.getRequiredSalary());
        }
    }
    
}