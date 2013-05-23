package Candlestick;

import java.util.Calendar;

public final class Candlestick {
	
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	
	public static void validaAbertura(double dado){
		if ( dado == 0.0) {
			throw new IllegalArgumentException("Dado nao pode ser nulo ou negativo");
		}
	}

	public static void validaFechamento(double dado){
		if ( dado == 0.0) {
			throw new IllegalArgumentException("Dado nao pode ser nulo ou negativo");
		}
	}
	
	public static void validaMinimo(double dado){
		if ( dado == 0.0) {
			throw new IllegalArgumentException("Dado nao pode ser nulo ou negativo");
		}
	}
	
	public static void validaMaximo(double dado){
		if ( dado == 0.0) {
			throw new IllegalArgumentException("Dado nao pode ser nulo ou negativo");
		}
	}
	
	public static void validaVolume(double dado){
		if ( dado == 0.0) {
			throw new IllegalArgumentException("Dado nao pode ser nulo ou negativo");
		}
	}
	
	public static void validaSeMinimoEhMaiorQueMaximo(double minimo, double maximo){
		if (minimo > maximo) {
			throw new IllegalArgumentException("Maximo deve ser maior que minimo");
		}
	} 

	public static void validaData(Calendar data){
		if (data == null) {
			throw new IllegalArgumentException("data nao pode ser nula");
		}
	}
	
	public Candlestick(double abertura, double fechamento, double minimo,double maximo, double volume, Calendar data) {
		
		validaAbertura(abertura);
		validaFechamento(fechamento);
		validaMaximo(maximo);
		validaMinimo(minimo);
		validaVolume(volume);
		validaData(data);
		validaSeMinimoEhMaiorQueMaximo(minimo, maximo);
		
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}
	
	public double getAbertura() {
		return abertura;
	}
	
	public double getFechamento() {
		return fechamento;
	}
	
	public double getMinimo() {
		return minimo;
	}
	
	public double getMaximo() {
		return maximo;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public boolean isAlta(){
		return this.abertura < this.fechamento;
	}
	
	public boolean isBaixa(){
		return this.abertura > this.fechamento;
	}
	
	
	
	
	
}
