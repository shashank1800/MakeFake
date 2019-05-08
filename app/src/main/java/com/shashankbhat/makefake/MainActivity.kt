package com.shashankbhat.makefake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Something went wrong")
        builder.setPositiveButton("Close") { _,_ ->finish() }
        builder.setNegativeButton("Wait") { _, _ -> }
        builder.show()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.report->{
                val intent = Intent(this@MainActivity,HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        return true
    }
}
