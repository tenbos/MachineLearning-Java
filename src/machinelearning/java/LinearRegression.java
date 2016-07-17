/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinelearning.java;

import com.sun.javafx.geom.Vec2d;
import java.util.List;

/**
 *
 * @author y-murakoshi
 */
public class LinearRegression {

    private final List<Vec2d> m_data;

    private double m_a;
    private double m_b;
    private double m_learningRate;

    public LinearRegression(List<Vec2d> data, double a, double b, double learningRate) {
        m_data = data;
        m_a = a;
        m_b = b;
        m_learningRate = learningRate;
    }

    public void regress() {

        for (int i = 0; i < 1000; i++) {

            double sum1 = 0.0d;
            double sum2 = 0.0d;

            for (Vec2d data : m_data) {
                sum1 += ((m_a * data.x + m_b) - data.y) * data.x;
                sum2 += (m_a * data.x + m_b) - data.y;
            }

            m_a = m_a - (m_learningRate * sum1);
            m_b = m_b - (m_learningRate * sum2);

            System.out.println("m_a = " + m_a);
            System.out.println("m_b = " + m_b);
        }

        System.out.println("y = " + m_a + "x + " + m_b);
    }

}
