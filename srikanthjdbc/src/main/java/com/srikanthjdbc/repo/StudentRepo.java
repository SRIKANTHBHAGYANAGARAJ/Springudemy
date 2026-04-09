package com.srikanthjdbc.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.srikanthjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class StudentRepo{
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
@Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql="insert into student (rollNo,name,marks)values(?,?,?)";
int rows=jdbc.update(sql,s.getRollNo(s.getInt("rollno")),s.getMarks(rs.getString("name")),s.getName());
        System.out.println("rows");
    }

    public List<Student> findAll() {


//        List<Student> students=new ArrayList<>();
//        return students;
        String sql = "select * from student";
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks((rs.getInt("marks")));
                return s;
            }
        };
        return jdbc.query(sql, mapper);
    }
}



