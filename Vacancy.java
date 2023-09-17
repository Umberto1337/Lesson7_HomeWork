public class Vacancy {
    private String title;
    private String description;
    private int requiredExperience;
    private int requiredSalary;

    public Vacancy(String title, String description, int requiredExperience, int requiredSalary) {
        this.title = title;
        this.description = description;
        this.requiredExperience = requiredExperience;
        this.requiredSalary = requiredSalary;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public int getRequiredSalary() {
        return requiredSalary;
    }
}
