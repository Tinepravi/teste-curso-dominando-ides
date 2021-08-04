package com.tinepravi.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		double multiplicacao = multiplicacao(a,b);
		
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subitração é: " + subtracao);
		System.out.println("A multiplicação é: " + multiplicacao);
		System.out.println("A divisão é: " + divisao);
		
		}


	public static double soma (double a, double b){
		return a + b;
		}
	
	
	public static double subtracao (double a, double b){
		return a - b;
		}
	
	public static double multiplicacao (double a, double b){
		return a * b;
		}
	
	public static float divisao ( double a, double b){
		return (float) (a / b);
		}

	
}
