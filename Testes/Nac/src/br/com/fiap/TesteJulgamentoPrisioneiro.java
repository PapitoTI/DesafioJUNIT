package br.com.fiap;
import static org.junit.Assert.*;

import org.junit.Test;

import br.com.fiap.JulgamentoPrisioneiro;

public class TesteJulgamentoPrisioneiro extends JulgamentoPrisioneiro{

	@Test
	public void testeCalcularPena() {
		
		int PENA_INOCENCIA = 0;
		int PENA_CONDENACAO_MUTUA = 5;
		int PENA_CONDENACAO_INDIVIDUAL = 10;
		int PENA_CONDENACAO_CUMPLICES = 1;
		
		JulgamentoPrisioneiro j = new JulgamentoPrisioneiro();
		
		int ex = PENA_CONDENACAO_MUTUA;
		int ac = j.calculaPena(Resposta.DELACAO_C, Resposta.DELACAO_C);
		
		assertEquals(ex, ac);
		
	}
	
	
}
