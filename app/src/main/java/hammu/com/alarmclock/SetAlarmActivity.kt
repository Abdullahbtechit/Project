package hammu.com.alarmclock

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SetAlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_alarm)
    }

    companion object {


        fun newIntent(context: Context): Intent {
            val intent = Intent(context, SetAlarmActivity::class.java)
            return intent
        }
    }
}
