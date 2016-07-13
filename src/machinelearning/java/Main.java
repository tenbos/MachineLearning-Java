/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinelearning.java;

import com.sun.javafx.geom.Vec2d;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author y-murakoshi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Vec2d> data = new ArrayList<>();

        data.add(new Vec2d(10, 10));
        data.add(new Vec2d(4, 5));
        data.add(new Vec2d(2, 5));
        data.add(new Vec2d(2, 4));
        data.add(new Vec2d(8, 4));
        data.add(new Vec2d(9, 6));
        data.add(new Vec2d(7, 6));
        data.add(new Vec2d(5, 2));
        data.add(new Vec2d(1, 1));
        data.add(new Vec2d(3, 2));
        data.add(new Vec2d(4, 7));
        data.add(new Vec2d(6, 7));
        data.add(new Vec2d(8, 9));
        data.add(new Vec2d(11, 8));
        data.add(new Vec2d(6, 4));

        LinearRegression lr = new LinearRegression(data, 5, 5, 0.01);
        lr.regress();
    }
}
