package br.fiap.com.GestaoTrafego.controller;

import br.fiap.com.GestaoTrafego.dto.TokenDto;
import br.fiap.com.GestaoTrafego.model.User;
import br.fiap.com.GestaoTrafego.service.TokenService;
import br.fiap.com.GestaoTrafego.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authentication;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity logar(@RequestBody User usuario){
        UsernamePasswordAuthenticationToken usernamePassword =
                new UsernamePasswordAuthenticationToken(
                        usuario.getUsername(), usuario.getPassword()
                );

        Authentication auth = authentication.authenticate(usernamePassword);

        String token = tokenService.gerarToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new TokenDto(token));

    }

    @PostMapping("/users")
    public ResponseEntity cadastrar(@RequestBody User usuario){

        User userNovo = userService.gravar(usuario);

        return ResponseEntity.ok(userNovo);

    }

}
