package com.example.repository.entitis

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Notes")
data class Notes(

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "subTitle")
    var subTitle: String,

    @ColumnInfo(name = "dateTime")
    var dateTime: String,

    @ColumnInfo(name = "noteText")
    var noteText: String,

    @ColumnInfo(name = "imagePath")
    var imagePath: String,

    @ColumnInfo(name = "webLink")
    var webLink: String,

    @ColumnInfo(name = "color")
    var color: String,
) {
    override fun toString(): String {
        return "$title : $dateTime"
    }
}
