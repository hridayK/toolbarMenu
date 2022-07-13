package com.example.toolbarimplement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.favourites_menu -> {
                Toast.makeText(this, "Favourites", Toast.LENGTH_SHORT).show()
            }
            R.id.add_menu -> {
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show()
            }
            R.id.settings_menu -> {
                Toast.makeText(this, "Settings",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}