package org.factoriaf5.appfa.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nhc;
    private String telefono;
    private boolean miocardio;
    private boolean consentimiento;
    private String archivo;
    private LocalDateTime fechaRegistro;



    public Paciente(Long id, String nhc, String telefono, LocalDateTime fechaRegistro, boolean miocardio, boolean consentimiento, String archivo) {
        this.id = id;
        this.nhc = nhc;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.miocardio = miocardio;
        this.consentimiento = consentimiento;
        this.archivo = archivo;
    }

    public Paciente(){
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getNhc() {
        return nhc;
    }
    public void setNhc(String nhc) {
        this.nhc = nhc;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean getConsentimiento() {
        return consentimiento;
    }
    public void setConsentimiento(boolean consentimiento) {
        this.consentimiento = consentimiento;
    }

    public boolean getMiocardio() {
        return miocardio;
    }
    public void setMiocardio(String miocardio) {
        this.miocardio = miocardio.equals("on");
    }


    public String getArchivo() {
        return archivo;
    }
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nhc='" + nhc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", archivo='" + archivo + '\'' +
                '}';
    }

  /*     return fileName;
    public void setPhoto(String fileName) {
    }

    public String getFileName() {

        public void setFileName(String fileName) {
        this.fileName = fileName;
    }*/

    public String getPhotoImagePath() {
        if (archivo == null || id == null) return null;
        return "/paciente-photo/" + id + "/" + archivo;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
