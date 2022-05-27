package com.example.catalog.DB;


import com.example.catalog.Model.Student;
import com.example.catalog.Model.Professor;
import com.example.catalog.Model.Subject;


import java.sql.*;

    public class DBManager {
        private Professor Student;

        private Connection getConnection() {
            try {
                return DriverManager.getConnection("jdbc:mysql://localhost:3325/catalog_pao", "root", "pao");
            } catch (SQLException throwables) {
                throw new RuntimeException("No access to db!");
            }
        }



        public void AdaugamProfessor(Professor professor){
            try (Connection connection = getConnection()) {
                String query = "INSERT into professor(ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmnt = connection.prepareStatement(query);
                stmnt.setInt(1, professor.getId());
                stmnt.setString(2, professor.getFirstName());
                stmnt.setString(3, professor.getLastName());
                stmnt.setInt(5, professor.getPhone_number());
                stmnt.setString(4, professor.getEmail());

                stmnt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void UpdateProfessor(Professor profesor){
            try (Connection connection = this.getConnection()) {
                String query = "UPDATE professor SET FIRST_NAME = ?, LAST_NAME = ?, PHONE_NUMBER = ?, EMAIL = ? WHERE profesorID = ?;";
                PreparedStatement stmnt = connection.prepareStatement(query);
                stmnt.setInt(1, Professor.getId());
                stmnt.setString(2, Professor.getFirstName());
                stmnt.setString(3, Professor.getLastName());
                stmnt.setInt(5, Professor.getPhone_number());
                stmnt.setString(4, Professor.getEmail());;
                stmnt.executeUpdate();

                System.out.println("Success!");

            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void AdaugamStudent(Student student){
            try (Connection connection = getConnection()) {
                String query = "INSERT into student(ID, FIRST_NAME, LAST_NAME, YEAR, PROFILE) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmnt = connection.prepareStatement(query);
                stmnt.setInt(1, Student.getId());
                stmnt.setString(2, Student.getFirstName());
                stmnt.setString(3, Student.getLastName());
                stmnt.setString(5, Student.getYear());
                stmnt.setString(4, Student.getProfile());

                stmnt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void UpdateStudent(Student student){
            try (Connection connection = this.getConnection()) {
                String query = "UPDATE student SET FIRST_NAME = ?, LAST_NAME = ?, YEAR = ?, PROFILE = ? WHERE studentID = ?;";
                PreparedStatement stmnt = connection.prepareStatement(query);
                stmnt.setInt(1, Student.getId());
                stmnt.setString(2, Student.getFirstName());
                stmnt.setString(3, Student.getLastName());
                stmnt.setInt(5, Student.getYear());
                stmnt.setString(4, Student.getProfile());;
                stmnt.executeUpdate();

                System.out.println("Success!");

            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void AdaugamSubject(Subject subject){
            try (Connection connection = getConnection()) {
                String query = "INSERT into subject(ID, NAME, YEAR) VALUES (?, ?, ?)";
                PreparedStatement stmnt = connection.prepareStatement(query);
                stmnt.setInt(1, subject.getId());
                stmnt.setString(2, subject.getName());
                stmnt.setString(3, subject.getAn());

                stmnt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void UpdateSubject(Subject subject){
            try (Connection connection = this.getConnection()) {
                String query = "UPDATE subject SET NAME = ?, YEAR = ? WHERE subjectID = ?;";
                PreparedStatement stmnt = connection.prepareStatement(query);
                stmnt.setInt(1, subject.getId());
                stmnt.setString(2, subject.getName());
                stmnt.setString(3, subject.getAn());
                stmnt.executeUpdate();

                System.out.println("Success!");

            }catch (SQLException e) {
                e.printStackTrace();
            }
        }




}
