/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Phantich;
import Dao.ThongkeDao;
import Dao.ThongkeDaoImpl;
import Service.ThongKeService;
import Service.ThongKeServiecImp;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author LoiDinh
 */
public class QuanLyThongKeController {
     private ThongKeService thongkeservice=null;
     
     public QuanLyThongKeController() {
        thongkeservice= new ThongKeServiecImp();
        
    }
    public  void setDateToChart1(JPanel jpnItem)
     {
         List<Phantich> listIten=thongkeservice.getlistBy();
         
         DefaultCategoryDataset dataset= new DefaultCategoryDataset();
         if(listIten!=null)
         {
              for(Phantich item:listIten)
              {
             dataset.addValue(item.getSoluongdangky(), "Bill", item.getNgaydangky());
              }
              JFreeChart chart= ChartFactory.createBarChart("Thống kê hoá đơn theo ngày", "Thời gian", "Số Lượng", dataset,PlotOrientation.VERTICAL, false, true, false);
              
              ChartPanel chartpanel= new ChartPanel(chart);
              chartpanel.setPreferredSize(new Dimension(jpnItem.getWidth(),300));
              
              jpnItem.removeAll();
              jpnItem.setLayout(new CardLayout());
              jpnItem.add(chartpanel);
              jpnItem.validate();
              jpnItem.repaint();
         }
     }
    
}
