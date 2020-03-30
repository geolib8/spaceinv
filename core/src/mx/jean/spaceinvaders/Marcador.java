package mx.jean.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

class Marcador {
    private int puntos;
    private float x;
    private float y;
    private Texto texto; //desplegar mensaje "puntos 250"
    //cosntructor
    public Marcador(float x, float y){
        this.x=x;
        this.y=y;
        this.puntos = 0;
        this.texto = new Texto("fuentealien.fnt");
    }
    public void reset(){
        puntos = 0;
    }
    //agrega puntos
    public void marcar(int puntos){
        this.puntos +=puntos;
    }
    public void render(SpriteBatch batch){
        String mensaje = "puntos:"+puntos;
        texto.render(batch,mensaje,x,y);
    }

}
