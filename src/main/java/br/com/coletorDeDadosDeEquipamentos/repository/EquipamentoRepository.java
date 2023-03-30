package br.com.coletorDeDadosDeEquipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coletorDeDadosDeEquipamentos.domain.Equipamento;

// É a camada onde ficara a manipulacao
// do BD (Inserir, Editar, Excluir,...). Basta extender da classe jpa em questao
// passando o nome da classe e o tipo da PK.

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer>{

}
