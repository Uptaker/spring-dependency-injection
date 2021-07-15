package codes.drinky.di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EST")
@Service("i18nService")
public class I18EstonianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Tere maailm! - EST";
    }
}
