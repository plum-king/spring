package umc.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class StudyApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(StudyApplication.class, args);
	}

}