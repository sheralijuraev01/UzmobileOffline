package uz.sher.uzmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.sher.uzmobile.model.*
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.ExpandableAdapter
import uz.sher.uzmobile.data.ExpandableData
import uz.sher.uzmobile.databinding.FragmentUssdCodeBinding
import uz.sher.uzmobile.functions.Functions


class UssdCodeFragment : Fragment(R.layout.fragment_ussd_code) {
    private var titleList: MutableList<ExpandableTitle> = ArrayList()
    private lateinit var dataList: ExpandableData
    private var childList: MutableList<MutableList<ExpandableChildTitle>> = ArrayList()
    private var _binding: FragmentUssdCodeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUssdCodeBinding.bind(view)

        dataList = ExpandableData()
        titleList.addAll(dataList.getUssdData())
        childList.addAll(dataList.getUssdChildData())

        val expandableAdapter = ExpandableAdapter(binding.root.context, titleList, childList)
        binding.ussdExpandableView.setGroupIndicator(null)
        binding.ussdExpandableView.setAdapter(expandableAdapter)
        Functions().toolbarGone(requireActivity() as MainActivity)

        binding.ussdBackPressButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            Functions().toolbarVisible(requireActivity() as MainActivity)
        }


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

}