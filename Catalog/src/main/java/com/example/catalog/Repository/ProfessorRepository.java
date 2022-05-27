package com.example.catalog.Repository;

import com.example.catalog.Enums.Profile;
import com.example.catalog.Model.Professor;
import com.example.catalog.Model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProfessorRepository {



    private String url = "jdbc:mysql://localhost:3325/catalog_pao";
    private String username = "root";
    private String password = "pao";

    public List<Professor> getProfessor() {
        String sql = "select * from professor";
        List<Professor> list = new ArrayList<Professor>();

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            ResultSet res = statement.executeQuery();

            while (res.next()) {
                Professor entity = new Professor();

                entity.setId(res.getInt("ID"));
                entity.setFirstName(res.getString("FIRST_NAME"));
                entity.setLastName(res.getString("LAST_NAME"));
                entity.setPhone_number(res.getInt("PHONE_NUMBER"));
                entity.setEmail(res.getString("EMAIL"));


                list.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }



    public void addProfessor(Professor entity){
        String sql = "insert into professor values (NULL, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setInt(3, entity.getPhone_number());
            statement.setString(2, entity.getEmail());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProfessor(int id, Professor entity){
        String sql = "update professor set FIRST_NAME = ?, LAST_NAME = ?, PHONE_NUMBER = ?, EMAIL = ? where id = " + id;

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setInt(3, entity.getPhone_number());
            statement.setString(2, entity.getEmail());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProfessor(int id){
        String sql = "delete from professor where ID = " + id;

        try(Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}


