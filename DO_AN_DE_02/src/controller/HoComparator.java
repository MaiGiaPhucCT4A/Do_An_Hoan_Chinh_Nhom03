/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.SinhVien;

/**
 *
 * @author LaptopDT
 */
public class HoComparator implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }

}
