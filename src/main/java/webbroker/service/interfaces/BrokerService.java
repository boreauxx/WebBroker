package webbroker.service.interfaces;

import org.springframework.security.core.Authentication;

public interface BrokerService {

    Authentication login(String username);
}
