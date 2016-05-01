package com.springbootapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp.bean.Pessoa;
import com.springbootapp.services.PessoaService;

@RestController
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping("/pessoas")
    List<Pessoa> getPessoas() {
        return pessoaService.getPessoas();
    }

}
