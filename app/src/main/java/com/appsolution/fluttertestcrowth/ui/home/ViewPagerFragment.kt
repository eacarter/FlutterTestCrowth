package com.appsolution.fluttertestcrowth.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.appsolution.fluttertestcrowth.R

class ViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_viewpager, container, false)

        val images = arrayOf(R.drawable.blm, R.drawable.pride, R.drawable.fourth);
        val text = arrayOf("Black Lives Matter", "PRIDE", "Celebrate the 4th")

        if(requireArguments().getInt(ARG_SECTION_NUMBER) == 1) {
            rootView.findViewById<ImageView>(R.id.imageView).setImageResource(images[0])
            rootView.findViewById<TextView>(R.id.home_viewpager_text).text = text[0]
        }
        if(requireArguments().getInt(ARG_SECTION_NUMBER) == 2) {
            rootView.findViewById<ImageView>(R.id.imageView).setImageResource(images[1])
            rootView.findViewById<TextView>(R.id.home_viewpager_text).text = text[1]
        }
        if(requireArguments().getInt(ARG_SECTION_NUMBER) == 3) {
            rootView.findViewById<ImageView>(R.id.imageView).setImageResource(images[2])
            rootView.findViewById<TextView>(R.id.home_viewpager_text).text = text[2]
        }
        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        fun newInstance(sectionNumber: Int): ViewPagerFragment {
            val fragment = ViewPagerFragment()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}