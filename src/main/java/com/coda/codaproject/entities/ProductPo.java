package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "product_po")
public class ProductPo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "product_id")
  private long productId;
  @ManyToOne
  @JoinColumn(name = "po")
  private Po po;
  @Column(name = "product_name")
  private String productName;
  @Column(name = "product_code")
  private String productCode;
  @Column(name = "width")
  private double width;
  @Column(name = "depth")
  private double depth;
  @Column(name = "height")
  private double height;
  @Column(name = "frame")
  private String frame;
  @Column(name = "foam_and_fabric")
  private String foamAndFabric;
  @Column(name = "cover")
  private String cover;
  @Column(name = "color")
  private String color;
  @Column(name = "detail")
  private String detail;
  @Column(name = "qty")
  private long qty;
  @Column(name = "unit_cbm")
  private double unitCbm;
  @Column(name = "total_cbm")
  private double totalCbm;
  @Column(name = "unit_price")
  private double unitPrice;
  @Column(name = "total_price")
  private double totalPrice;
  @Column(name = "fabric_consumption")
  private double fabricConsumption;
  @Column(name = "price_peryard")
  private double pricePeryard;
  @Column(name = "total_fabric_price")
  private double totalFabricPrice;
  @Column(name = "grade_b_nofabric")
  private double gradeBNofabric;
  @Column(name = "grade_b_fabric")
  private double gradeBFabric;
  @Column(name = "grade_c_nofabric")
  private double gradeCNofabric;
  @Column(name = "grade_c_fabric")
  private double gradeCFabric;
  @Column(name = "status")
  private String status;
  @Column(name = "note")
  private String note;
  private java.sql.Timestamp createdAt;

  @OneToMany(
          mappedBy = "po_product",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JsonIgnore
  private List<ProductImage> imageProducts;

  @OneToMany(
          mappedBy = "po_product",
          fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JsonIgnore
  private List<PoRev> revPoProduct;
}
