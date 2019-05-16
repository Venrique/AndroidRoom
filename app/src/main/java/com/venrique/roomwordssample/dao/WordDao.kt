package com.venrique.roomwordssample.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.venrique.roomwordssample.models.Word

@Dao
interface WordDao {

    @Insert
    suspend fun insert(word: Word)

    @Query("DELETE from word_table")
    fun deleteAll()

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>
}