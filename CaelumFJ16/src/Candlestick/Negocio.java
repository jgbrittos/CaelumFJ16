package Candlestick;

import java.util.Calendar;

public final class Negocio {
	
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negocio(double preco, int quantidade, Calendar data) {
		validaData(data);
		validaPreco(preco);
		validaQuantidade(quantidade);
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public static void validaData(Calendar data){
		if (data == null) {
			throw new IllegalArgumentException("data nao pode ser nula");
		}
	}
	
	public static void validaPreco(double preco){
		if (preco == 0.0 || preco < 0.0) {
			throw new IllegalArgumentException("Preco nao pode ser nulo ou negativo");
		}
	}
	
	public static void validaQuantidade(double quantidade){
		if (quantidade == 0.0 || quantidade < 0.0) {
			throw new IllegalArgumentException("Quantidade nao pode ser nulo ou negativo");
		}
	}
	
	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return (Calendar) this.data.clone();
	}
	
	public double getVolume(){
		return preco*quantidade;
	}

}

