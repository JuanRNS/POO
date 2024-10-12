
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        Random sorteio = new Random();
        int numSorteio = sorteio.nextInt(101);
        int palpite = -1;
        int maximo = 100;
        int minimo = 0;
        int palpites = 1;
        System.out.println("Esse é um jogo para adivinhar um numero que está entre 0 e 100, Boa sorte!");
        while (palpite != numSorteio) {
                System.out.println( palpites + "º tentativa, digite um numero entre " + minimo + " e " + maximo);
                palpite = numero.nextInt();
                palpites++;

                if (palpite > numSorteio) {
                    System.out.println("Digite um numero menor do que " + palpite);
                    maximo = palpite ;
                } else if (palpite < numSorteio) {
                    System.out.println("Digite um numero maior do que " + palpite);
                    minimo = palpite ;
                } else
                    System.out.println("Parabéns você acertou o numero sorteado " +numSorteio);
            }
        }
    }


