package br.com.coletorDeDadosDeEquipamentos.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.coletorDeDadosDeEquipamentos.domain.Equipamento;

@SpringBootTest
public class EquipamentoRepositoryTests {
	
	@Autowired
	private EquipamentoRepository equipamentoRepository;
	//Esta anotacao faz co que o spring gerencie o
	//objeto. Ele quem vai Instanciar o objeto.
	//Neste caso, ira criar objeto equipamentoRepository
	//do TIPO EquipamentoRepository(interface).
	

	@Test
	public void inserir() {
		
	}
}
