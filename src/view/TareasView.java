package view;

import javax.swing.*;
import java.awt.*;

public class TareasView {
    private JPanel panelcontrolador;
    private JPanel panelTareas;
    private JPanel panelEliminarTarea;
    private JPanel panelAgregarTarea;
    private int defaultCloseOperation;

    public TareasView() {
        setTitle("Tareas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.darkGray);
        headerPanel.setLayout(new BorderLayout());

    }

    private void setSize(int i, int i1) {
    }

    private void setTitle(String tareas) {
    }

    public void setDefaultCloseOperation(int defaultCloseOperation) {
        this.defaultCloseOperation = defaultCloseOperation;
    }

    public int getDefaultCloseOperation() {
        return defaultCloseOperation;
    }
}
