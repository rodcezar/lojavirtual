package com.rodrigo.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity for table "Produto" 
 * 
 * @author Rodrigo Cezar (rodrigo.cezar@gmail.com)
 *
 */
@Entity(name = "produto")
public class Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  
  private Integer amount;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    
    if (o == null) return false;
    
    if (this.getClass() != o.getClass()) return false;
    
    Produto produto = (Produto) o;

    return Objects.equals(getId(), produto.getId())
      && Objects.equals(getName(), produto.getName())
      && Objects.equals(getAmount(), produto.getAmount());
  }

  @Override
  public int hashCode() {
    int hash = 7;
    
    hash = 31 * hash + Objects.hashCode(id);
    hash = 31 * hash + Objects.hashCode(name);
    hash = 31 * hash + Objects.hashCode(amount);
    return hash;
  }
}
