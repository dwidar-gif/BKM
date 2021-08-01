/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GlassSwingControl;

/**
 *
 * @author DONI
 */

import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GlassFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private MyAnimation animationShow = MyAnimation.NO_ANIMATION;
    private MyAnimation animationHide = MyAnimation.NO_ANIMATION;
    private int animationTime = 1000;
    private Point targetLocation;
    private Point startLocation;

public GlassFrame() {
        super();
        setAnimationShow(MyAnimation.NO_ANIMATION);
        setAnimationHide(MyAnimation.NO_ANIMATION);
        setAnimationTime(1000);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    public int getAnimationTime() {
        return animationTime;
    }

    public void setAnimationTime(int miliSecond) throws IllegalArgumentException {
        if (miliSecond < 0) {
            throw new IllegalArgumentException("Time can not negative");
        }
        firePropertyChange("animationTime", getAnimationTime(), miliSecond);
        this.animationTime = miliSecond;
    }

    public MyAnimation getAnimationShow() {
        return animationShow;
    }

    public void setAnimationShow(MyAnimation animation) {
        firePropertyChange("animation", getAnimationShow(), animation);
        this.animationShow = animation;
    }

    public MyAnimation getAnimationHide() {
        return animationHide;
    }

    public void setAnimationHide(MyAnimation animationHide) {
        firePropertyChange("animationHide", getAnimationHide(), animationHide);
        this.animationHide = animationHide;
    }

    public void exit() {
        setVisible(false);
        new Thread(new Runnable() {

            public void run() {
                try {
                    while (isVisible()) {
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                // Error
                } finally {
                    System.exit(0);
                }
            }
        }).start();
    }

    public void setX(int x) {
        Point location = getLocation();
        location.x = x;
        super.setLocation(location);
    }

    public void setY(int y) {
        Point location = getLocation();
        location.y = y;
        super.setLocation(location);
    }
}
