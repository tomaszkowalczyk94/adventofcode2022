package org.example.day1;

import java.util.Scanner;

public class Day1 {

    public void run() {
        String input = Input.INPUT;

        Scanner scanner = new Scanner(input);

        var sum = 0;
        var maxValue = 0;
        var maxIndex = 0;

        var currentIndex = 1;


        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            if(line.isBlank()) {
                currentIndex++;
                sum = 0;
            } else {
                sum = sum + Integer.valueOf(line.trim());
            }

            if(sum>maxValue) {
                maxValue = sum;
                maxIndex = currentIndex;
            }


        }
        System.out.println(maxValue);
        System.out.println(maxIndex);

    }

}
