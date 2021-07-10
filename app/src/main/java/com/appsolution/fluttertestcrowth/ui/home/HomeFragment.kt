package com.appsolution.fluttertestcrowth.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.viewpager.widget.ViewPager
import com.appsolution.fluttertestcrowth.R
import com.appsolution.fluttertestcrowth.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private var viewpagerAdapter: ViewpagerAdapter? = null
    private var listAdapter: ListAdapter? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var num = arrayListOf<Int>(1,2,3,4,5)

        val horizontal = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,
        false)

        listAdapter = ListAdapter(num)
        _binding!!.homeRecycleview.adapter = listAdapter
        _binding!!.homeRecycleview.layoutManager = horizontal

        viewpagerAdapter = ViewpagerAdapter(childFragmentManager)
        _binding!!.homeViewpager.adapter = viewpagerAdapter

        _binding!!.homeClearSearch.setOnClickListener(View.OnClickListener {
            _binding!!.homeSearch.text?.clear();
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}