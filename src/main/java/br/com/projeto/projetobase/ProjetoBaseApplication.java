package br.com.projeto.projetobase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBaseApplication.class, args);
		System.out.println(calcular(15, 15));
		System.out.println(multiplicar(15, 15));
		System.out.println("Hello world. Its my first pipeline CI!!!");
	}

	private static int calcular(int a, int b) {
		return a + b;
	}

	private static int multiplicar(int a, int b) {
		return a * b;
	}
}
