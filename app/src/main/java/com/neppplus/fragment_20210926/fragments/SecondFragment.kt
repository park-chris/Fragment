package com.neppplus.fragment_20210926.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20210926.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        secondLogBtn.setOnClickListener {

//            코드 적는 곳 (this) : 부품
//            토스트의 재료로 필요한것 ( ) : 화면 불러내려면?

//            Toast.makeText(activity, "두번째 프래그먼트", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(), "두번째 프래그먼트", Toast.LENGTH_SHORT).show()

        }
    }

}