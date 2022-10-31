package com.franklin.jetpackdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

/**
 * 创建日期：2022/9/23 下午5:23
 * @author Franklin
 * 类说明：
 */
class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.register_layout, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener { p0 ->
            p0?.let {
                Navigation.findNavController(it)
                    .navigate(R.id.action_registerFragment_to_welcomeFragment)
            }
        }
        return view
    }

}