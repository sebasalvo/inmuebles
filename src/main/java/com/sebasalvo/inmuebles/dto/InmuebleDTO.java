package com.sebasalvo.inmuebles.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ssalvo on 5/22/2017.
 */
public class InmuebleDTO  implements Serializable {

    private Integer id;
    private String direccion;
    private String tipo;
    private Integer precio;
    private Integer expensas;
    private Integer superficie;
    private Integer piso;
    private Integer cantidadDeDormitorios;
    private Integer cantidadDeBanios;
    private Boolean cochera;
    private Integer antiguedad;
    private Boolean aptoCredito;
    private String inmobiliaria;
    private String notas;
    private Integer estrellas;
    private Date fechaDePublicacion;
    private Date fechaDeVisita;
    private Boolean visitado;
    private Boolean descartado;
    private String link;
    private String orientacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getExpensas() {
        return expensas;
    }

    public void setExpensas(Integer expensas) {
        this.expensas = expensas;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Integer getCantidadDeDormitorios() {
        return cantidadDeDormitorios;
    }

    public void setCantidadDeDormitorios(Integer cantidadDeDormitorios) {
        this.cantidadDeDormitorios = cantidadDeDormitorios;
    }

    public Integer getCantidadDeBanios() {
        return cantidadDeBanios;
    }

    public void setCantidadDeBanios(Integer cantidadDeBanios) {
        this.cantidadDeBanios = cantidadDeBanios;
    }

    public Boolean getCochera() {
        return cochera;
    }

    public void setCochera(Boolean cochera) {
        this.cochera = cochera;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Boolean getAptoCredito() {
        return aptoCredito;
    }

    public void setAptoCredito(Boolean aptoCredito) {
        this.aptoCredito = aptoCredito;
    }

    public String getInmobiliaria() {
        return inmobiliaria;
    }

    public void setInmobiliaria(String inmobiliaria) {
        this.inmobiliaria = inmobiliaria;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Date getFechaDeVisita() {
        return fechaDeVisita;
    }

    public void setFechaDeVisita(Date fechaDeVisita) {
        this.fechaDeVisita = fechaDeVisita;
    }

    public Boolean getVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }

    public Boolean getDescartado() {
        return descartado;
    }

    public void setDescartado(Boolean descartado) {
        this.descartado = descartado;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

}
