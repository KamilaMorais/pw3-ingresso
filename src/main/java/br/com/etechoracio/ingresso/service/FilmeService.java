package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List</*Filme*/ FilmeResponseDTO> findAll(){
        var filmes = filmeRepository.findAll();
        return null;
    }

    public List</*Filme*/ FilmeResponseDTO> listarEmCartaz() {
        var filmes = filmeRepository.findByEmCartaz(SimNaoEnum.S);
        return null;
    }
}
