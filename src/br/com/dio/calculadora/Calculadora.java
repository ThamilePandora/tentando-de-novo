package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite um valor para a conta:");
		a = teclado.nextInt();
		System.out.println("Digite outro valor para a conta:");
		b = teclado.nextInt();
		
		System.out.println("Qual tipo de conta você deseja?");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Divisão");
		System.out.println("4. Multiplicação");
		
		int conta = teclado.nextInt();
		
		
		switch(conta){
        case 1:
        	int soma = soma(a , b);
			System.out.println("O resultado é " + soma);
            break;
            
        case 2:
        	int subt = subt(a , b);
			System.out.println("O resultado é " + subt);
            break;
            
        case 3:
        	int div = div(a , b);
        	System.out.println("O resultado é " + div);
            break;
            
        case 4:
        	int mult = mult(a, b);
        	System.out.println("O resultado é " + mult);
            break;
        
		}
		
	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subt (int a, int b) {
		return a - b;
	}
	public static int div (int a, int b) {
		return a / b;
	}
	public static int mult (int a, int b) {
		return a * b;
	}
	
}
