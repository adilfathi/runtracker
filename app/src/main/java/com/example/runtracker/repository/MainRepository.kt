package com.example.runtracker.repository

import com.example.runtracker.db.Run
import com.example.runtracker.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)
    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunsSortedByDate()
    fun getAllRunSortedByDistance() = runDao.getAllRunsSortedByDistance()
    fun getAllRunSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()
    fun getAllRunSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()
    fun getAllRunSortedByAvgCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getCompleteAvgSpeed() = runDao.getTotalAvgSpeed()
    fun getTotalDistance() = runDao.getTotalDistance()
    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()
    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

}