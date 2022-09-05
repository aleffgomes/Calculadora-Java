package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author alefgomes
 */
public class PrincipalCalculadora {
    public static void main(String[] args) {
        char op;
        Calculadora calc;
        Scanner scanM = new Scanner(System.in);

        do {
            menu();
            op = scanM.next().charAt(0);
            scanM.nextLine();
            System.out.println("-----------------------------------------------------");
            switch (op) {
                case '1':
                    calc = instanciaCalculadora(false);
                    System.out.println("Soma: " + calc.soma());
                    break;
                case '2':
                    calc = instanciaCalculadora(false);
                    System.out.println("Subtracao: " + calc.subtracao());
                    break;
                case '3':
                   calc = instanciaCalculadora(false);
                    System.out.println("Multiplicacao: " + calc.multiplicacao());
                    break;
                case '4':
                    calc = instanciaCalculadora(false);
                    System.out.println("Divisao: " + calc.divisao());
                    break;
                case '5':
                    calc = instanciaCalculadora(true);
                    System.out.println("Ao quadrado: " + calc.aoQuadrado());
                    break;
                case '0':
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            
            if (op != '0') {
                System.out.println("Aperte ENTER para continuar...");
                scanM.nextLine();
            }
            System.out.println("-----------------------------------------------------");
        } while (op != '0');
    }

    public static void menu() {
        System.out.println("----------------------------------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Ao quadrado");
        System.out.println("0 - Sair");
        System.out.println("----------------------------------------------------");
    }

    public static Calculadora instanciaCalculadora(boolean onenumber) {
        float num1, num2;
        Scanner scanC = new Scanner(System.in);

        if (onenumber) {
            System.out.println("Digite o numero: ");
            num1 = scanC.nextFloat();
            scanC.nextLine();
            Calculadora calc = new Calculadora(num1);
            return calc;
        } else {
            System.out.println("Digite o primeiro numero: ");
            num1 = scanC.nextFloat();
            scanC.nextLine();
            System.out.println("Digite o segundo numero: ");
            num2 = scanC.nextFloat();
            Calculadora calc = new Calculadora(num1, num2);
            return calc;
        }
    }
}
