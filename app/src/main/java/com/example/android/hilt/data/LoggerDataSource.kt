package com.example.android.hilt.data

/**
 * Created by PR72510 on 21/7/20.
 */
interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}