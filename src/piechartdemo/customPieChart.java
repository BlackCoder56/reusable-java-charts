
package piechartdemo;

import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author elisha
 */
public class customPieChart {
    
    private String title;
    private Map<String, Double> data;
    
    public customPieChart(String title, Map<String, Double> data) {
        this.title = title;
        this.data = data;
    }
    
    public JPanel getChartPanel() {
        // Create dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }
        
        // Create pie chart
        JFreeChart chart = ChartFactory.createPieChart(
                title,
                dataset,
                true, // include legend
                true,
                false
        );
        
        // Return as Swing panel
        return new ChartPanel(chart);
    }
}
