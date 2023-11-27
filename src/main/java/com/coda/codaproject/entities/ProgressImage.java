package com.coda.codaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "progress_image")
@Data
public class ProgressImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "progress_id")
    @JsonIgnore
    private Progress progress_id;
    @ManyToOne
    @JoinColumn(name = "product_po")
    private ProductPo product_po;
    private String image_url;
    private Timestamp ts;
}
