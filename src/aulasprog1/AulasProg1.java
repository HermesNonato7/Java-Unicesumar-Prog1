package aulasprog1;

import java.util.Scanner;

/**
 *
 * @author HermesNonato7
 */
public class AulasProg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new AulasProg1().caso_9();//Após o ponto final, colocar o método(caso) que quer rodar. 

    }

    // IF
    public void caso_1() {

        int valor1 = 5;
        int valor2 = 10;

        if (valor1 > valor2) {
            System.out.println("O valor 1 maior que o valor 2");
        }

        System.out.println("Soma dos valores: " + (valor1 + valor2));
    }

    //IF ESLE
    public void caso_2() {

        int valor1 = 10;
        int valor2 = 15;

        if (valor1 > 10 && valor2 > 10) {
            System.out.println("1) Os dois valores são maiores que 10");
        } else {
            System.out.println("1) O primeiro ou o segundo valor não é maior que 10");
        }
        if (valor1 > 10 || valor2 > 10) {
            System.out.println("2) Um dos números é maior que 10");
        } else {
            System.out.println("2) Nenhum número é  maior que 10");
        }
    }

    //SWITCH CASE
    public void caso_3() {

        System.out.println("Digite um dos comentários abaixo do memu");
        System.out.println("1: Comprar; 2: Vender; 3: Listar; 4: Sair");

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Você acessou COMPRAR");
                break;

            case 2:
                System.out.println("Você acessou VENDER");
                break;

            case 3:
                System.out.println("Você acessou LISTAR");
                break;
            default:
                System.out.println("Saindo do sistema");
        }
    }

    /* 
    
    // Exemplo de código que funciona mas não é otimizado como o switch
    
    // IF - ESLE IF

    public void caso_3_2() {

        System.out.println("Digite um dos comentários abaixo do memu");
        System.out.println("1: Comprar; 2: Vender; 3: Listar; 4: Sair");

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        
        
        if (opcao == 1) {
            System.out.println("Você acessou COMPRAR");
        } else if (opcao == 2) {
            System.out.println("Você acessou VENDER");
        } else if (opcao == 3) {
            System.out.println("Você acessou LISTAR");
        } else {
            System.out.println("Saindo do sistema");
        }
     */
    // FOR
    public void caso_4() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }

    // FOR
    public void caso_5() {

        boolean achou = false;

        for (int i = 0; (!achou); i++) {
            System.out.println(i);
            if (i == 5) {
                achou = true;
            }
        }

    }

    // WHILE
    public void caso_6() {
        int contador = 0;
        while (contador < 5) {
            System.out.println("Repetição Nro: " + contador);
            contador++;
        }
    }

    // DO WHILE
    public void caso_7() {

        int valor = 1;

        do {
            System.out.println("O número é: " + valor);
            valor++;
        } while (valor < 5);

    }

    // BREAK
    public void caso_8() {
        for (int cont = 1; cont <= 500; cont++) {
            System.out.println("nr: " + cont);
            if (cont == 6);
            break;
        }
    }

    public void caso_9() {

        for (int i = 0; i < 12; i++) {
            if ((i > 4) && (i < 8)) {
                continue;
            }
            // apresenta na tela quando o i nao estiver entre 4 e 8
            System.out.println("i = " + i);

        }
    }

}
