package uz.sher.uzmobile.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.get
import androidx.fragment.app.Fragment
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.ExpandableAdapter
import uz.sher.uzmobile.data.ExpandableData
import uz.sher.uzmobile.databinding.FragmentBannerBinding
import uz.sher.uzmobile.databinding.FragmentInternetBinding
import uz.sher.uzmobile.databinding.FragmentMinutBinding
import uz.sher.uzmobile.functions.Functions
import uz.sher.uzmobile.model.ExpandableChildTitle
import uz.sher.uzmobile.model.ExpandableTitle


class MinutFragment : Fragment(R.layout.fragment_minut),View.OnClickListener {
    private var _binding: FragmentMinutBinding? = null
    private val binding get() = _binding!!
    private var titleList: MutableList<ExpandableTitle> = ArrayList()
    private lateinit var dataList: ExpandableData
    private var childList: MutableList<MutableList<ExpandableChildTitle>> = ArrayList()
    private lateinit var expandableAdapter: ExpandableAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentMinutBinding.bind(view)
        dataList = ExpandableData()
        initFunctionsInternet()

        binding.minutBackPressButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            Functions().toolbarVisible(requireActivity() as MainActivity)


        }

        binding.minutExpandableView.setGroupIndicator(null)

        binding.minutDailyButton.setOnClickListener(this)
        binding.minutWeeklyButton.setOnClickListener(this)
        binding.minutMonthlyButton.setOnClickListener(this)
        binding.minutCheckTraffic.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            val code:String="*107%23"
            dialIntent.data = Uri.parse("tel:$code")
            startActivity(dialIntent)
        }



    }

    private fun initFunctionsInternet() {
        Functions().toolbarGone(requireActivity() as MainActivity)
        changeStatusMinutTabLayout(0)
        setMinutData("0")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_minut, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

    override fun onClick(v: View?) {
        val button = v as Button
        val tag = button.getTag().toString()
        setMinutData(tag)
        changeStatusMinutTabLayout(tag.toInt())
    }
    private fun setMinutData(tag: String) {
        titleList.clear()
        childList.clear()
        when (tag) {
            "0" -> {
                titleList.addAll(dataList.getMinutDailyData())
                childList.addAll(dataList.getMinutChildDailyData())

            }
            "1" -> {
                titleList.addAll(dataList.getMinutWeeklyData())
                childList.addAll(dataList.getMinutChildWeeklyData())
            }
            "2" -> {
                titleList.addAll(dataList.getMinutMonthlyData())
                childList.addAll(dataList.getMinutChildMonthlyData())
            }
        }

        expandableAdapter = ExpandableAdapter(requireContext(), titleList, childList)
        binding.minutExpandableView.setAdapter(expandableAdapter)
    }

    private fun changeStatusMinutTabLayout(index: Int) {
        for (i in 0 until 3) {
            val button1 = binding.containerButton.get(i) as Button
            if (i == index) {
                button1.setBackgroundResource(R.drawable.selected_item_background)
                button1.setTextColor(resources.getColor(R.color.Main_color))
            } else {
                button1.setBackgroundResource(R.drawable.no_selected_item_background)
                button1.setTextColor(resources.getColor(R.color.white))
            }
        }
    }

}