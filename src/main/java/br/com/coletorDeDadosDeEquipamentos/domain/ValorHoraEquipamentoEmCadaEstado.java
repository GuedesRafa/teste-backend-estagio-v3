package br.com.coletorDeDadosDeEquipamentos.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class ValorHoraEquipamentoEmCadaEstado {
	
	@Id
	@MapsId
	@OneToOne
	@JoinColumn(nullable=false)
	private ModeloDeEquipamento equipment_Model_Id;
	
	@Id
	@MapsId
	@OneToOne
	@JoinColumn(nullable=false)
	private EstadoDoEquipamento equipment_state_Id;
	
	
	@Column(nullable=false)
	private BigDecimal value;

	public ValorHoraEquipamentoEmCadaEstado(ModeloDeEquipamento equipment_Model_Id,
			EstadoDoEquipamento equipment_state_Id, BigDecimal value) {
		super();
		this.equipment_Model_Id = equipment_Model_Id;
		this.equipment_state_Id = equipment_state_Id;
		this.value = value;
	}
	
	
	
	

}
