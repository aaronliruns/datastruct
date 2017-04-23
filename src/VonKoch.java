/**
 * Created by Developer on 4/24/2017.
 */

import java.awt.*;
import java.awt.event.*;

public class VonKoch extends Frame implements ActionListener {
    private TextField lvl, len;

    VonKoch() {
        super("von Koch snowflake");
        Label lvlLbl = new Label("level");
        lvl = new TextField("4", 3);
        Label lenLbl = new Label("side");
        len = new TextField("200", 3);
        Button draw = new Button("draw");
        lvl.addActionListener(this);
        len.addActionListener(this);
        draw.addActionListener(this);
        setLayout(new FlowLayout());
        add(lvlLbl);
        add(lvl);
        add(lenLbl);
        add(len);
        add(draw);
        setSize(600, 400);
        setForeground(Color.white);
        setBackground(Color.red);
        show();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private double angle;
    private Point currPt, pt = new Point();

    private void right(double x) {
        angle += x;
    }

    private void left(double x) {
        angle -= x;
    }

    private void drawFourLines(double side, int level, Graphics g) {
        if (level == 0) {
// arguments to sin() and cos() must be angles given in radians,
// thus, the angles given in degrees must be multiplied by PI/180;
            pt.x = ((int) (Math.cos(angle * Math.PI / 180) * side)) + currPt.x;
            pt.y = ((int) (Math.sin(angle * Math.PI / 180) * side)) + currPt.y;
            g.drawLine(currPt.x, currPt.y, pt.x, pt.y);
            currPt.x = pt.x;
            currPt.y = pt.y;
        } else {
            drawFourLines(side / 3.0, level - 1, g);
            left(60);
            drawFourLines(side / 3.0, level - 1, g);
            right(120);
            drawFourLines(side / 3.0, level - 1, g);
            left(60);
            drawFourLines(side / 3.0, level - 1, g);
        }
    }

    public void actionPerformed(ActionEvent e) { // ActionListener
        repaint();
    }

    public void paint(Graphics g) {
        int level = Integer.parseInt(lvl.getText().trim());
        double side = Double.parseDouble(len.getText().trim());
        currPt = new Point(200, 150);
        angle = 0;
        for (int i = 1; i <= 3; i++) {
            drawFourLines(side, level, g);
            right(120);
        }
    }

    static public void main(String[] a) {
        new VonKoch();
    }
}