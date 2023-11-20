package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "po")
public class Po {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long po_id;
  private String client;
  private String project_name;
  private java.sql.Date invoice_date;
  private String shipping_line;
  private String port_of_loading;
  private String port_of_destination;
  private String payment_condition;
  private long production_time;
  private String packaging;
  private String container;
  private java.sql.Timestamp created_at;
  @OneToOne(
          mappedBy = "product_project",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JsonIgnore
  private Cad cadPo;

  @OneToMany(
          mappedBy = "po",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JsonIgnore
  private List<DisposePo> poDisposed;

  @OneToMany(
          mappedBy = "po",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JsonIgnore
  private List<ProductPo> poProduct;

}
