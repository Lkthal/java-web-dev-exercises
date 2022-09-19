package org.launchcode.java.ArrayLesson;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>(10);
        sum.add(2);
        sum.add(33);
        sum.add(22);
        sum.add(12);
        sum.add(5);
        sum.add(8);
        sum.add(13);
        sum.add(7);
        sum.add(17);
        sum.add(19);
        System.out.println(sum);
        int total = 0;
        for (int i = 0; i < sum.size(); i++) {
            if(sum.get(i) % 2 ==0){
                total += sum.get(i);
            }
        }
        System.out.println(total);
    }

}
