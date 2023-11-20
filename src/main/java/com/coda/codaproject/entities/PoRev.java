package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "po_rev")
public class PoRev {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "rev_id")
  private long revId;
  @ManyToOne
  @JoinColumn(name = "po_product")
  @JsonIgnore
  private ProductPo po_product;
  @Column(name = "note")
  private String note;
  @Column(name = "ts")
  private java.sql.Timestamp ts;
}
