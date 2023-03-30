package br.com.coletorDeDadosDeEquipamentos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Equipamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(nullable=false, unique=false)
	private ModeloDeEquipamento equipment_model_id;
	
	@Column(length = 70, nullable = false)
	private String name;
	
	
	public Equipamento(Integer id, ModeloDeEquipamento equipment_model_id, String name) {
		super();
		this.id = id;
		this.equipment_model_id = equipment_model_id;
		this.name = name;
	}

	
}
