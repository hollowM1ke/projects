package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyInput implements KeyListener {
    public String player1key = "";
    public String player2key = "";
    boolean up, down, left, right, w, a, s, d = false;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = true;
            player1key = "right";

        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            left = true;
            player1key = "left";

        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            down = true;
            player1key = "down";

        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
            player1key = "up";

        }


        if (e.getKeyCode() == KeyEvent.VK_D) {
            d = true;
            player2key = "d";

        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            a = true;
            player2key = "a";

        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            s = true;
            player2key = "s";

        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            w = true;
            player2key = "w";

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (left){
                player1key = "left";
                right = false;

            }else if (up){
                player1key = "up";
                right = false;
            }else if (down){
                player1key = "down";
                right = false;
            }else{
                player1key = "";
                right = false;
            }


        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            if (right){
                player1key = "right";
                left = false;
            }else if (up){
                player1key = "up";
                left = false;
            }else if (down){
                player1key = "down";
                left = false;
            }else{
                player1key = "";
                left = false;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (left){
                player1key = "left";
                down = false;
            }else if (right){
                player1key = "right";
                down = false;
            }else if (up){
                player1key = "up";
                down = false;
            }else{
                player1key = "";
                down = false;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {

            if (left){
                player1key = "left";
                up = false;
            }else if (right){
                player1key = "right";
                up = false;
            }else if (down){
                player1key = "down";
                up = false;
            }else{
                player1key = "";
                up = false;
            }

        }


        if (e.getKeyCode() == KeyEvent.VK_D) {

            if (a){
                player2key = "a";
                d = false;
            }else if (w){
                player2key = "w";
                d = false;
            }else if (s){
                player2key = "s";
                d = false;
            }else{
                player2key = "";
                d = false;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            if (w){
                player2key = "w";
                a = false;
            }else if (d){
                player2key = "d";
                a = false;
            }else if (s){
                player2key = "s";
                a = false;
            }else{
                player2key = "";
                a = false;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_S) {

            if (a){
                player2key = "a";
                s = false;
            }else if (w){
                player2key = "w";
                s = false;
            }else if (d){
                player2key = "d";
                s = false;
            }else{
                player2key = "";
                s = false;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_W) {

            if (a){
                player2key = "a";
                w = false;
            }else if (d){
                player2key = "d";
                w = false;
            }else if (s){
                player2key = "s";
                w = false;
            }else{
                player2key = "";
                w = false;
            }

        }
    }
}