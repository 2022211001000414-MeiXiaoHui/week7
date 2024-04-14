package com.MeiXiaoHui.dao;

import com.MeiXiaoHui.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{

    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        //insert into usertable
        return false;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        //delete ..... where id=?
        return 0;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        //select --- where id?=--- write jdbc code
        return 0;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        //select --- where username ?= and password=?--- write jdbc code
        return null;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql="select id,username,password,email,gender,birthdate from usertable where username=? and password=? ";
        PreparedStatement st= con.prepareStatement(sql);
        st.setString(1,username);
        st.setString(2,password);
        ResultSet rs=st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setId(rs.getString("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBithDate(rs.getDate("birthdate"));

        }
        return user;
    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        //select --- where usernmae=? write jdbc code
        return null;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        //select --- where password=?--- write jdbc code
        return null;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        //select --- where email =?--- write jdbc code
        return null;
    }

    @Override
    public List<User> findByGender(Connection con, String gender) throws SQLException {
        //select --- where gender=?--- write jdbc code
        return null;
    }

    @Override
    public List<User> findByBirthdate(Connection con, Date birthDate) throws SQLException {
        //select --- where id=?=--- write jdbc code
        return null;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        //select *from usertable --- --- write jdbc code
        return null;
    }
}
