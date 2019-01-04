package at.fh.swengb.collectionsandrecyclerview

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_student_database.*
import kotlinx.android.synthetic.main.activity_user_data.*

class UserDataActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)


    }

    fun save (view: View) {
        val sharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE)
        sharedPreferences.edit().putString("name", t_age.toString()).apply()
        sharedPreferences.edit().putInt("age", t_age.text.toString().toInt()).apply()

        val savedString = sharedPreferences.getString("name", t_age.toString())
        val savedInt = sharedPreferences.getInt("age", t_age.text.toString().toInt())


    }



}

