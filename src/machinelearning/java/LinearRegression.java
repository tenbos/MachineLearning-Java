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

    private final List<Vec2d> m_dataSet;

    private double m_slope;
    private double m_intercept;
    private final double m_learningRate;

    public LinearRegression(
            List<Vec2d> dataSet,
            double slope,
            double intercept,
            double learningRate) {

        m_dataSet = dataSet;
        m_slope = slope;
        m_intercept = intercept;
        m_learningRate = learningRate;
    }

    public void regress() {

        for (int i = 0; i < 1000; i++) {

            double sum1 = 0.0d;
            double sum2 = 0.0d;

            for (Vec2d data : m_dataSet) {
                sum1 += ((m_slope * data.x + m_intercept) - data.y) * data.x;
                sum2 += (m_slope * data.x + m_intercept) - data.y;
            }

            m_slope = m_slope - (m_learningRate * sum1);
            m_intercept = m_intercept - (m_learningRate * sum2);

            System.out.print("slope = " + m_slope);
            System.out.print("\t");
            System.out.println("intercept = " + m_intercept);
        }

        System.out.println("y = " + m_slope + "x + " + m_intercept);
    }

}
