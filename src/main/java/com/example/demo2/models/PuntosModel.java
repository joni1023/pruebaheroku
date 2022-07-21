package com.example.demo2.models;

import javax.persistence.*;

@Entity
@Table(name = "puntos")
public class PuntosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Integer calificacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cuento_id")
    private CuentoModel cuento;

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Long getId() {
        return id;
    }

    public CuentoModel getCuento() {
        return cuento;
    }

    public void setCuento(CuentoModel cuento) {
        this.cuento = cuento;
    }

}
