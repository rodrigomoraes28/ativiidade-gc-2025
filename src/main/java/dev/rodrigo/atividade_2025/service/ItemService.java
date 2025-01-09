package dev.rodrigo.atividade_2025.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.rodrigo.atividade_2025.models.Item;
import dev.rodrigo.atividade_2025.repository.ItemRepository;

@Service
public class ItemService {
  
  private final ItemRepository repository;
  
  public ItemService(ItemRepository repository){
      this.repository = repository;
  }

  public List<Item> findAll(){
      return repository.findAll();
  }

  public Item save(Item item){
    return repository.save(item);
  }

}
