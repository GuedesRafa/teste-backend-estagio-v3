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

import br.com.coletorDeDadosDeEquipamentos.domain.ModeloDeEquipamento;
import br.com.coletorDeDadosDeEquipamentos.domain.ModeloDeEquipamento;
import br.com.coletorDeDadosDeEquipamentos.repository.EstadoDoEquipamentoRepository;
import br.com.coletorDeDadosDeEquipamentos.repository.ModeloDeEquipamentoRepository;


@RestController
@RequestMapping("modeloDeEquipamento")
public class ModeloDeEquipamentoController {
	
	@Autowired
	private ModeloDeEquipamentoRepository repository;
	
	@GetMapping
	public List<ModeloDeEquipamento> listar(){
		List<ModeloDeEquipamento> modeloDeEquipamento = repository.findAll();
		return modeloDeEquipamento;
	}
	
	@GetMapping("/modeloDeEquipamento{id}")
	public ModeloDeEquipamento getmodeloDeEquipamentoById(@PathVariable Integer id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/modeloDeEquipamento")
	public ModeloDeEquipamento saveequipamento(@RequestBody ModeloDeEquipamento modeloDeEquipamento) {
		return repository.save(modeloDeEquipamento);
	}
	
	@DeleteMapping("/modeloDeEquipamento{id}")
	public void deletemodeloDeEquipamento (@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping
	public void editar (@RequestBody ModeloDeEquipamento modeloDeEquipamento) {
		repository.save(modeloDeEquipamento);
	}


}
