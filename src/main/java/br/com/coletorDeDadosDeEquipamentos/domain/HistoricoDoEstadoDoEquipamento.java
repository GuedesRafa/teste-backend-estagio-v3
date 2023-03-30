package br.com.coletorDeDadosDeEquipamentos.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class HistoricoDoEstadoDoEquipamento {

	@Id
	@MapsId
	@ManyToOne
	@JoinColumn(nullable=false)
	private Equipamento equipment_Id;
	
	@Id
	@MapsId
	@ManyToOne
	@JoinColumn(nullable=false)
	private EstadoDoEquipamento equipment_State_Id;
	
	
	@Column(nullable=false)
	private LocalDate date;
	

	public HistoricoDoEstadoDoEquipamento(Equipamento equipment_Id, LocalDate date, EstadoDoEquipamento equipment_State_Id) {
		super();
		this.equipment_Id = equipment_Id;
		this.date = date;
		this.equipment_State_Id = equipment_State_Id;
	}
	
	
	
}
