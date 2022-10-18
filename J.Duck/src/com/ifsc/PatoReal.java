package com.ifsc;

public class PatoReal extends Duck implements Grasnador, Voador {

	public PatoReal() {
	}

	public void display() {
		System.out.println("Oi, eu sou um pato-real!");
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
