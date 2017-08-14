package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'
                , 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 2; i <= letters.length; i += 3) {
            System.out.print(letters[i]);
        }
    }
}
