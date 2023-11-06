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
import uz.sher.uzmobile.model.*

import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.ExpandableAdapter
import uz.sher.uzmobile.data.ExpandableData
import uz.sher.uzmobile.databinding.FragmentSmsBinding
import uz.sher.uzmobile.functions.Functions


class SmsFragment : Fragment(R.layout.fragment_sms), View.OnClickListener {
    private var titleList: MutableList<ExpandableTitle> = ArrayList()
    private lateinit var dataList: ExpandableData
    private var childList: MutableList<MutableList<ExpandableChildTitle>> = ArrayList()
    private var _binding: FragmentSmsBinding? = null
    private val binding get() = _binding!!
    private lateinit var expandableAdapter: ExpandableAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSmsBinding.bind(view)

        dataList = ExpandableData()
        initFunctionsSms()
        Functions().toolbarGone(requireActivity() as MainActivity)
        binding.smsBackPressButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            Functions().toolbarVisible(requireActivity() as MainActivity)

        }




        binding.smsExpandableView.setGroupIndicator(null)
        binding.smsCheckTraffic.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            val code:String="*107%23"
            dialIntent.data = Uri.parse("tel:$code")
            startActivity(dialIntent)
        }

        binding.smsDailyButton.setOnClickListener(this)
        binding.smsWeeklyButton.setOnClickListener(this)
        binding.smsMonthlyButton.setOnClickListener(this)


    }

    private fun initFunctionsSms() {
        changeStatusSmsTabLayout(0)
        setSmsData("0")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(v: View?) {
        val button = v as Button
        val tag = button.getTag().toString()
        setSmsData(tag)
        changeStatusSmsTabLayout(tag.toInt())

    }


    private fun setSmsData(tag: String) {
        titleList.clear()
        childList.clear()
        when (tag) {
            "0" -> {
                titleList.addAll(dataList.getSmsDailyData())
                childList.addAll(dataList.getSmsChildDailyData())

            }
            "1" -> {
                titleList.addAll(dataList.getSmsWeeklyData())
                childList.addAll(dataList.getInternetChildWeeklyData())
            }
            "2" -> {
                titleList.addAll(dataList.getSmsMonthlyData())
                childList.addAll(dataList.getSmsChildMonthlyData())
            }
        }

        expandableAdapter = ExpandableAdapter(requireContext(), titleList, childList)
        binding.smsExpandableView.setAdapter(expandableAdapter)
    }

    private fun changeStatusSmsTabLayout(index: Int) {
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

    fun checkBalance(){

    }


}