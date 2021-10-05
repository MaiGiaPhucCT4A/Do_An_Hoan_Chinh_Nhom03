/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author LaptopDT
 */
public interface Data {

    void WriteFileJson(List<SinhVien> list, String fileName);

    List<SinhVien> ReadFileJson(String fileName);
    
    void WriteFileCSVInfor(List<SinhVien> list,String nameFile);
    
    void WriteFileCSVScore(List<SinhVien> list);

}
