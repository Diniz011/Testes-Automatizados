package br.fiap.com.GestaoTrafego.service;

import br.fiap.com.GestaoTrafego.model.Acidente;
import br.fiap.com.GestaoTrafego.repository.AcidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcidenteService {

    @Autowired
    private AcidenteRepository acidenteRepository;

    public Acidente salvar(Acidente acidente) {
        return acidenteRepository.save(acidente);
    }

    public List<Acidente> listarTodosAcidentes() {
        return acidenteRepository.findAll();
    }

    public Acidente buscarAcidentePeloId(Long id){
        var acidenteOptional = acidenteRepository.findById(id);
        if (acidenteOptional.isPresent()){
            return acidenteOptional.get();
        } else {
            throw new RuntimeException("Acidente não encontrado!");
        }

    }

    public void excluir(Long id){
        acidenteRepository.deleteById(id);
    }

    public <AccidentDTO> Acidente updateAcidente(Long id, AccidentDTO ignoredAccidentDTO) {

        return null;
    }
}