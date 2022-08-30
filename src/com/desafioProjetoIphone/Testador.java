package com.desafioProjetoIphone;

import funcionalidades.Iphone2007;

public class Testador {

	public static void main(String[] args) {
		Iphone2007 iph = new Iphone2007();
		
		System.out.println("---OUVIR MUSICA---");
		iph.selecionarMusica();
		iph.tocar();
		iph.pausar();
		System.out.println("");
		
		System.out.println("---NAVEGAR NA INTERNET---");
		iph.adicionarPagina();
		iph.exibirPagina();
		iph.atualizarPagina();
		System.out.println("");

		System.out.println("---FAZER LIGACAO ---");
		iph.ligar();
		iph.atender();
		iph.iniciarCorreioVoz();
		System.out.println("");
		
	}

}
