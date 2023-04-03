package Controller;

import Kreis.PilhaInt.PilhaInt;

public class Pilha2 {

    private PilhaInt pilha = new PilhaInt(16);

    public Pilha2(int[] vetor, int empilha, int desempilha) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 0) {
                pilha.empilhar(vetor[i]);
            } else {
                int a = pilha.desempilhar();
                int b = pilha.desempilhar();
                int soma = a + b;
                pilha.empilhar(soma);
                pilha.empilhar(vetor[i]);
            }
        }
    }   
    public int tamanho() {
        return pilha.tamanho();
    }
}