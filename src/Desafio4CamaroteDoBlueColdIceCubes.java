// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner;

public class Desafio4CamaroteDoBlueColdIceCubes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com
        // o range de entrada, são ímpares.

        for (int i = 1; i < tamanhoDaFila; i += 2) {

            // if (tamanhoDaFila % 2 != 0) {
            // pessoasNoCamarote+=2;
            // }else {

            pessoasNoCamarote++;
            // }

        }

        if (tamanhoDaFila % 2 != 0) {
            System.out.println(Math.max(pessoasNoCamarote + 1, pessoasNoCamarote) + " pessoas no camarote");
        }else {
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }

    }
}