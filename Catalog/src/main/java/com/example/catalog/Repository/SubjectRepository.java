package com.example.catalog.Repository;

import com.example.catalog.Enums.Profile;
import com.example.catalog.Model.Professor;
import com.example.catalog.Model.Student;
import com.example.catalog.Model.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class SubjectRepository{

    private static String url = "jdbc:mysql://localhost:3325/catalog_pao";
    private static String username = "root";
    private static String password = "pao";


    public static void addSubject(Subject entity){
        String sql = "insert into subject values (NULL, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, entity.getName());
            statement.setString(3, entity.getAn());


            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleteSubject(int id){
        String sql = "delete from subject where ID = " + id;

        try(Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
