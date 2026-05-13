package com.leonardoricardo.usuario.infrastructure.repository;


import com.leonardoricardo.usuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
