package uz.silence.fragmentpagerpractice.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import uz.silence.fragmentpagerpractice.CLASS.User
import uz.silence.fragmentpagerpractice.SecondFragment
import uz.silence.fragmentpagerpractice.UserFragment

class UserPagerAdapter(
    var userList: ArrayList<User>,
    var titleList: ArrayList<String>,
    fragmentManager: FragmentManager
) :
    FragmentStatePagerAdapter(
        fragmentManager,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
    override fun getCount(): Int {
        return userList.size
    }

    override fun getItem(position: Int): Fragment {

        return if (position == 0) {
            SecondFragment()
        } else {
            UserFragment.newInstance(userList[position])
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

}