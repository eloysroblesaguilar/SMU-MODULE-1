package com.company;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        // CODE GOES HERE
        try {
            List<Television> televisions = FileIO.getTelevisions("televisions.csv");


            int minimumScreenSize = 60;

            televisions
                    .stream()
                    .filter(tv -> tv.getScreenSize() > minimumScreenSize)
                    .forEach(System.out::println);

            Map<String, List<Television>> groupedTelevisions =
                    televisions
                            .stream()
                            .collect(Collectors.groupingBy(tv -> tv.getBrand()));

            Set<String> keys = groupedTelevisions.keySet();
            for (String key : keys) {
                System.out.println(key);
            }

            double avgScreenSize =
                    televisions
                            .stream()
                            .mapToInt(tv -> tv.getScreenSize())
                            .average()
                            .getAsDouble();
            System.out.println("Average screen size is: " + avgScreenSize);

            int maxScreenSize =
                    televisions
                            .stream()
                            .mapToInt(tv -> tv.getScreenSize())
                            .max()
                            .getAsInt();
            System.out.println("Largest screen size is: " + maxScreenSize);

            televisions.sort((tv1, tv2) ->
                    {
                        if (tv1.getScreenSize() < tv2.getScreenSize()) {
                            return 1;
                        } else if (tv1.getScreenSize() == tv2.getScreenSize()){
                            return 0;
                        }else {
                            return -1;
                        }
                    }
            );

            System.out.println(televisions);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
