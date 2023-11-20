package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String username;
  private String password;
  private String email;

  @OneToMany(
          mappedBy = "pic",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JsonIgnore
  private List<DisposePo> userDisposed;
}
