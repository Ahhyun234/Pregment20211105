package com.nepplus.pregment20211105.pragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nepplus.pregment20211105.R

class FirstFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fregment_first,container,false)



        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)

            Toast.makeText(requireContext(), "프레그면트 토스트", Toast.LENGTH_SHORT).show()
        }

        }
    }


}