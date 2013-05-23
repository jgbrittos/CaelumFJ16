package candlestickTest;

import java.util.Calendar;
import org.junit.Test;

import Candlestick.Candlestick;

public class CandlestickTest {

	@Test(expected=IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		new Candlestick(10, 20, 15, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComDataNula() {
		new Candlestick(10, 20, 20, 10, 10000, null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComAberturaNula() {
		new Candlestick(0.0, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComFechamentoNulo() {
		new Candlestick(10, 0, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComMinimoNulo() {
		new Candlestick(10, 20, 0, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComMaximoNulo() {
		new Candlestick(10, 20, 20, 0, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComVolumeNulo() {
		new Candlestick(10, 20, 20, 10, 0, Calendar.getInstance());
	}
	
}
