package Calculadora_IMC;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        int pesoKg = scanner.nextInt();

        System.out.println("Digite sua altura em m: ");
        double alturaM = scanner.nextDouble();

        double imc = pesoKg / (alturaM * alturaM);
         
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 18.5 && imc <= 25.9) {
            if (imc >= 18.5 && imc <= 25.9) {
                System.out.println("Peso Normal");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Sobrepeso");
            }
        }
        System.out.println("Seu IMC é: " + imc);
    }
}
