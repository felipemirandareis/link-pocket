package com.linkpocket.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.linkpocket.entity.PreviewEntity

@Dao
interface PreviewDao {

    @Insert
    fun addAll(vararg previews: PreviewEntity)

    @Delete
    fun delete(preview: PreviewEntity)

    @Update
    fun update(preview: PreviewEntity)

    @Query("SELECT * FROM preview")
    fun getAll(): List<PreviewEntity>
}