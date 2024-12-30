package org.example;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(processaNumero(Optional.of(5)));
        System.out.println(processaNumero(Optional.of(-3)));
        System.out.println(processaNumero(Optional.empty()));
    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero){
        return numero.filter(n -> n > 0)
                .map(n -> n * n);
    }
}