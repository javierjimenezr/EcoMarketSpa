package com.ProyecOne.EcoMarketSpa.Repository;

import com.ProyecOne.EcoMarketSpa.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email); // método correcto si tienes un campo email
}