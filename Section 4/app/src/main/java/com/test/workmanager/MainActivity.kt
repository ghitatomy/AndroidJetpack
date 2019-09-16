package com.test.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.work.Constraints
import androidx.work.Data
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val workManager = WorkManager.getInstance()

        val powerConstraint = Constraints.Builder()
            .setRequiresBatteryNotLow(true)
            .build()

        val taskData = Data.Builder()
            .putString(MESSAGE_STATUS, "Message Sent Successfully")
            .build()

        val request = OneTimeWorkRequest.Builder(SendWorker::class.java)
            .setConstraints(powerConstraint)
            .setInputData(taskData)
            .build()

        bSend.setOnClickListener {
            workManager.enqueue(request)
        }

        workManager.getWorkInfoByIdLiveData(request.id).observe(this, Observer { workInfo ->
            workInfo?.let {
                val state = workInfo.state
                tvStatus.append(state.toString() + "\n")
            }
        })
    }

    companion object {
        const val MESSAGE_STATUS = "message_status"
    }
}
