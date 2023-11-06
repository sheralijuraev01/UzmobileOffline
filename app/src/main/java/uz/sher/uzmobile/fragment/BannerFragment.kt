package uz.sher.uzmobile.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.data.BannerData
import uz.sher.uzmobile.databinding.FragmentBannerBinding
import uz.sher.uzmobile.functions.Functions
import uz.sher.uzmobile.model.Banner

private const val ARG_PARAM1 = "param1"

class BannerFragment : Fragment(R.layout.fragment_banner) {
    private var _binding: FragmentBannerBinding? = null
    private val binding get() = _binding!!
    private var position: String? = null
    private lateinit var bannerObject:Banner
    private lateinit var bannerData: BannerData
    private  var list: MutableList<Banner> =ArrayList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBannerBinding.bind(view)
        Functions().toolbarGone(requireActivity() as MainActivity)

        arguments?.let {
            position = it.getString(ARG_PARAM1)
        }
        position?.let { initItem(it.toInt()) }


    }

    fun initItem(position: Int){
        bannerData= BannerData()
        list=bannerData.getBannerData()
        bannerObject=list[position]

        binding.bannerItemTitle.text=bannerObject.banner_item_title
        binding.bannerItemMin.text=bannerObject.banner_min_item
        binding.bannerItemNet.text=bannerObject.banner_net_item
        binding.bannerItemSms.text=bannerObject.banner_sms_item
        binding.bannerItemDesc.text=bannerObject.banner_item_describe
        binding.bannerTarifName.text=bannerObject.banner_title
        binding.bannerTarifPayment.text=bannerObject.banner_item_describe
        binding.bannerTarifDescribe.text=bannerObject.banner_describe
        binding.bannerTarifPayment.text=bannerObject.tarif_price


    binding.bannerBackPressButton.setOnClickListener {

        parentFragmentManager.beginTransaction().replace(R.id.fragment_container,HomeFragment()).commit()
        Functions().toolbarVisible(requireActivity() as MainActivity)
    }
    }



    companion object {
      fun newInstance(param1:String)=BannerFragment().apply {
        arguments=Bundle().apply {
           putString(ARG_PARAM1,param1)
        }
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