package org.donstu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainApp extends JPanel implements ActionListener {

    private Ellipse ellipse;
    private MovingCircle movingCircle;
    private Circle Circle;
    private Action action;
    private Timer timer;

    public MainApp() {
        ellipse = new Ellipse(200, 200, 100, 50);
        movingCircle = new MovingCircle(200, 200, 10);
        Circle = new Circle(100, 100, 30);
        action = new Action(200, 300);

        timer = new Timer(20, this);
        timer.start();

        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                int moveStep = 10;

                if (key == KeyEvent.VK_LEFT) {
                    action.move(-moveStep, 0);
                } else if (key == KeyEvent.VK_RIGHT) {
                    action.move(moveStep, 0);
                } else if (key == KeyEvent.VK_UP) {
                    action.move(0, -moveStep);
                } else if (key == KeyEvent.VK_DOWN) {
                    action.move(0, moveStep);
                }
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                action.setPosition(e.getX(), e.getY());
                repaint();
            }
        });
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ellipse.draw(g);
        movingCircle.draw(g);
        Circle.draw(g);
        action.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        movingCircle.updatePosition(100, 50); // радиусы эллипса
        Circle.updatePosition(getWidth(), getHeight());
        repaint(); // перерисовка панели
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Circle in Ellipse");
        MainApp panel = new MainApp();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
