package uz.sher.uzmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.sher.uzmobile.model.ExpandableChildTitle
import uz.sher.uzmobile.data.ExpandableData

import uz.sher.uzmobile.model.ExpandableTitle
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.ExpandableAdapter
import uz.sher.uzmobile.databinding.FragmentServiceBinding

import uz.sher.uzmobile.functions.Functions


class ServiceFragment : Fragment(R.layout.fragment_service) {
    private var titleList: MutableList<ExpandableTitle> = ArrayList()
    private lateinit var dataList: ExpandableData
    private var childList: MutableList<MutableList<ExpandableChildTitle>> = ArrayList()
    private var _binding: FragmentServiceBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentServiceBinding.bind(view)
        dataList = ExpandableData()
        titleList.addAll(dataList.getServiceData())
        childList.addAll(dataList.getServiceChildData())
        val expandableAdapter = ExpandableAdapter(binding.root.context, titleList, childList)
        binding.serviceExpandableView.setGroupIndicator(null)
        binding.serviceExpandableView.setAdapter(expandableAdapter)
        Functions().toolbarGone(requireActivity() as MainActivity)

        binding.serviceBackPressButton.setOnClickListener {
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