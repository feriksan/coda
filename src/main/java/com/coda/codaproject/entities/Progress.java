package com.coda.codaproject.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "product_progress")
@Data
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "product_po")
    private ProductPo product_po;
    private String progress;
    private String type;
    private String note;
    private Timestamp ts;

    @OneToMany(
            mappedBy = "progress_id",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ProgressImage> progress_image;
}
