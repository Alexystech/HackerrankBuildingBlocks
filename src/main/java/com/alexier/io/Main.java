package com.alexier.io;

import java.util.*;

public class Main {
  public static void main(String... args) {
    List<Integer> birds = new ArrayList<Integer>();
    birds.add(1);
    birds.add(2);
    birds.add(3);
    birds.add(4);
    birds.add(5);
    birds.add(4);
    birds.add(3);
    birds.add(2);
    birds.add(1);
    birds.add(3);
    birds.add(4);

    System.out.println(migratoryBirds(birds));
  }

  public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    /**
     * #1 order the list 1
     * 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5
     */
    arr.sort(Collections.reverseOrder());

    System.out.println(arr);

    /**
     * Contar la cantidad de coincidencias
     */
    int quantityBirds = arr.size();
    int beforeBird = arr.get(0);
    Map<Integer, Integer> birds = new HashMap<>();
    List<Integer> keys = new ArrayList<>(); // keys son el tipo de ave
    int counterBirds = 0;

    for (int i = 0; i < quantityBirds; i++) {
      int currentBird = arr.get(i);

      if (beforeBird == currentBird) {
        counterBirds++;
        if (isLastBird(i, quantityBirds)) {
          keys.add(counterBirds);
          birds.put(counterBirds, currentBird);
        }
      } else {
        if (isLastBird(i, quantityBirds)) {
          keys.add(counterBirds);
          birds.put(counterBirds, beforeBird);

          keys.add(1);
          birds.put(1, currentBird);
        } else {
          int finalBeforeBird = beforeBird;
          keys.stream().filter(typeBird -> typeBird == finalBeforeBird);
          keys.add(counterBirds);
          birds.put(counterBirds, beforeBird);
        }
        counterBirds = 1;
      }

      beforeBird = arr.get(i);
    }

    System.out.println(keys);
    keys.sort(Collections.reverseOrder());
    int maxQuantityOfBirds = keys.get(0);

    return birds.get(maxQuantityOfBirds);
  }

  private static boolean isLastBird (int currentIndexBird, int lastIndexBird) {
    return currentIndexBird == lastIndexBird - 1;
  }
}