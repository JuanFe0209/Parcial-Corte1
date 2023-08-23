package org.example.domain.models;

import org.example.domain.enums.ContactCategory;

public class Contact {
    public String nombre;
    public String direccion;
    public ContactCategory tipoContacto;
    public String correoElectronico;
    public int telefono;

    public Contact(String nombre, String direccion, ContactCategory tipoContacto, String correoElectronico, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoContacto = tipoContacto;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ContactCategory getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(ContactCategory tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoContacto=" + tipoContacto +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}

