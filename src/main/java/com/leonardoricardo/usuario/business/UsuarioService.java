package com.leonardoricardo.usuario.business;

import com.leonardoricardo.usuario.business.converter.UsuarioConverter;
import com.leonardoricardo.usuario.business.dto.UsuarioDTO;
import com.leonardoricardo.usuario.infrastructure.entity.Usuario;
import com.leonardoricardo.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));

    }
}
