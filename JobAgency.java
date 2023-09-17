import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> vacancyObservers = new ArrayList<>();

    @Override
    public void sendVacancy(String companyName, Vacancy vacancy) {
        for (Observer observer : vacancyObservers) {
            observer.receiveVacancy(companyName, vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer instanceof Observer) {
            vacancyObservers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer instanceof Observer) {
            vacancyObservers.remove(observer);
        }
    }

    @Override
    public void sendOffer(String companyName, int salary) {
        
        throw new UnsupportedOperationException("Unimplemented method 'sendOffer'");
    }

    @Override
    public void registerVacancyObserver(Observer observer) {
        
        throw new UnsupportedOperationException("Unimplemented method 'registerVacancyObserver'");
    }
}
