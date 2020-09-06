package com.zc.springboot.online_exam.deam;

import org.springframework.data.relational.core.sql.In;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class DeamTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        String s = scanner.nextLine();
        String[] s1 = s.split( " " );
        int[] a = new int[100];
        for (int i = 0; i <s1.length ; i++) {
            a[i] = Integer.parseInt( s1[i] );
        }
        Arrays.sort( a );
        for (int i = a.length-s1.length+1; i <a.length-1 ; i++) {
                System.out.println(a[i]);
        }
    }
}
