package dev.rodrigo.atividade_2025.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.rodrigo.atividade_2025.models.Item;

public interface ItemRepository extends JpaRepository<Item,Long>{
  
}
