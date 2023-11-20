package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fabric_status")
public class FabricStatus {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "fabric_status_id")
  private long fabricStatusId;
  private long fabric;
  private String status;
  private java.sql.Timestamp ts;

}
