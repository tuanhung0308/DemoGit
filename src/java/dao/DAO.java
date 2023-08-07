/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Article;

/**
 *
 * @author DELL
 */
public class DAO extends DBContext{
    public ArrayList<Article> getAllArticle(){
        ArrayList<Article> list = new ArrayList<>();
        try{
            String sql = "select * from Article";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                list.add(new Article(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4)));
            }
        }catch (Exception e){
           
        }
        return list;
    }
}
