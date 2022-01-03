package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan") // 빈 어노테이션을 검색해서 빈을 생성한다. 
public class SpringIn5StepsComponentScanApplication {

  private static Logger LOGGER =
      LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

  public static void main(String[] args) {

    ApplicationContext applicationContext =
        SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

    ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

    LOGGER.info("생성된 빈 : {}", componentDAO);

  }
}
