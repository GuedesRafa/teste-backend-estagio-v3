package br.com.coletorDeDadosDeEquipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coletorDeDadosDeEquipamentos.domain.ModeloDeEquipamento;

public interface ModeloDeEquipamentoRepository extends JpaRepository<ModeloDeEquipamento, Integer> {

}
