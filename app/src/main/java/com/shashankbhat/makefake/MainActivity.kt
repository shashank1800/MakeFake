package com.shashankbhat.makefake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.pm.PackageManager
import android.content.ComponentName
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whatsApp.setOnClickListener {
            val pm = packageManager
            pm.setComponentEnabledSetting(
                    ComponentName(this@MainActivity, "com.shashankbhat.makefake.MainActivity"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
            )

            pm.setComponentEnabledSetting(
                    ComponentName(this@MainActivity, "com.shashankbhat.makefake.Main2Activity"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }

        back.setOnClickListener {
            val pm = packageManager
            pm.setComponentEnabledSetting(
                    ComponentName(this@MainActivity, "com.shashankbhat.makefake.Main2Activity"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
            )

            pm.setComponentEnabledSetting(
                    ComponentName(this@MainActivity, "com.shashankbhat.makefake.MainActivity"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }


        /*var intent = Intent(this,Main2Activity::class.java)
        startActivity(intent)*/
    }
}
