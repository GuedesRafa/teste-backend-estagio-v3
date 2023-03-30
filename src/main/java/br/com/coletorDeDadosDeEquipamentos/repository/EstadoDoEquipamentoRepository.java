package br.com.coletorDeDadosDeEquipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coletorDeDadosDeEquipamentos.domain.EstadoDoEquipamento;

public interface EstadoDoEquipamentoRepository extends JpaRepository<EstadoDoEquipamento, Integer>{

}
