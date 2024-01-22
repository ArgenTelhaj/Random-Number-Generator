package RandomNumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(YourClass.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("Info level log message");
        logger.error("Error level log message");
	}

}
