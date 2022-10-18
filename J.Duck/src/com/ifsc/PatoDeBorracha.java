package com.ifsc;

public class PatoDeBorracha extends Duck implements Grasnador {
	public PatoDeBorracha() {
	}

	@Override
	public void quack() {
		System.out.println("Quick! Quick! Quick!");
	}

	public void display() {
		System.out.println("Oi, eu sou um pato de Borracha e não posso falar :(!");
	}

	public void nadar() {
		System.out.println(" Estou boiando!");
	}
}