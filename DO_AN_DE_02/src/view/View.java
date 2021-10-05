/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author LaptopDT
 */
public interface View {
// hiện ds kiểu T ở bảng model (dùng chung trong tất cả cả các bảng trong hệ thống của mình)

    void showDataSV(List<SinhVien> list, DefaultTableModel model);

    void showDataDiem(List<SinhVien> list, DefaultTableModel model);

}
