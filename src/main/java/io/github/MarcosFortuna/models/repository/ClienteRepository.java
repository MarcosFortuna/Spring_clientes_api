package io.github.MarcosFortuna.models.repository;

import io.github.MarcosFortuna.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
