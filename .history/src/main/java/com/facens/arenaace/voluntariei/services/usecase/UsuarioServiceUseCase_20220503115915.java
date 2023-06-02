package com.facens.arenaace.voluntariei.services.usecase;

import java.util.ArrayList;

import com.facens.arenaace.voluntariei.dto.DadosUsuarioDTO;
import com.facens.arenaace.voluntariei.dto.UsuarioDTO;
import com.facens.arenaace.voluntariei.entity.Usuario;

public interface UsuarioServiceUseCase {
    Usuario salvar(UsuarioDTO dto);
    DadosUsuarioDTO obterUsuarioPorId(Integer id);
    void remover(Integer id);
    void editar(Integer id, UsuarioDTO dto);
    ArrayList<DadosUsuarioDTO> obterUsuarios();
}