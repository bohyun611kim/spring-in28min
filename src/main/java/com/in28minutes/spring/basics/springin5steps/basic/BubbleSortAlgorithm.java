package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
  public int[] sort(int[] numbers) {
    // Logic for Bubble Sort
    System.out.println("bubble 정렬 호출...");
    return numbers;
  }
}
