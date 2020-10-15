package com.dinesh.todoistapplication.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoistDatabaseDao {

    @Insert
    fun insert(detail: Todoist)

    @Update
    fun update(detail: Todoist)

    @Query("SELECT * from daily_details_table WHERE detailId = :key")
    fun get(key: Long): Todoist?

    @Query("DELETE FROM daily_details_table")
    fun clear()

    @Query("SELECT * FROM daily_details_table ORDER BY detailId DESC")
    fun getAllDetails(): LiveData<List<Todoist>>

    @Query("SELECT * FROM daily_details_table ORDER BY detailId DESC LIMIT 1")
    fun getTodoistDetails(): Todoist?

    @Query("SELECT * from daily_details_table WHERE detailId= :key")
    fun getTodoistDeatilsWithId(key: Long): LiveData<Todoist>

}
