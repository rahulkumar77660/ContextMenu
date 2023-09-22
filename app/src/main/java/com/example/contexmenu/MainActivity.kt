package com.example.contexmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listColor = findViewById<ListView>(R.id.list) as ListView
        val Color = arrayOf("Red","Black","Yellow","pink","Blue","Green","Orange","white","Violet",
                                "Red","Black","Yellow","pink","Blue","Green","Orange","white","Violet")
        val ColorAdap:ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,Color)
        listColor.adapter = ColorAdap
        registerForContextMenu(listColor)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.setHeaderTitle("Select below option")
        menu.add(0,v!!.id,0,"item1")
        menu.add(0,v.id,0,"item2")
        menu.add(0,v.id,0,"item3")
        menu.add(0,v.id,0,"item4")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item!!.title == "item 1") {
            Toast.makeText(this@MainActivity, "item 1 was Selected", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "item 2") {
            Toast.makeText(this@MainActivity, "item 2 was Selected", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "item 3") {
            Toast.makeText(this@MainActivity, "item 3 was Selected", Toast.LENGTH_SHORT).show()
        }
        else {

            Toast.makeText(this@MainActivity, "item 4 was Selected", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}