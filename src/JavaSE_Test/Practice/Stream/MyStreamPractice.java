package JavaSE_Test.Practice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("list = " + list);

        // double the elements of the list.
        List<Integer> listTimes2 = list.stream().map( a ->  a*2  ).collect(Collectors.toList());
        System.out.println("listTimes2 = " + listTimes2);

        // adding 2 to each element of the list.
        List<Integer> listPlus2 = list.stream().map( a ->  a+2  ).collect(Collectors.toList());
        System.out.println("listPlus2 = " + listPlus2);


    }
}
