package maybePass;

import java.awt.Color;
import java.awt.Graphics;

public class Estrella {

    public Moneda(int posicionX, int posicionY, double velocidadX, double velocidadY, int ancho, int largo,
            Color color) {
        super(posicionX, posicionY, velocidadX, velocidadY, ancho, largo, color);
    }

    public void dibujarse(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillOval(getPosicionX(), getPosicionY(), getAncho(), getLargo());
    }

    public void destruirse(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillOval(getPosicionX(), getPosicionY(), getAncho(), getLargo());
    }

}