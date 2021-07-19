/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Phantich;
import Bean.PhantichGender;
import java.util.List;

/**
 *
 * @author LoiDinh
 */
public interface ThongKeService {
    public List<Phantich> getlistBy();
    public List<PhantichGender> getlistByGender();
}
