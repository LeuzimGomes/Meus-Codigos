package br.com.leonardogomesfernandes.service;

import java.util.List;

import br.com.leonardogomesfernandes.domain.Cargo;

public interface CargoService {
	
void salvar (Cargo cargo);
	
	void editar (Cargo cargo);
	
	void excluir (Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

}
