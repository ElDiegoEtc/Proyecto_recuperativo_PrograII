package Grafica;
import logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/*public class FlechaDrawerApp extends JFrame {
    private List<Conector> conectorList = new ArrayList<>();
    private JPanel canvas;

    public FlechaDrawerApp() {
        setTitle("Flecha Drawer App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                for (Conector arrow : conectorList) {
                    int x1 = arrow.getX();
                    int y1 = arrow.getY();
                    int x2 = arrow.getX_j();
                    int y2 = arrow.getY_j();

                    // Dibuja la línea principal de la flecha
                    g2d.drawLine(x1, y1, x2, y2);

                    // Calcula la dirección de la flecha
                    double angle = Math.atan2(y2 - y1, x2 - x1);

                    // Longitud de las líneas de la flecha
                    int arrowSize = 10;
                    int dx = (int) (arrowSize * Math.cos(angle));
                    int dy = (int) (arrowSize * Math.sin(angle));

                    // Dibuja las líneas de la punta de la flecha
                    g2d.drawLine(x2, y2, x2 - dx - dy, y2 - dy + dx);
                    g2d.drawLine(x2, y2, x2 - dx + dy, y2 - dy - dx);

                    // Aquí puedes agregar lógica adicional para dibujar relleno o cambiar el tipo de punta
                    if (arrow instanceof HerenciaConectorDecorator) {
                        // Dibuja una punta de herencia (triangular o rombo) según el tipo de punta
                        if (arrow.getTipoPunta()) {
                            // Dibuja triangular
                            // ...
                        } else {
                            // Dibuja rombo
                            // ...
                        }
                    }
                    // Agrega lógica similar para otros tipos de flechas
                }
            }
        };
        canvas.setPreferredSize(new Dimension(800, 600));
        add(canvas, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Crear Flecha Herencia", Flecha.INHERITANCE);
        // Agrega botones para otros tipos de flechas aquí

        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }

    private void addButton(JPanel panel, String text, Flecha flechaType) {
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea una nueva flecha del tipo especificado y agrégala a la lista
                Conector nuevaFlecha = new SimpleConector(0, 0, flechaType, true, 100, 100);
                conectorList.add(nuevaFlecha);

                // Redibuja el canvas para reflejar la nueva flecha
                canvas.repaint();
            }
        });
        panel.add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlechaDrawerApp();
            }
        });
    }
}
*/
