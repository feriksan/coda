package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "loading_status")
public class LoadingStatus {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "loading_id")
  private long loadingId;
  private long po;
  private String status;
}
