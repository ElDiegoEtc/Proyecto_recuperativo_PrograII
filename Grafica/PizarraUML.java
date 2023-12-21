package Grafica;

import logica.Pizarra;
import logica.command.CommandConfiguracion;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PizarraUML extends JPanel {
    private Pizarra pizarraL;
    private PizarraPanel pizarraPanel;
    private JComboBox<String> tipoFlechaComboBox;
    private JLabel nombrePizarraLabel;
    private boolean primeraVez = true;
    private ArrayList<DibujaClases> listaDibujaClases;
    private ArrayList<DibujaFlecha> listaDibujaFlecha;
    private DibujaFlecha nuevaFlecha;


    public PizarraUML() {
        listaDibujaClases = new ArrayList<>();
        listaDibujaFlecha = new ArrayList<>();
        pizarraL = new Pizarra(new ArrayList<>(), new ArrayList<>());
        CommandConfiguracion.CommandConfiguracion(pizarraL);
        ComponentesInicial();
    }

    private void ComponentesInicial() {
        setLayout(new BorderLayout());

        pizarraPanel = new PizarraPanel(pizarraL);
        add(pizarraPanel, BorderLayout.CENTER);

        nombrePizarraLabel = new JLabel("Nombre de la Pizarra: " + pizarraL.getNombre());
        add(nombrePizarraLabel, BorderLayout.NORTH);

        JPanel botonesPanel = new JPanel();
        JPanel clasesPanel = new JPanel();
        clasesPanel.setLayout(new BoxLayout(clasesPanel, BoxLayout.Y_AXIS));

        JButton guardarButton = new JButton("Guardar Pizarra");
        JButton cargarButton = new JButton("Cargar Pizarra");
        JButton botonBorrarTodo = new JButton("Borrar todo");
        JButton anadirClaseC = new JButton("Crear clase Completa");
        JButton anadirClaseA = new JButton("Crear clase con titulo y atributos");
        JButton anadirClaseM = new JButton("Crear clase con titulo y metodos");


        /**
         * Guarda la pizarra con cierto nombre
         */
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (primeraVez) {
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la pizarra:");

                    if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                        pizarraL.setNombre(nuevoNombre);
                        primeraVez = false;
                    }
                }
                nombrePizarraLabel.setText(pizarraL.getNombre());
                pizarraL.clickBoton1();
                pizarraPanel.repaint();
            }
        });
        /**
         * Utiliza el boton 2 para cargar la pizarra con cierto nombre
         */
        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre EXACTO de pizarra a cargar:");
                pizarraL.setNombre(nuevoNombre);
                nombrePizarraLabel.setText(pizarraL.getNombre());
                pizarraL.clickBoton2();
                pizarraPanel.repaint();
            }
        });

        /**
         * Escucha si se presiona el boton, si lo hace, entonces deja crear una nueva clase completa mediante
         * el arrastre del mouse
         */
        anadirClaseC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DibujaClases nuevaClase = new DibujaClases(3, pizarraL);
                listaDibujaClases.add(nuevaClase);
                pizarraPanel.addDibujaClases(nuevaClase);
            }
        });
        anadirClaseA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DibujaClases nuevaClase = new DibujaClases(2, pizarraL);
                listaDibujaClases.add(nuevaClase);
                pizarraPanel.addDibujaClases(nuevaClase);
            }
        });
        anadirClaseM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DibujaClases nuevaClase = new DibujaClases(1, pizarraL);
                listaDibujaClases.add(nuevaClase);
                pizarraPanel.addDibujaClases(nuevaClase);
            }
        });

        botonBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizarraL.clickBoton5();
                pizarraPanel.repaint();
            }
        });


        botonesPanel.add(guardarButton);
        botonesPanel.add(cargarButton);
        botonesPanel.add(botonBorrarTodo);
        add(botonesPanel, BorderLayout.SOUTH);

        clasesPanel.add(anadirClaseC);
        clasesPanel.add(anadirClaseM);
        clasesPanel.add(anadirClaseA);
        add(clasesPanel, BorderLayout.WEST);

        /**Se hace un Jcombobox para seleccionar que conector dibujar, tomando de base
         * las caracteristicas de las flechas definidas en la logica
         */
        tipoFlechaComboBox = new JComboBox<>();
        tipoFlechaComboBox.addItem("Asociacion");
        tipoFlechaComboBox.addItem("Agregacion");
        tipoFlechaComboBox.addItem("Composicion");
        tipoFlechaComboBox.addItem("Generalizacion");
        tipoFlechaComboBox.addItem("Realizacion");
        tipoFlechaComboBox.addItem("Dependencia");
        tipoFlechaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFlecha = (String) tipoFlechaComboBox.getSelectedItem();
                nuevaFlecha = null;

                if (Objects.equals(selectedFlecha, "Asociacion")) {
                    nuevaFlecha = new DibujaFlecha(4, pizarraL);
                } else if (Objects.equals(selectedFlecha, "Agregacion")) {
                    nuevaFlecha = new DibujaFlecha(3, pizarraL);
                } else if (Objects.equals(selectedFlecha, "Composicion")) {
                    nuevaFlecha = new DibujaFlecha(5, pizarraL);
                } else if (Objects.equals(selectedFlecha, "Generalizacion")) {
                    nuevaFlecha = new DibujaFlecha(2, pizarraL);
                } else if (Objects.equals(selectedFlecha, "Realizacion")) {
                    nuevaFlecha = new DibujaFlecha(6, pizarraL);
                } else if (Objects.equals(selectedFlecha, "Dependencia")) {
                    nuevaFlecha = new DibujaFlecha(1, pizarraL);
                }

                // Comprobar si se ha creado una nueva flecha antes de añadirla
                if (nuevaFlecha != null) {
                    listaDibujaFlecha.add(nuevaFlecha);
                    pizarraPanel.addDibujaFlechas(nuevaFlecha);
                    pizarraPanel.revalidate();
                    pizarraPanel.repaint();
                }
            }
        });
        clasesPanel.add(tipoFlechaComboBox);
        add(clasesPanel, BorderLayout.WEST);
    }
}
