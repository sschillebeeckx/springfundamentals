package be.abis.exercise;

import be.abis.exercise.service.AbisTrainingService;
import be.abis.exercise.service.CourseService;
import be.abis.exercise.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ExerciseApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

    @Bean
    @Profile("production")
    public TrainingService trainingService(@Qualifier("abisCourseService") CourseService courseService){
        TrainingService trainingService = new AbisTrainingService(courseService);
        trainingService.setWelcomeMessage(env.getProperty("hello.message"));
        return trainingService;
    }

}
