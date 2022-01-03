package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  @Qualifier("bubble")
  private SortAlgorithm sortAlgorithm;

  public int binarySearch(int[] numbers, int numberToSearchFor) {

    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    // Search the array
    return 3;
  }

  @PostConstruct
  public void postConstruct() {
    logger.info("postConstruct : 빈이 생성전에 초기화 블록");
  }

  @PreDestroy
  public void preDestroy() {
    logger.info("preDestroy : 빈 생성후에 자원해제 작업");
  }

}
