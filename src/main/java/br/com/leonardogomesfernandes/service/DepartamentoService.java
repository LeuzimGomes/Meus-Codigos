package br.com.leonardogomesfernandes.service;

import java.util.List;

import br.com.leonardogomesfernandes.domain.Departamento;



public interface DepartamentoService {
	
	void salvar (Departamento departamento);
	
	void editar (Departamento departamento);
	
	void excluir (Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

}
