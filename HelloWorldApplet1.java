/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chat.connection;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Euphern_Java
 */
public class HelloWorldApplet1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

     public void paint(Graphics g){
    /*		 * Use
     * void drawString(String str, int x, int y)
     * method to print the string at specified location x and y.
     */
        g.drawString("Hello World", 50, 50);
    }
}
