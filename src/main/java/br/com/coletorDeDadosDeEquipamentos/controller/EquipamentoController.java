package br.com.coletorDeDadosDeEquipamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coletorDeDadosDeEquipamentos.domain.Equipamento;
import br.com.coletorDeDadosDeEquipamentos.repository.EquipamentoRepository;

@RestController
@RequestMapping("equipamento")
public class EquipamentoController {
	
	@Autowired
	private EquipamentoRepository repository;

	@GetMapping
	public List<Equipamento> listar(){
		List<Equipamento>equipamento = repository.findAll();
		return equipamento;
	}
	
	@GetMapping("/equipamento{id}")
	public Equipamento getEquipamentoById(@PathVariable Integer id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/equipamento")
	public Equipamento saveequipamento(@RequestBody Equipamento equipamento) {
		return repository.save(equipamento);
	}
	
	@DeleteMapping("/equipamento{id}")
	public void deleteEquipamento (@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping
	public void editar (@RequestBody Equipamento equipamento) {
		repository.save(equipamento);
	}
	
	
}
