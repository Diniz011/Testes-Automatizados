package br.fiap.com.GestaoTrafego.controller;

import br.fiap.com.GestaoTrafego.model.Cidade;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {

    private List<Cidade> cidades = new ArrayList<>();

    // Endpoint para adicionar uma nova cidade
    @PostMapping
    public ResponseEntity<Cidade> adicionarCidade(@RequestBody @Valid Cidade cidade) {
        cidades.add(cidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(cidade);
    }

    // Manipulador de exceções para campos inválidos
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.put("mensagem", error.getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }
}
