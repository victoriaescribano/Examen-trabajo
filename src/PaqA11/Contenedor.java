package PaqA11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenedor extends JFrame {
    private JTextField pais;
    private JTextField emisor;
    private JTextField receptor;
    private JTextField numIdentContenedor;
    private JTextField pesoContenedor;
    private JTextField inspeccionado;
    private JTextField prioridad;
    private JTextField descripcionContenido;
    private JButton aceptarButton;
    private JRadioButton noRadioButton;
    private JRadioButton síRadioButton;
    private JSpinner spinner1;
    private int identificador;
    private String procedencia;

    public Contenedor() {

    }

    public Contenedor(JTextField numIdentContenedor, JTextField pesoContenedor, JTextField pais, JTextField inspeccionado, JTextField prioridad, JTextField descripcionContenido, JTextField emisor, JTextField receptor) {
        this.numIdentContenedor = numIdentContenedor;
        this.pesoContenedor = pesoContenedor;
        this.pais = pais;
        this.inspeccionado = inspeccionado;
        this.prioridad = prioridad;
        this.descripcionContenido = descripcionContenido;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public JTextField getNumIdentContenedor() {
        return numIdentContenedor;
    }

    public JTextField getPesoContenedor() {
        return pesoContenedor;
    }

    public JTextField getPais() {
        return pais;
    }

    public JTextField isInspeccionado() {
        return inspeccionado;
    }

    public JTextField getPrioridad() {
        return prioridad;
    }

    public JTextField getDescripcionContenido() {
        return descripcionContenido;
    }

    public JTextField getEmisor() {
        return emisor;
    }

    public JTextField getReceptor() {
        return receptor;
    }

    public void setNumIdentContenedor(JTextField numIdentContenedor) {
        this.numIdentContenedor = numIdentContenedor;
    }

    public void setPesoContenedor(JTextField pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public void setPais(JTextField pais) {
        this.pais = pais;
    }

    public void setInspeccionado(JTextField inspeccionado) {
        this.inspeccionado = inspeccionado;
    }

    public void setPrioridad(JTextField prioridad) {
        this.prioridad = prioridad;
    }

    public void setDescripcionContenido(JTextField descripcionContenido) {
        this.descripcionContenido = descripcionContenido;
    }

    public void setEmisor(JTextField emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(JTextField receptor) {
        this.receptor = receptor;
    }


    @Override
    public String toString() {
        return "Contenedor{" +
                "pais=" + pais +
                ", emisor=" + emisor +
                ", receptor=" + receptor +
                ", numIdentContenedor=" + numIdentContenedor +
                ", pesoContenedor=" + pesoContenedor +
                ", inspeccionado=" + inspeccionado +
                ", prioridad=" + prioridad +
                ", descripcionContenido=" + descripcionContenido +
                '}';
    };

    public int getIdentificador() {
        return this.identificador;
    }


    public void setIdentificador(int identificador) {
        this.identificador=identificador;
    }

    public String getProcedencia() {
        return this.procedencia;
    }
}
