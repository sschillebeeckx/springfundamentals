package be.abis.exercise;

import be.abis.exercise.repository.PersonRepository;
import be.abis.exercise.service.AbisTrainingService;
import be.abis.exercise.service.CourseService;
import be.abis.exercise.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }


    @Bean
    public TrainingService trainingService(CourseService courseService){
        TrainingService trainingService = new AbisTrainingService(courseService);
        trainingService.setWelcomeMessage("Welcome to the Abis Training Service");
        return trainingService;
    }

}
