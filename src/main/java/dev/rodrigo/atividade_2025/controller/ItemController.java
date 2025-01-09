package dev.rodrigo.atividade_2025.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.rodrigo.atividade_2025.models.Item;
import dev.rodrigo.atividade_2025.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
  
  private final ItemService itemService;

  public ItemController(ItemService itemService){
    this.itemService = itemService;
  }

  @GetMapping
  public ResponseEntity<List<Item>> findAll(){
    return ResponseEntity.ok(itemService.findAll());
  } 

  @PostMapping
  public ResponseEntity<Item> save(@RequestBody Item item){
    return ResponseEntity
    .status(HttpStatus.CREATED)
    .body(itemService.save(item));
  }

}
