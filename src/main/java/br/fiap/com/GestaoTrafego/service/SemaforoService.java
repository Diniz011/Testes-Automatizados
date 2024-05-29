package br.fiap.com.GestaoTrafego.service;

import br.fiap.com.GestaoTrafego.model.Acidente;
import br.fiap.com.GestaoTrafego.model.Semaforo;
import br.fiap.com.GestaoTrafego.repository.SemaforoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SemaforoService<SemaforoDTO> {

    @Autowired
    private SemaforoRepository semaforoRepository;

    public Semaforo salvar(Semaforo semaforo) {
        return semaforoRepository.save(semaforo);
    }

    public List<Semaforo> listarTodosSemaforos() {
        return semaforoRepository.findAll();
    }

    public Semaforo buscarSemaforoPeloId(Long id){
        Optional<Semaforo> semaforoOptional = semaforoRepository.findById(id);
        if (semaforoOptional.isPresent()){
            return semaforoOptional.get();
        } else {
            throw new RuntimeException("Semaforo não encontrado!");
        }
    }

    public void excluir(Long id){
        semaforoRepository.deleteById(id);
    }

    public <SemaforoDTO> Semaforo updateSemaforo(Long id, SemaforoDTO semaforoDTO) {

        return null;
    }
}
