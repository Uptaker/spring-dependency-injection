package codes.drinky.di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18EstonianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18EstonianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Tere maailm! - EST";
    }
}
