package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Taller1_Oficial {

    public static void main(String[] args) {
        //Rango para el plano
        double min = -1.0;
        double max = 1.0;

        //Creacion del plano con el rango
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        //Para que no parpadee la pantalla
        StdDraw.enableDoubleBuffering();

        /**
         * Creacion de otro rango ya que al momento de la creacion de la linea aveces las que seguian a la primera
         * aparecian mas abajo y terminaban bugueandose.
         */
        double min2 = -0.4;
        double max2 = 0.4;

        // Creacion de la linea 1
        double x0 = min2 + (max2 - min2) * Math.random();
        double y0 = min2 + (max2 - min2) * Math.random();

        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();

        /**
         * Creacion de velocidades para cada xy, ya que asi hace el efecto de que al chocar se va haciendo pequeña y
         * luego se devuelve a su tamaño inicial
         * la velocidad la multipique por 0.003 ya que si lo dejaba sin el 0.003 iba muyy rapido
         */
        double vx = (Math.random() * 0.003);
        double vy = (Math.random() * 0.003);

        double v12x = vx;
        double v12y = vy;

        /**
         * Ahora para cada linea le quite un poco de posicion para que aparecieran abajo de cada una
         * y la velocidad es la misma que la primera, ya que si eran diferentes tomaban diferente rumbo
         */

        // linea 2
        double x20 = x0;
        double x21 = x1;

        double y20 = y0 - 0.02;
        double y21 = y1 - 0.02;

        double v2x = vx;
        double v2y = vy;

        double v22x = vx;
        double v22y = vy;

        // linea 3
        double x30 = x0;
        double x31 = x1;


        double y30 = y0 - 0.04;
        double y31 = y1 - 0.04;

        double v3x = vx;
        double v3y = vy;

        double v23x = vx;
        double v23y = vy;

        // linea 4
        double x40 = x0;
        double x41 = x1;

        double y40 = y0 - 0.06;
        double y41 = y1 - 0.06;

        double v4x = vx;
        double v4y = vy;

        double v24x = vx;
        double v24y = vy;

        // linea 5
        double x50 = x0;
        double y50 = y0 - 0.08;

        double x51 = x1;
        double y51 = y1 - 0.08;

        double v5x = vx;
        double v5y = vy;

        double v25x = vx;
        double v25y = vy;

        // linea 6
        double x60 = x0;
        double y60 = y0 - 0.10;

        double x61 = x1;
        double y61 = y1 - 0.10;

        double v6x = vx;
        double v6y = vy;

        double v26x = vx;
        double v26y = vy;



        //Creacion del ciclo while para las fisicas de las colisiones
        while (true) {



            //Creacion de colisiones Linea 1
            if (Math.abs(x1 + vx) > 1.0) {
                vx = -vx;
            }
            if (Math.abs(y1 + vy) > 1.0) {
                vy = -vy;
            }
            x1 += vx;
            y1 += vy;


            if (Math.abs(x0 + v12x) > 1.0) {
                v12x = -v12x;
            }
            if (Math.abs(y0 + v12y) > 1.0) {
                v12y = -v12y;
            }
            y0 += v12y;
            x0 += v12x;

            //Colisiones Linea2
            if (Math.abs(x21 + v2x) > 1.0) {
                v2x = -v2x;
            }
            if (Math.abs(y21 + v2y) > 1.0) {
                v2y = -v2y;
            }
            x21 += v2x;
            y21 += v2y;


            if (Math.abs(x20 + v22x) > 1.0) {
                v22x = -v22x;
            }
            if (Math.abs(y20 + v22y) > 1.0) {
                v22y = -v22y;
            }
            y20 += v22y;
            x20 += v22x;

            //Colisiones Linea3
            if (Math.abs(x31 + v3x) > 1.0) {
                v3x = -v3x;
            }
            if (Math.abs(y31 + v3y) > 1.0) {
                v3y = -v3y;
            }
            x31 += v3x;
            y31 += v3y;


            if (Math.abs(x30 + v23x) > 1.0) {
                v23x = -v23x;
            }
            if (Math.abs(y30 + v23y) > 1.0) {
                v23y = -v23y;
            }
            y30 += v23y;
            x30 += v23x;

            //Colisiones Linea4
            if (Math.abs(x41 + v4x) > 1.0) {
                v4x = -v4x;
            }
            if (Math.abs(y41 + v4y) > 1.0) {
                v4y = -v4y;
            }
            x41 += v4x;
            y41 += v4y;


            if (Math.abs(x40 + v24x) > 1.0) {
                v24x = -v24x;
            }
            if (Math.abs(y40 + v24y) > 1.0) {
                v24y = -v24y;
            }
            y40 += v24y;
            x40 += v24x;

            //Colisiones Linea5
            if (Math.abs(x51 + v5x) > 1.0) {
                v5x = -v5x;
            }
            if (Math.abs(y51 + v5y) > 1.0) {
                v5y = -v5y;
            }
            x51 += v5x;
            y51 += v5y;


            if (Math.abs(x50 + v25x) > 1.0) {
                v25x = -v25x;
            }
            if (Math.abs(y50 + v25y) > 1.0) {
                v25y = -v25y;
            }
            y50 += v25y;
            x50 += v25x;

            //Colisiones Linea6
            if (Math.abs(x61 + v6x) > 1.0) {
                v6x = -v6x;
            }
            if (Math.abs(y61 + v6y) > 1.0) {
                v6y = -v6y;
            }
            x61 += v6x;
            y61 += v6y;


            if (Math.abs(x60 + v26x) > 1.0) {
                v26x = -v26x;
            }
            if (Math.abs(y60 + v26y) > 1.0) {
                v26y = -v26y;
            }
            y60 += v26y;
            x60 += v26x;

            // Para que las lineas no pinten durante su recorrido
            StdDraw.clear();


            //Creacion de cada linea en el standard draw
            StdDraw.setPenColor(Color.RED);
            StdDraw.line(x0, y0, x1, y1);
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x20, y20, x21, y21);
            StdDraw.setPenColor(Color.CYAN);
            StdDraw.line(x30, y30, x31, y31);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(x40, y40, x41, y41);
            StdDraw.setPenColor(Color.magenta);
            StdDraw.line(x50, y50, x51, y51);
            StdDraw.setPenColor(Color.red);
            StdDraw.line(x60, y60, x61, y61);
            StdDraw.show();





        }

    }
}


/**
 * No supe donde poner subprogramas ya que todas las lineas tenian variables diferentes.
 *
 */
