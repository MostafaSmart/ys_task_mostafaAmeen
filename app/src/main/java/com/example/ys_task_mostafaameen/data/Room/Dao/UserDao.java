package com.example.ys_task_mostafaameen.data.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import com.example.ys_task_mostafaameen.data.Room.Entity.UserDataRoom;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insertUser(UserDataRoom user);

    @Query("SELECT * FROM user_data WHERE userId = :userId LIMIT 1")
    UserDataRoom getUserById(String userId);

    @Query("SELECT * FROM user_data")
    List<UserDataRoom> getAllUsers();

    @Query("DELETE FROM user_data")
    void deleteAllUsers();
}
