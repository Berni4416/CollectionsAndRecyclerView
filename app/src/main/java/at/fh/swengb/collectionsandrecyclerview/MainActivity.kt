package at.fh.swengb.collectionsandrecyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.stream.Collectors.toList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)

        val list = listOf<Student>(Student("Rob", 27), Student("George", 27), Student("Lisa", 25),Student("Rob", 27),Student("Rob", 27))
        Log.d("TEST",list[2].name)

        Log.d("TEST","_______________")
        val mlist = mutableListOf<Student>(Student("Rob", 27), Student("George", 27), Student("Lisa", 25), Student("George", 27))
        mlist[3]=Student("hugo",33)
        Log.d("TEST",mlist[3].name)
        Log.d("TEST","_______________")
        mlist.add(Student("sigi",22))
        for (eintrag in mlist)
        {
            Log.d("TEST",eintrag.name)
        }

        Log.d("TEST","_______________")

        val set = setOf<Student>(Student("Rob", 27), Student("Rob", 27), Student("Lisa", 25),Student("Rob", 27),Student("Sigi", 27))
        for (eintrag in set)
        {
            Log.d("TEST",eintrag.name)
        }
        Log.d("TEST","_______________")
        val mset = mutableSetOf<Student>(Student("Rob", 27), Student("Rob", 27), Student("Lisa", 25))
        mset.add(Student("Rob", 27))

        for (eintrag in mset)
        {
            Log.d("TEST",eintrag.name)
        }
        Log.d("TEST","_______________")
        for (eintrag in mset)
        {
            Log.d("TEST",eintrag.name)
        }
        Log.d("TEST","_______________")
        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

        for ((key, value) in studentMap)
        {
            Log.d("TEST",key)
            for (eintrag in value)
            {
                Log.d("TEST",eintrag.name)
            }
        }
        val intent = Intent(this, StudentDatabase::class.java)
        startActivity(intent)


    }
}
