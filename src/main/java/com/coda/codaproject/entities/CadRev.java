package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cad_rev")
public class CadRev {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "cad_rev_id")
  private long cadRevId;
  @Column(name = "cad")
  private long cad;
  @Column(name = "revision")
  private String revision;
  @Column(name = "ts")
  private java.sql.Timestamp ts;
}
