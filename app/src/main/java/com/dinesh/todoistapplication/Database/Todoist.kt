package com.dinesh.todoistapplication.Database

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_details_table")
data class Todoist @RequiresApi(Build.VERSION_CODES.O) constructor(
    @PrimaryKey(autoGenerate = true)
    var detailId: Long = 0L,
    @ColumnInfo(name = "name")
    var name:String=""
) {

}
