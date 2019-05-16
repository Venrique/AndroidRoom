package com.venrique.roomwordssample.data

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.venrique.roomwordssample.dao.WordDao
import com.venrique.roomwordssample.models.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}