package uz.sher.uzmobile.fragment


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.get
import androidx.fragment.app.Fragment
import uz.sher.uzmobile.model.*
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.ExpandableAdapter
import uz.sher.uzmobile.data.ExpandableData
import uz.sher.uzmobile.databinding.FragmentInternetBinding
import uz.sher.uzmobile.functions.Functions


class InternetFragment : Fragment(R.layout.fragment_internet), View.OnClickListener {
    private var titleList: MutableList<ExpandableTitle> = ArrayList()
    private lateinit var dataList: ExpandableData
    private var childList: MutableList<MutableList<ExpandableChildTitle>> = ArrayList()
    private var _binding: FragmentInternetBinding? = null
    private val binding get() = _binding!!

    private lateinit var expandableAdapter: ExpandableAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInternetBinding.bind(view)
        dataList = ExpandableData()

        initFunctionsInternet()



        binding.internetBackPressButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            Functions().toolbarVisible(requireActivity() as MainActivity)


        }

        binding.internetExpandableView.setGroupIndicator(null)

        binding.internetDailyButton.setOnClickListener(this)
        binding.internetWeeklyButton.setOnClickListener(this)
        binding.internetMonthlyButton.setOnClickListener(this)
        binding.internetCheckTraffic.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            val code:String="*107%23"
            dialIntent.data = Uri.parse("tel:$code")
            startActivity(dialIntent)
        }


    }

    private fun initFunctionsInternet() {
        Functions().toolbarGone(requireActivity() as MainActivity)
        changeStatusInternetTabLayout(0)
        setInternetData("0")
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
        setInternetData(tag)
        changeStatusInternetTabLayout(tag.toInt())
    }


    private fun setInternetData(tag: String) {
        titleList.clear()
        childList.clear()
        when (tag) {
            "0" -> {
                titleList.addAll(dataList.getInternetDailyData())
                childList.addAll(dataList.getInternetChildDailyData())

            }
            "1" -> {
                titleList.addAll(dataList.getInternetWeeklyData())
                childList.addAll(dataList.getInternetChildWeeklyData())
            }
            "2" -> {
                titleList.addAll(dataList.getInternetMonthlyData())
                childList.addAll(dataList.getInternetChildMonthlyData())
            }
        }

        expandableAdapter = ExpandableAdapter(requireContext(), titleList, childList)
        binding.internetExpandableView.setAdapter(expandableAdapter)
    }

    private fun changeStatusInternetTabLayout(index: Int) {
        val view=binding.containerButton as LinearLayout
        for (i in 0 until 3) {
            val button1 = view.get(i) as Button
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