package com.example.pract_10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Pract10Application {

    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BeanConfig.class);

        Company company = context.getBean(Company.class);
        company.doProject();
    }

}

@Component
class Company {

    private final List<Programmer> programmers = new ArrayList<>();

    public Company(Programmer programmer1, Programmer programmer2, Programmer programmer3) {
        this.programmers.add(programmer1);
        this.programmers.add(programmer2);
        this.programmers.add(programmer3);

    }

    public void doProject() {
        for (Programmer programmer : programmers) {
            System.out.println("A programmer have just " + programmer.doCoding());
        }
    }
}

interface Programmer {
    String doCoding();
}

@Component
class Junior implements Programmer {

    @Override
    public String doCoding() {
        return "pushed merge request!";
    }
}

@Component
class Middle implements Programmer {

    @Override
    public String doCoding() {
        return "got merge request!";
    }
}

@Component
class Senior implements Programmer {

    @Override
    public String doCoding() {
        return "approved merge request!";
    }
}


@Configuration
@ComponentScan
class BeanConfig {

    @Bean
    public Programmer junior() {
        return new Junior();
    }

    @Bean
    public Programmer middle() {
        return new Middle();
    }

    @Bean
    public Programmer senior() {
        return new Senior();
    }

    @Bean
    public Company company(Programmer junior, Programmer middle, Programmer senior) {
        return new Company(junior, middle, senior);
    }


}