/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;

/**
 *
 * @author LaptopDT
 */
public class DataImp implements Data {

    private static final String currentFile = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String path_csv_infor = currentFile + SEPARATOR + "data" + SEPARATOR + "FileDataInfo.csv";
    private static final String path_csv_score = currentFile + SEPARATOR + "data" + SEPARATOR + "FileDataScore.csv";

    @Override
    public void WriteFileJson(List<SinhVien> list, String fileName) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            Gson gson = new Gson();
            Type classOfT = new TypeToken<List<SinhVien>>() {
            }.getType();
            gson.toJson(list, classOfT, fw);
        } catch (IOException ex) {
            Logger.getLogger(DataImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(DataImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<SinhVien> ReadFileJson(String fileName) {
        FileReader fr = null;
        List<SinhVien> list = new ArrayList<>();
        try {

            fr = new FileReader(fileName);
            Gson gson = new Gson();
            Type classOfT = new TypeToken<List<SinhVien>>() {
            }.getType();
            list = gson.fromJson(fr, classOfT);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DataImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    @Override
    public void WriteFileCSVInfor(List<SinhVien> list,String nameFile) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path_csv_infor);
            String tilte = "STT,MSV,Họ và tên,Lớp niên chế,Ngày sinh,Quê quán";
            fw.write(tilte);
            fw.write("\n");
            int i = 1;
            for (SinhVien sv : list) {
                String f = String.format("%d,%s,%s,%s,%s,%s", i++, sv.getMaSV(), sv.getHoTen(),
                        sv.getTenLopNC(), sv.getNgaySinh(), sv.getQueQuan());
                fw.write(f);
                fw.write("\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void WriteFileCSVScore(List<SinhVien> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
