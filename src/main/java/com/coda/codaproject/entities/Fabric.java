package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fabric")
public class Fabric {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "fabric_id")
  private long fabricId;
  private long po;
  @Column(name = "fabric_name")
  private String fabricName;
}
