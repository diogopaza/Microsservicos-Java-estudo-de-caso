package com.diogo.microsservico.estoque;

import com.diogo.microsservico.estoque.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
