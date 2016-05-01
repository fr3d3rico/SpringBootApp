package com.springbootapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootapp.bean.Pessoa;

@Service
public class PessoaService {
	
	public List<Pessoa> getPessoas() {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
				
		pessoas.add(new Pessoa(1, "Fred"));
		pessoas.add(new Pessoa(2, "Spring Boot"));
		
		return pessoas;
	}
	
	public Pessoa getPessoa(long id) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(id);
		
		return pessoa;
	}

}
