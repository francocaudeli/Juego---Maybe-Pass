package maybePass;

import java.awt.Color;
import java.awt.Graphics;

public class Ninja extends ElementoBasico {

    public Ninja(int posicionX, int posicionY, double velocidadX, double velocidadY, int ancho, int largo,
            Color color) {
        super(posicionX, posicionY, velocidadX, velocidadY, ancho, largo, color);
    }

    public void dibujarse(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillRect(getPosicionX(), getPosicionY(), getAncho(), getLargo());
    }
    
    public void frenarEnEjeXPorDerecha() {
    	setPosicionX(getPosicionX()-1);
    }

    public void frenarEnEjeYPorAbajo() {
    	setPosicionY(getPosicionY()-1);
    }
    
    public void frenarEnEjeXPorIzquierda() {
    	setPosicionX(getPosicionX()+1);
    }

    public void frenarEnEjeYPoArriba() {
    	setPosicionY(getPosicionY()+1);
    }
}
