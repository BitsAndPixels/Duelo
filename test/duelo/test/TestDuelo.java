package duelo.test;

import org.junit.Test;
import org.junit.Assert;

import duelo.*;

public class TestDuelo {

	@Test
	public void dueloSheriffRenegado(){

			Sheriff martin = new Sheriff("Martin", new Colt(), 1,1);
			Renegado ruperto = new Renegado("Ruperto", new Derringer(), 1,3);
			
			// se arma la balacera mientras esten vivos o ambas armas no se rompan
			while (martin.estaVivo() && ruperto.estaVivo() 
					&& (martin.tengoArma() || ruperto.tengoArma())){
				
				martin.duelo(ruperto);
				ruperto.duelo(martin);
					
			}
			
			Assert.assertTrue(martin.estaVivo());
			Assert.assertFalse(ruperto.estaVivo());
		
	}
	
	@Test
	public void dueloDeTres(){

		Sheriff eastwood = new Sheriff("Clint", new Colt(), 1,1);
		Alguacil norris = new Alguacil("Chuck", new Winchester(), 1,2);
		Renegado ruperto = new Renegado("Ruperto", new Derringer(), 1,3);
		
		// se arma la balacera mientras esten vivos o ambas armas no se rompan
		while (eastwood.estaVivo() && norris.estaVivo() && ruperto.estaVivo() 
				&& (eastwood.tengoArma() || norris.tengoArma() || ruperto.tengoArma())){
			
			eastwood.duelo(ruperto);
			eastwood.duelo(norris);
			norris.duelo(ruperto);
			norris.duelo(eastwood);
			ruperto.duelo(eastwood);
			ruperto.duelo(ruperto);
				
		}
		
		Assert.assertTrue(eastwood.estaVivo());
		Assert.assertTrue(norris.estaVivo());
		Assert.assertFalse(ruperto.estaVivo());
	
	}
}
