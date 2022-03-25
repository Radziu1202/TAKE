/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.backing;

import static java.lang.Math.sin;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author radziu
 */
@Named(value = "lineChartBean")
@RequestScoped
public class LineChartBean {
    private LineChartModel chart;

    /**
     *
     */
    public LineChartBean() {
        chart = new LineChartModel();
        LineChartSeries s = new LineChartSeries();
        for(int i=0; i<360; i++) {
            s.set(i, sin(i));
        }
        chart.addSeries(s);
        chart.setLegendPosition("e");
        
        
        Axis x = chart.getAxis(AxisType.X);
        x.setLabel("Stopnie");
        x.setMin(0);
        x.setMax(360 );
        x.setTickInterval("10");
      
        
        Axis y = chart.getAxis(AxisType.Y);
        y.setLabel("Sinus");
        y.setMin(-1.5);
        y.setMax(1.5);
        chart.setZoom(true);
        
    }

    /**
     * @return the chart
     */
    public LineChartModel getChart() {
        return chart;
    }

    /**
     * @param chart the chart to set
     */
    public void setLineChart(LineChartModel chart) {
        this.chart = chart;
    }
}
