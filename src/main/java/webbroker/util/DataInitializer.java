package webbroker.util;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import webbroker.entity.entity.Broker;
import webbroker.entity.entity.Role;
import webbroker.entity.enums.BrokerRole;
import webbroker.repository.BrokerRepository;
import webbroker.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BrokerRepository brokerRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if(roleRepository.count()<1){
            Role guest = new Role(BrokerRole.BROKER, new ArrayList<>());
            Role moderator = new Role(BrokerRole.MODERATOR, new ArrayList<>());
            Role admin = new Role(BrokerRole.ADMIN, new ArrayList<>());
            roleRepository.saveAll(List.of(guest, moderator, admin));
        }
        if(brokerRepository.count()<1){
            Role role = this.roleRepository.findByName(BrokerRole.ADMIN);
            Broker broker = new Broker("admin", passwordEncoder.encode("admin"), role, new ArrayList<>(), new ArrayList<>());
            brokerRepository.save(broker);
        }
    }
}
