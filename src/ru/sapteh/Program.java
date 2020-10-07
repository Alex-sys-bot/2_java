package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args)throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа, которые хотите сложить: ");

        int sum = 0;
        while (true){
            int input = Integer.parseInt(buffer.readLine());
            sum += input;
            if (input == -1) break;
            System.out.println(sum);
        }
    }
}

