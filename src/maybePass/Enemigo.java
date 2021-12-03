package maybePass;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Enemigo extends ElementoBasico {

    public Enemigo(int posicionX, int posicionY, double velocidadX, double velocidadY, int ancho, int largo,
            Color color) {
        super(posicionX, posicionY, velocidadX, velocidadY, ancho, largo, color);
    }

        public void dibujarse(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillOval(getPosicionX(), getPosicionY(), getAncho(), getLargo());
    }

}
