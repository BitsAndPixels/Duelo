package duelo.test;

import org.junit.Test;
import org.junit.Assert;

import duelo.*;

public class TestArma {

	@Test
	public void armaVacia(){
		Winchester chumbo = new Winchester();
		//Gasto el cargador
		chumbo.tiro();
		chumbo.tiro();
		Assert.assertEquals(0, chumbo.getCantTiros());
		//Cargador vacio no permite disparar, debe recargar
		Assert.assertFalse(chumbo.tiro());
	}
	
	@Test
	public void armaRecargaAutomatica(){
		Derringer chumbito = new Derringer();
		//Gasto el cargador
		chumbito.tiro();
		chumbito.tiro();
		Assert.assertEquals(0, chumbito.getCantTiros());
		//Cargador vacio recarga al proximo tiro:
		Assert.assertTrue(chumbito.tiro());
	}
	
	@Test
	public void durabilidadArma(){
		Derringer chumbito = new Derringer();
		//Gasto todos los cargadores hasta romper el arma:
		for (int i=0;i<7;i++){
			chumbito.tiro();
			chumbito.tiro();
			}
		
		Assert.assertFalse(chumbito.tiro());
		Assert.assertTrue(chumbito.armaRota());
				
	}
	
}
