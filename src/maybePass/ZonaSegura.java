package maybePass;

import java.awt.Color;
import java.awt.Graphics;

public class ZonaSegura extends ElementoBasico {

    
    public ZonaSegura(int posicionX, int posicionY , int ancho, int largo,
            Color color) {
        super(posicionX, posicionY,  ancho, largo, color);
    }

    public void dibujarse(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillRect(getPosicionX(), getPosicionY(), getAncho(), getLargo());
    }

}
