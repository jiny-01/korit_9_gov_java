package com.korit.study.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Input03 {
    public static void main(String[] args) throws IOException {      //IOException: Input/Output 예외
//        InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader br = new BufferedReader(inputStreamReader);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
//        System.out.println(Integer.parseInt(line));
        String[] datas = line.split(" ");
        Arrays.stream(datas).forEach(System.out::println);
    }
}
