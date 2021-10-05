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
public class TenComparator implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        String[] name1 = o1.getHoTen().split(" ");
        String[] name2 = o2.getHoTen().split(" ");
        return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
    }

}
