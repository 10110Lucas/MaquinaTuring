package main;

import java.util.Scanner;

public class TelefoniaFranca {
	
	int cont;
	char fita [];
	private static Scanner entrada;
	
	
	public static void main(String[] args) {
		TelefoniaFranca maq = new TelefoniaFranca();
		entrada = new Scanner(System.in);
		String palavra;
		System.out.println("Entre com a palavra: ");
		palavra = entrada.nextLine();
		maq.Iniciar(palavra);
	}	
	public void Iniciar(String setenca){
		cont = 0;
		fita = setenca.toCharArray();
		q0();
	}
	public void q0(){
		if(cont < fita.length) {
			if(fita[cont] == 'T') {
				fita[cont] = 'T';
				cont++;
				q4();
			}else if(fita[cont] == 'B'){
				fita[cont] = 'B';
				cont++;
				q3();
			}else if(fita[cont] == 'a'){
				fita[cont] = 'A';
				cont++;
				q1();
			}else {
				qErro();
			}
		}else {
			qErro();
		}
	}
	public void q1(){
		if(cont < fita.length) {
			if(fita[cont] == 'a') {
				fita[cont] = 'a';
				cont++;
				q1();
			}else if(fita[cont] == 'B'){
				fita[cont] = 'B';
				cont++;
				q1();
			}else if(fita[cont] == 'b'){
				fita[cont] = 'B';
				cont--;
				q2();
			}else {
				qErro();
			}
		}else {
			qErro();
		}
	}
	public void q2(){
		if(cont < fita.length) {
			if(fita[cont] == 'a') {
				fita[cont] = 'a';
				cont--;
				q2();
			}else if(fita[cont] == 'B'){
				fita[cont] = 'B';
				cont--;
				q2();
			}else if(fita[cont] == 'A'){
				fita[cont] = 'A';
				cont++;
				q0();
			}else {
				qErro();
			}
		}else {
			qErro();
		}
	}
	public void q3(){
		if(cont < fita.length) {
			if(fita[cont] == 'B'){
				fita[cont] = 'B';
				cont++;
				q3();
			}else if(fita[cont] == 'T'){
				fita[cont] = 'T';
				cont++;
				q4();
			}else {
				qErro();
			}
		}else {
			qErro();
		}
	}
	public void q4(){
		String palavra = "";
		for(int i = 0; i < (fita.length - 1); i++) {
			palavra = palavra + fita[i];
		}
		System.out.println("Palavra Aceita!!!: " + palavra);		
	}
	public void qErro(){
		String palavra = "";
		for(int i = 0; i < fita.length; i++) {
			palavra = palavra + fita[i];
		}
		System.err.println("Palavra não Aceita!!!");
	}
	
	// aula REGEX -> https://www.youtube.com/watch?v=rY6sA1vdSPA
	// MT exemplo ->https://www.youtube.com/watch?v=ffByefsFQtU&feature=youtu.be
	// criar pagina web -> https://www.devmedia.com.br/criando-form-de-contato-com-html5-css3-e-javascript/29415
}
