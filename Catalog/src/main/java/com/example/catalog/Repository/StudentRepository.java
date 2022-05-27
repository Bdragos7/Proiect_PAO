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
public class StudentRepository {

    private String url = "jdbc:mysql://localhost:3325/catalog_pao";
    private String username = "root";
    private String password = "pao";

    public List<Student> getStudent() {
        String sql = "select * from student";
        List<Student> list = new ArrayList<Student>();

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            ResultSet res = statement.executeQuery();

            while (res.next()) {
                Student entity = new Student();

                entity.setId(res.getInt("ID"));
                entity.setFirstName(res.getString("FIRST_NAME"));
                entity.setLastName(res.getString("LAST_NAME"));
                entity.setYear2(res.getString("YEAR"));
                entity.setProfile2(res.getString("PROFILE"));


                list.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    public void addStudent(Student entity){
        String sql = "insert into student values (NULL, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setString(3, entity.getYear2());
            statement.setString(4, entity.getProfile2());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, Student entity){
        String sql = "update student set FIRST_NAME = ?, LAST_NAME = ?, YEAR = ?, PROFILE = ?, where ID = " + id;

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setString(3, entity.getYear2());
            statement.setString(4, entity.getProfile2());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id){
        String sql = "delete from student where ID = " + id;

        try(Connection con = DriverManager.getConnection(url, username, password)) {

            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
