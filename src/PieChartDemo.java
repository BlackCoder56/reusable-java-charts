import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import piechartdemo.customPieChart;

public class PieChartDemo extends JFrame {

    public PieChartDemo() {
        setTitle("Pie Chart Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Sample data
        Map<String, Double> myData = new HashMap<>();
        myData.put("Apples", 25.0);
        myData.put("Oranges", 20.0);
        myData.put("Bananas", 40.0);
        myData.put("Mangoes", 15.0);

        // Create reusable chart
        customPieChart pieChart = new customPieChart("Fruit Distribution", myData);

        // Add chart panel
        add(pieChart.getChartPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PieChartDemo().setVisible(true));
    }
}
