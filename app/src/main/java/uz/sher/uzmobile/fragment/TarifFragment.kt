package uz.sher.uzmobile.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.sher.uzmobile.model.*
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.ExpandableAdapter
import uz.sher.uzmobile.data.ExpandableData
import uz.sher.uzmobile.databinding.FragmentTarifBinding
import uz.sher.uzmobile.functions.Functions


class TarifFragment : Fragment(R.layout.fragment_tarif) {
    private var titleList:MutableList<ExpandableTitle> =ArrayList()
    private lateinit var dataList: ExpandableData
    private var childList:MutableList<MutableList<ExpandableChildTitle>> =ArrayList()
    private var _binding:FragmentTarifBinding?=null
    private val binding get()=_binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentTarifBinding.bind(view)

        dataList= ExpandableData()
        titleList.addAll(dataList.getTarifData())
        childList.addAll(dataList.getTarifChildData())
        val expandableAdapter=ExpandableAdapter(binding.root.context,titleList, childList)
        binding.tarifExpandableView.setGroupIndicator(null)
        binding.tarifExpandableView.setAdapter(expandableAdapter)
        Functions().toolbarGone(requireActivity() as MainActivity)

        binding.tarifBackPressButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            Functions().toolbarVisible(requireActivity() as MainActivity)

        }
        binding.smsCheckTraffic.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            val code:String="*555%23"
            dialIntent.data = Uri.parse("tel:$code")
            startActivity(dialIntent)
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
        _binding=null
    }
}