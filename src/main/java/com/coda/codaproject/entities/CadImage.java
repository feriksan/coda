package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cad_image")
public class CadImage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "cad_image_id")
  private long cadImageId;
  @ManyToOne
  @JoinColumn(name = "cad")
  @JsonIgnore
  private Cad cad;
  @ManyToOne
  @JoinColumn(name = "drawer")
  private Users drawer;
  @ManyToOne
  @JoinColumn(name = "po_product")
  private ProductPo po_product;
  @Column(name = "image")
  private String image;
  private String imageView;
}
