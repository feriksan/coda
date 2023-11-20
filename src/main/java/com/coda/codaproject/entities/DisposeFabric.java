package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dispose_fabric")
public class DisposeFabric {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "dispose_fabric_id")
  private long disposeFabricId;
  private String pic;
  private long fabric;

}
