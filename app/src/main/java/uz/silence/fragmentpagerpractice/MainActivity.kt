package uz.silence.fragmentpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import uz.silence.fragmentpagerpractice.Adapter.UserPagerAdapter
import uz.silence.fragmentpagerpractice.CLASS.User
import uz.silence.fragmentpagerpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    lateinit var userPagerAdapter: UserPagerAdapter
    lateinit var userList: ArrayList<User>
    lateinit var titleList: ArrayList<String>
    lateinit var handler:Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userList = ArrayList()

        for (i in 0 until 20) {

            userList.add(User("Billie Ellish", R.drawable.a))
            userList.add(User("Billie Ellish Boom", R.drawable.b))
            userList.add(User("Billie Ellish Boom", R.drawable.b))

        }



        titleList = ArrayList()

        for (i in 0 until 20) {
            titleList.add("Home")
            titleList.add("About us")
            titleList.add("Contact us")
        }

        userPagerAdapter = UserPagerAdapter(userList, titleList, supportFragmentManager)
        binding.viewPager.adapter = userPagerAdapter
        //binding.viewPager.setPageTransformer(true, RotateDownTransformer())
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        handler = Handler()

        handler.postDelayed(runnable,2000)

    }

    var runnable = object : Runnable {

        override fun run() {
            binding.viewPager.currentItem += 1
            handler.postDelayed(this,2000)
        }

    }



}