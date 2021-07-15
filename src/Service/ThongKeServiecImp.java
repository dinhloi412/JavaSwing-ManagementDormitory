/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Phantich;
import Dao.ThongkeDao;
import Dao.ThongkeDaoImpl;
import java.util.List;

/**
 *
 * @author LoiDinh
 */
public class ThongKeServiecImp implements ThongKeService{
    private ThongkeDao thongkedao=null;

    public ThongKeServiecImp() {
        thongkedao= new ThongkeDaoImpl();
        
    }
    

    
    @Override
    public List<Phantich> getlistBy() {
        return thongkedao.getlistBy();
    }
    
}
