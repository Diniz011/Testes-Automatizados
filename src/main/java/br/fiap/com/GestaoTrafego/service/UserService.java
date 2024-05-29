package br.fiap.com.GestaoTrafego.service;

import br.fiap.com.GestaoTrafego.model.User;
import br.fiap.com.GestaoTrafego.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User gravar(User usuario){

        String senhaCripto = new BCryptPasswordEncoder().encode(usuario.getPassword());
        usuario.setSenha(senhaCripto);

        return userRepository.save(usuario);
    }

}