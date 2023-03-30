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
public class EstadoDoEquipamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(length=10, nullable=false, unique=true)
	private String name;
	
	@Column(length=10, nullable=false, unique=true)
	private String color;

	public EstadoDoEquipamento(Integer id, String name, String color) {
		super();
		this.Id = id;
		this.name = name;
		this.color = color;
	}
	
	
	

}
