package view;

import Controller.Pilha2;

public class Principal {
    public static void main(String[] args) {
        int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
        Pilha2 pilha = new Pilha2(vetor, 0, 0); 
        
        System.out.println("Valores na pilha: " + pilha.tamanho());
    }
}

