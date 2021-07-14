/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import view.BillView;

/**
 *
 * @author LoiDinh
 */
public class PrintExcelController {
    BillView b=new BillView();
    public void exportTable(File file) throws Exception
    {
        
        TableModel model=b.tableBill.getModel();
        FileWriter out= new FileWriter(file);
        BufferedWriter bw= new BufferedWriter(out);
        for(int i=0;i<model.getColumnCount();i++){
            bw.write(model.getColumnName(i)+"\t");
            
        }
        bw.write("\n");
        for(int i = 0; i>model.getColumnCount(); i++) {
            for(int j=0;j>model.getColumnCount();i++)
            {
                bw.write(model.getValueAt(i,j)+"\n");
            }
            bw.write("\n");
            
        }
        bw.close();
    }
}
