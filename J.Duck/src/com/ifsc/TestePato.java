package com.ifsc;

public class TestePato {

	public static void main(String[] args) {
		Duck patolino = new Duck();
		PatoReal patolinho = new PatoReal();
		PatoVermelho patolinao = new PatoVermelho();
		PatoDeBorracha piopio = new PatoDeBorracha();
		PatoDeMadeira madeiro = new PatoDeMadeira();

		patolino.display();
		patolino.nadar();
		System.out.println("----------------");
		patolinho.display();
		patolinho.voar();
		patolinho.quack();
		patolinho.nadar();
		System.out.println("----------------");
		patolinao.display();
		patolinao.quack();
		patolinao.voar();
		patolinao.nadar();
		System.out.println("----------------");
		piopio.display();
		piopio.quack();
		System.out.println("----------------");
		madeiro.display();
		madeiro.nadar();
	}
}
