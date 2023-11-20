package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dispose_po")
public class DisposePo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "dispose_id")
  private long disposeId;
  @ManyToOne
  @JoinColumn(name = "po")
  private Po po;
  @ManyToOne
  @JoinColumn(name = "pic")
  private Users pic;
  @Column(name = "ts")
  private java.sql.Timestamp ts;
}
