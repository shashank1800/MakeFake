package com.shashankbhat.makefake

import android.content.ComponentName
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        defualt.setOnClickListener {
            val pm = packageManager
            pm.setComponentEnabledSetting(
                    ComponentName(this@HomeActivity, "com.shashankbhat.makefake.MainActivity"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }

        facebook.setOnClickListener {
            val pm = packageManager
            disableAll()
            pm.setComponentEnabledSetting(
                    ComponentName(this@HomeActivity, "com.shashankbhat.makefake.Facebook"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }
        instagram.setOnClickListener {
            val pm = packageManager
            disableAll()
            pm.setComponentEnabledSetting(
                    ComponentName(this@HomeActivity, "com.shashankbhat.makefake.Instagram"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }
        whatsApp.setOnClickListener {
            val pm = packageManager
            disableAll()
            pm.setComponentEnabledSetting(
                    ComponentName(this@HomeActivity, "com.shashankbhat.makefake.WhatsApp"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }
        snapchat.setOnClickListener {
            val pm = packageManager
            disableAll()
            pm.setComponentEnabledSetting(
                    ComponentName(this@HomeActivity, "com.shashankbhat.makefake.Snapchat"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
            )
        }
    }

    private fun disableAll() {
        val pm = packageManager
        pm.setComponentEnabledSetting(
                ComponentName(this@HomeActivity, "com.shashankbhat.makefake.MainActivity"),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        )
        pm.setComponentEnabledSetting(
                ComponentName(this@HomeActivity, "com.shashankbhat.makefake.WhatsApp"),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        )

        pm.setComponentEnabledSetting(
                ComponentName(this@HomeActivity, "com.shashankbhat.makefake.Facebook"),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        )

        pm.setComponentEnabledSetting(
                ComponentName(this@HomeActivity, "com.shashankbhat.makefake.Snapchat"),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        )

        pm.setComponentEnabledSetting(
                ComponentName(this@HomeActivity, "com.shashankbhat.makefake.Instagram"),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        )
    }

}
