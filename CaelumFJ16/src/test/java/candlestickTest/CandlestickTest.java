package candlestickTest;

import java.util.Calendar;
import org.junit.Test;

import Candlestick.Candlestick;

public class CandlestickTest {

	//@Test(expected=IllegalArgumentException.class)
	//public void precoMaximoNaoPodeSerMenorQueMinimo() {
	//	new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	//}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaCandleStickComDataNula() {
		new Candlestick(10, 20, 20, 10, 10000, null);
	}

}
