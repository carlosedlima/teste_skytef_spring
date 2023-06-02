package com.facens.arenaace.voluntariei.repository;

import com.facens.arenaace.voluntariei.entity.Ong;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OngRepository extends JpaRepository<Ong, Integer> {
    Ong findByEmailAndSenha(String email,String senha);
}
