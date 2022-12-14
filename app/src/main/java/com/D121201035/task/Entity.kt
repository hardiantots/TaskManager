package com.D121201035.task

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Task_Manager")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String
)