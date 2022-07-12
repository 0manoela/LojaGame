package com.generation.lojadegame.Loja.Game.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegame.Loja.Game.Model.Usuario;
import com.generation.lojadegame.Loja.Game.Model.UsuarioLogin;

public interface usuarioRepository extends JpaRepository<UsuarioLogin, Long> {

	public Optional<Usuario> findByUsuario(String usuario);
}
