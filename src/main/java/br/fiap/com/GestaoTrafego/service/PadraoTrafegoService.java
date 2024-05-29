package br.fiap.com.GestaoTrafego.service;

import br.fiap.com.GestaoTrafego.model.PadraoTrafego;
import br.fiap.com.GestaoTrafego.repository.PadraoTrafegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadraoTrafegoService {

    @Autowired
    private PadraoTrafegoRepository padraoTrafegoRepository;

    public PadraoTrafego salvar(PadraoTrafego padraoTrafego) {
        return padraoTrafegoRepository.save(padraoTrafego);
    }

    public List<PadraoTrafego> listarTodosPadroesTrafego() {
        return padraoTrafegoRepository.findAll();
    }

    public PadraoTrafego buscarPadraoTrafegoPeloId(Long id){
        var padraoTrafegoOptional = padraoTrafegoRepository.findById(id);
        if (padraoTrafegoOptional.isPresent()){
            return padraoTrafegoOptional.get();
        } else {
            throw new RuntimeException("Padrão de tráfego não encontrado!");
        }
    }

    public void excluir(Long id){
        padraoTrafegoRepository.deleteById(id);
    }

    public PadraoTrafego updatePadraoTrafego(Long id, PadraoTrafego padraoTrafegoDetails) {
        return null;
    }
}
