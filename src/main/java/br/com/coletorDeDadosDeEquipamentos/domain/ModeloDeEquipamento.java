package br.com.coletorDeDadosDeEquipamentos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class ModeloDeEquipamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(length = 50, nullable=false)
	private String name;

	public ModeloDeEquipamento(Integer id, String name) {
		super();
		this.Id = id;
		this.name = name;
	}
	
	

}
