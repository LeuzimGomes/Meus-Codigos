package br.com.leonardogomesfernandes.dao;

import java.util.List;


import br.com.leonardogomesfernandes.domain.Departamento;

public interface DepartamentoDao {
	
void save (Departamento departamento);
	
	void update (Departamento departamento);
	
	void delete (Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
