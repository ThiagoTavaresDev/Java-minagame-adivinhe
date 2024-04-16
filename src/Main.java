////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
//
//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
//
//Dicas:
//
//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroSorteado = new Random().nextInt(100);
        Scanner leituraTentativas = new Scanner(System.in);


        System.out.println("Digite um numero enntre 0 e 100 e tente adivinhar em 5 tentativas");
        for(int contador = 1; contador <= 5;contador++){
            int numeroSelecionado = leituraTentativas.nextInt();
            if(numeroSorteado > numeroSelecionado) {
            System.out.println("O numero sorteado é maior que o número escolhido");

            }
            else if(numeroSorteado == numeroSelecionado){
                System.out.println("Parabéns o voce acertou o numero sorteado");
                break;
            }
            else{
                System.out.println("O número sorteado é menor que o número escolhido");
            }
        }
        System.out.println("o número sorteado era " + numeroSorteado);
        }
}
