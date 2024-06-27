package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapPoc {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e"),Arrays.asList("f", "g", "h"));
        listOfLists.stream().forEach((x)->System.out.println(x));
        List<String> flattenedList =listOfLists.stream()
            .flatMap(List->List.stream())
            .collect(Collectors.toList());

       
        //flattenedList.stream().forEach((x)->System.out.print(x));
        System.out.println(flattenedList); 
        
        List<List<Integer>> combinedlist = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(4, 7, 10, 41, 51)

            );
        System.out.println(combinedlist);
               List<Integer> flatMapList=combinedlist.stream().flatMap((x)->x.stream()).collect(Collectors.toList());
               
               List<Integer> flatMapList2=flatMapList.stream().flatMap((x)->Arrays.asList(x*2).stream()).collect(Collectors.toList());
              
              System.out.println(flatMapList2);
        
    }
}
