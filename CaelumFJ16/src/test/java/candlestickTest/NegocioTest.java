package candlestickTest;

import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;

import Candlestick.Negocio;

public class NegocioTest {

	@Test
	public void dataDoNegocioEhImutavel() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negocio n = new Negocio(10, 5, c);
		
		n.getData().set(Calendar.DAY_OF_MONTH, 20);

		Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegocioComDataNula() {
		new Negocio(10, 5, null);
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegocioComPrecoNulo() {
		new Negocio(0, 20, Calendar.getInstance());
	}

	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegocioComPrecoNegativo() {
		new Negocio(-10, 20, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegocioComQuantidadeNula() {
		new Negocio(10, 0, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegocioComQuantidadeNegativa() {
		new Negocio(10, -20, Calendar.getInstance());
	}
}
