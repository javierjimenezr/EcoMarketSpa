package com.ProyecOne.EcoMarketSpa.Controller;

import com.ProyecOne.EcoMarketSpa.Model.Usuario;
import com.ProyecOne.EcoMarketSpa.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/crear")
    public String crearUsuario(@RequestParam String email,
                               @RequestParam String password,
                               @RequestParam String username) {
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setPassword(password);
        usuario.setUsername(username);
        usuarioRepository.save(usuario);
        
        return "redirect:/index.html";
    }
}

