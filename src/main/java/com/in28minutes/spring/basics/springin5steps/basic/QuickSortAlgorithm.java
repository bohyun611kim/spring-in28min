package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
  public int[] sort(int[] numbers) {
    // Logic for Quick Sort
    System.out.println("quick 정렬 호출...");
    return numbers;
  }
}
