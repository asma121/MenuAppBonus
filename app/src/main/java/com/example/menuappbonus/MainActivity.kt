package com.example.menuappbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                val intent = Intent(this,MainActivity2::class.java)
                 startActivity(intent)
                return true
            }
            R.id.item2 -> {
                val intent2=Intent(this,MainActivity3::class.java)
                startActivity(intent2)
                return true
            }
            R.id.item3 -> {
                val intent3=Intent(this,MainActivity4::class.java)
                startActivity(intent3)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}