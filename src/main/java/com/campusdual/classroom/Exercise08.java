package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(15);
    }

    // FIXME Añadir tildes en el test para "próximo" y "valdrá" :)
    public static void whileLoop(int num) {
        int x = 0;
        while (x < num) {
            System.out.println(x + " < " + num + ". El proximo ciclo valdra: " + ++x);
        }
    }
}
