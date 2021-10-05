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
public class DTBtangDanComparator implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getDTB() == o2.getDTB()) {
            return 0;
        } else if (o1.getDTB() > o2.getDTB()) { // o1 > o2 là sx từ 1->10
            return 1;
        }
        return -1;
    }

}
