package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product_image")
public class ProductImage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "product_image_id")
  private long productImageId;
  @ManyToOne
  @JoinColumn(name = "po_product")
  @JsonIgnore
  private ProductPo po_product;
  @Column(name = "image")
  private String image;
  @Column(name = "image_type")
  private String imageType;
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

}
