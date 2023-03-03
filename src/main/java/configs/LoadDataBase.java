package configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import model.Employee;
import repository.EmployeeRepository;

@Configuration
public class LoadDataBase {
        private static final Logger log =  LoggerFactory.getLogger(LoadDataBase.class);
    @Bean
    CommandLineRunner initDataBase(EmployeeRepository repository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                log.info("preloading"+repository.save(new Employee("rutuja","HR")));
                log.info("preloading"+repository.save(new Employee("anjali","CR")));
                log.info("preloading"+repository.save(new Employee("sakshi","employee")));
            }
        };
        
    }

    }


