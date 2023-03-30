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

import br.com.coletorDeDadosDeEquipamentos.domain.EstadoDoEquipamento;
import br.com.coletorDeDadosDeEquipamentos.repository.EstadoDoEquipamentoRepository;


@RestController
@RequestMapping("estadoDoEquipamento")
public class EstadoDoEquipamentoController {
	
	@Autowired
	private EstadoDoEquipamentoRepository repository;
	
	@GetMapping
	public List<EstadoDoEquipamento> listar(){
		List<EstadoDoEquipamento> estadoDoEquipamento = repository.findAll();
		return estadoDoEquipamento;
	}
	
	@GetMapping("/estadoDoEquipamento{id}")
	public EstadoDoEquipamento getestadoDoEquipamentoById(@PathVariable Integer id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/estadoDoEquipamento")
	public EstadoDoEquipamento saveequipamento(@RequestBody EstadoDoEquipamento equipamento) {
		return repository.save(equipamento);
	}
	
	@DeleteMapping("/estadoDoEquipamento{id}")
	public void deleteEquipamento (@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping
	public void editar (@RequestBody EstadoDoEquipamento estadoDoEquipamento) {
		repository.save(estadoDoEquipamento);
	}
	
	

}
