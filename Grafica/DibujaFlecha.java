package Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

public class DibujaFlecha extends JPanel {
    private final int seleccion;
    private Point inicio, fin;
    private boolean dibujando;

    public DibujaFlecha(int seleccion) {
        this.seleccion = seleccion;
        dibujando = false;

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                inicio = e.getPoint();
                dibujando = true;
            }

            public void mouseReleased(MouseEvent e) {
                dibujando = false;
                fin = e.getPoint();
                repaint();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (dibujando) {
                    fin = e.getPoint();
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (dibujando) {
            g.setColor(Color.BLACK);
            drawArrow(g, inicio.x, inicio.y, fin.x, fin.y, seleccion);
        }
    }

    /**
     * dibuja la linea del conector y su respectiva punta para representar los diferentes tipos de conectores
     * @param g: Grificos g
     * @param x1: coordenada x punto inicial
     * @param y1: coordenada y punto inicial
     * @param x2: coordenada x punto final
     * @param y2: coordenada y punto final
     * @param seleccion: numero que representa que tipo de conector se dibujara
     */
    private void drawArrow(Graphics g, int x1, int y1, int x2, int y2, int seleccion) {
        Graphics2D g2d = (Graphics2D) g.create();

        double dx = x2 - x1, dy = y2 - y1;
        double angle = Math.atan2(dy, dx);
        int len = (int) Math.sqrt(dx * dx + dy * dy);

        AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
        at.concatenate(AffineTransform.getRotateInstance(angle));
        g2d.transform(at);

        switch (seleccion) { //Es flecha rellena, Dependencia
            case 1:
                float[] dashPattern = {10, 5};
                g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, dashPattern, 0));
                g2d.drawLine(0, 0, len, 0);
                g2d.setStroke(new BasicStroke());
                g2d.drawLine(len, 0, len - 5, -5);
                g2d.drawLine(len, 0, len - 5, 5);
                break;

            case 2: // Conector sin relleno, Generalizacion
                g2d.drawLine(0, 0, len, 0);
                g2d.drawPolygon(new int[]{len, len - 5, len - 5, len},
                        new int[]{0, -5, 5, 0}, 4);
                break;

            case 3: // Rombo sin relleno, Agregacion
                int romboSize = 10;
                g2d.drawLine(0, 0, len - romboSize / 2, 0);
                g2d.drawPolygon(new int[]{len - romboSize, len, len - romboSize, len - 2 * romboSize},
                        new int[]{-romboSize / 2, 0, romboSize / 2, 0}, 4);
                break;

            case 4: // Solo línea, Asociacion
                g2d.drawLine(0, 0, len, 0);
                break;

            case 5: // Rombo con relleno, Composicion
                romboSize = 10;
                g2d.drawLine(0, 0, len - romboSize / 2, 0);
                g2d.fillPolygon(new int[]{len - romboSize, len, len - romboSize, len - 2 * romboSize},
                        new int[]{-romboSize / 2, 0, romboSize / 2, 0}, 4);
                break;

            case 6: // Conector sin relleno con línea entrecortada, Realizacion
                dashPattern = new float[]{10, 5};
                g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, dashPattern, 0));
                g2d.drawLine(0, 0, len - 5, 0);
                g2d.drawPolygon(new int[]{len, len - 5, len - 5, len},
                        new int[]{0, -5, 5, 0}, 4);
                break;

            default:
                // Opción por defecto
                break;
        }

        g2d.dispose();
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo de Conector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DibujaFlecha(6));
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

