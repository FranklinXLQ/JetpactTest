package com.franklin.jetpackdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

/**
 * 创建日期：2022/9/23 下午5:17
 * @author Franklin
 * 类说明：
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.welcome_layout, container, false)
        root.findViewById<Button>(R.id.button).setOnClickListener { p0 ->
            p0?.let {
                Navigation.findNavController(p0)
                    .navigate(R.id.action_welcomeFragment_to_loginFragment)
            }
        }
        return root
    }


}