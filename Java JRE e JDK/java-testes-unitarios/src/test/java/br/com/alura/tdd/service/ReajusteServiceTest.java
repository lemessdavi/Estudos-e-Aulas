package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {
	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	private void incicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Bruno", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@Test
	void deveRetornarTresPorCentoDoSalarioParaDesempenhoADesejar() {
		service.reajustaSalario(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	void deveRetornarCincoPorCentoDoSalarioParaDesempenhoBom() {
		service.reajustaSalario(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	void deveRetornarTresPorCentoDoSalarioParaDesempenhoOtimo() {
		service.reajustaSalario(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}

}
