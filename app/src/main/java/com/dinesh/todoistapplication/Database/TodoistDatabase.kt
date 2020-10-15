package com.dinesh.todoistapplication.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Todoist::class], version = 1, exportSchema = false)
abstract class TodoistDatabase : RoomDatabase() {

    abstract val TodayDatabseDao: TodoistDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: TodoistDatabase? = null

        fun getInstance(context: Context): TodoistDatabase {

            synchronized(this) {

                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TodoistDatabase::class.java,
                        "Todoist_detail_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }

    }
}
