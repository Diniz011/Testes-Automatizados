package br.fiap.com.GestaoTrafego.repository;

import br.fiap.com.GestaoTrafego.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByCpf(String cpf);

}
