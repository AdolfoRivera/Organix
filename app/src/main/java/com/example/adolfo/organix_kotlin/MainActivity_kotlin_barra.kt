package com.example.adolfo.organix_kotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main_kotlin_barra.*
import kotlinx.android.synthetic.main.app_bar_main_activity_kotlin_barra.*

class MainActivity_kotlin_barra : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin_barra)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_activity_kotlin_barra, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_tomar_nota -> {
                // Handle the camera action
                val siguiente = Intent(this, tomar_foto::class.java)
                startActivity(siguiente)
            }
            R.id.nav_resumen -> {
                val siguiente1 = Intent(this, resumen::class.java)
                startActivity(siguiente1)
            }
            R.id.nav_agenda -> {
                val siguiente2 = Intent(this, agenda::class.java)
                startActivity(siguiente2)
            }
            R.id.nav_calendario -> {
                val siguiente3 = Intent(this, calendario::class.java)
                startActivity(siguiente3)
            }
            R.id.nav_notificaciones -> {
                val siguiente4 = Intent(this, notificaciones::class.java)
                startActivity(siguiente4)
            }
            R.id.nav_sin_cumplir -> {
                val siguiente5 = Intent(this, sin_cumplir::class.java)
                startActivity(siguiente5)
            }
            R.id.nav_share -> {
            }
            R.id.nav_send -> {
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
