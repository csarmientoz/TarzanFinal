package Niveles;

import Niveles.Nivel1;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.scene.shape.Circle;
import javax.swing.JPanel;

public class TestPaintComponent1 extends JFrame{

    public TestPaintComponent1() {
        add(new Nivel1());
    }

    }
