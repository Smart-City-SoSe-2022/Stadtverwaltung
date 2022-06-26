package com.example.backend.customer;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class CustomerEntity{
  @Id
  private Long id;

  public CustomerEntity(Long id){
    this.id=id;
  }

  public CustomerEntity() {

  }
}
