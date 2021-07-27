package codes.drinky.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "BLITZKRIEF SCHWEIN! - DE";
    }
}
