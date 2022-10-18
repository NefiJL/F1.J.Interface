package com.ifsc;

public class PatoVermelho extends Duck implements Grasnador, Voador {

	public PatoVermelho() {
	}

	public void display() {
		System.out.println("Oi, eu sou um pato-vermelho!");
	}

	@Override
	public void voar() {
		System.out.println("Estou voando QUAK QUAK QUAK!");

	}

	@Override
	public void quack() {
		System.out.println("QUAK QUAK QUAK!");

	}
}
