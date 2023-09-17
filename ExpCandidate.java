public class ExpCandidate implements Observer {
    private String name;
    private int experience;

    public ExpCandidate(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public void receiveVacancy(String nameCompany, Vacancy vacancy) {
        if (experience >= vacancy.getRequiredExperience()) {
            System.out.printf("Опытный соискатель %s: Мне подходит вакансия! (компания: %s; вакансия: %s)\n",
                    name, nameCompany, vacancy.getTitle());
        } else {
            System.out.printf("Опытный соискатель %s: Эта вакансия не для меня. (компания: %s; вакансия: %s)\n",
                    name, nameCompany, vacancy.getTitle());
        }
    }
}
