package br.com.coletorDeDadosDeEquipamentos.domain;

import java.time.LocalDate;

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
public class HistoricoDePosicaoDeEquipamento {
	
	@Id
	@OneToOne
	@MapsId
	@JoinColumn(name="id", nullable=false, unique=true)
	private Equipamento equipment_Id;
	
	@Column(nullable=false)
	private LocalDate Date;
	
	@Column(nullable=false)
	private Long Lat;
	
	@Column(nullable=false)
	private Long Lon;

	public HistoricoDePosicaoDeEquipamento(Equipamento equipment_Id, LocalDate date, Long lat, Long lon) {
		super();
		this.equipment_Id = equipment_Id;
		this.Date = date;
		this.Lat = lat;
		this.Lon = lon;
	}
	
	
	
	
}
