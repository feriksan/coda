package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "cad")
public class Cad {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "cad_id")
  private long cadId;
  @OneToOne
  @JoinColumn(name = "product_project")
  private Po product_project;
  @Column(name = "date")
  private java.sql.Timestamp date;
  @Column(name = "code")
  private String code;
  @Column(name = "approval_status")
  private long approvalStatus;
  @Column(name = "checked_status")
  private long checkedStatus;
  @Column(name = "scale")
  private String scale;
  @Column(name = "drawing_number")
  private String drawingNumber;
  @Column(name = "qty")
  private long qty;
  @Column(name = "paper")
  private String paper;
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  @OneToMany(
          mappedBy = "cad",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  private List<CadImage> imageCad;
}
