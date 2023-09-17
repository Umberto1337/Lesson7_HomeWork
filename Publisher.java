// public interface Publisher {

//     void sendOffer(String companyName, int salary);

//     void registerObserver(Observer observer);
//     void removeObserver(Observer observer);

// }

public interface Publisher {
    void sendOffer(String companyName, int salary);
    void sendVacancy(String companyName, Vacancy vacancy);
    void registerObserver(Observer observer);
    void registerVacancyObserver(Observer observer); 
    void removeObserver(Observer observer);
}