package br.fiap.com.GestaoTrafego.controller;

import br.fiap.com.GestaoTrafego.model.Acidente;
import br.fiap.com.GestaoTrafego.model.PadraoTrafego;
import br.fiap.com.GestaoTrafego.service.PadraoTrafegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/padroes-trafego")
public class PadraoTrafegoController<PadraoTrafegoDTO> {

    @Autowired
    private PadraoTrafegoService padraoTrafegoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PadraoTrafego salvar(@RequestBody PadraoTrafego padraoTrafego) {
        return padraoTrafegoService.salvar(padraoTrafego);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PadraoTrafego buscarPeloId(@PathVariable Long id) {
        return padraoTrafegoService.buscarPadraoTrafegoPeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PadraoTrafego> listarTodos() {
        return padraoTrafegoService.listarTodosPadroesTrafego();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        padraoTrafegoService.excluir(id);
    }

    @PutMapping("/{id}")
    public PadraoTrafego updatePadraoTrafego(@PathVariable Long id, @RequestBody PadraoTrafego padraoTrafegoDetails) {
        return padraoTrafegoService.updatePadraoTrafego(id, padraoTrafegoDetails);

    }
}
