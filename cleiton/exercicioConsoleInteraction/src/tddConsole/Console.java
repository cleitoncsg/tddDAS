package tddConsole;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Console {

	Scanner receba = new Scanner(System.in);
	private int opcao;
	


	public boolean menu() {
		System.out.println("Digite opcao 1 ou 2");
		opcao = Integer.parseInt(receba.nextLine());
		
		if(opcao == 1){
			calculoRetangulo();
			return true;
		}
		if(opcao == 2){
			calculoCirculo();
			return true;
		}
		return false;
	}
	

	public boolean calculoRetangulo() {
		System.out.println("Digite o lado A do retangulo");
		int ladoA = Integer.parseInt(receba.nextLine());
		
		System.out.println("Digite o lado B do retangulo");
		int ladoB = Integer.parseInt(receba.nextLine());
		
		if(ladoA < 0 || ladoB < 0)
			return false;
		
		System.out.printf("Perimetro = %d\n",(ladoA+ladoB)*2 );
		System.out.printf("Area = %d\n",(ladoA*ladoB) );
		
		return true;
	}
	
	public boolean calculoCirculo(){
		System.out.println("Digite o raio do circulo");
		int raio = Integer.parseInt(receba.nextLine());
		
		if(raio < 0)
			return false;
		System.out.printf("Comprimento do circulo %f= ", raio*3.14*2);
		System.out.printf("Area do circulo = %f", raio*raio*3.14);
		
		return true;
	}
	
}
