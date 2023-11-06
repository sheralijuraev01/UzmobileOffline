package uz.sher.uzmobile.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.BannerAdapter
import uz.sher.uzmobile.data.BannerData
import uz.sher.uzmobile.databinding.FragmentHomeBinding
import uz.sher.uzmobile.functions.Functions
import uz.sher.uzmobile.model.Banner


class HomeFragment : Fragment(uz.sher.uzmobile.R.layout.fragment_home),
    BannerAdapter.OnClikcListenerItem {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var list: MutableList<Banner> = ArrayList()
    private lateinit var bannerData: BannerData
    private lateinit var bannerAdapter: BannerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

        bannerData = BannerData()



        list.addAll(bannerData.getBannerData())
        Functions().toolbarVisible(requireActivity() as MainActivity)

        bannerAdapter = BannerAdapter(list)
        binding.bannerItem.adapter = bannerAdapter
        setUpIndicator()
        setActiveIndicators(0)

        binding.bannerItem.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setActiveIndicators(position)

            }

        })
        bannerAdapter.setOnClicklistener(this)



        binding.internetBanner.setOnClickListener {
            updateFragment(InternetFragment())

        }
        binding.smsFragment.setOnClickListener {
            updateFragment(SmsFragment())

        }
        binding.tarifFragment.setOnClickListener {
            updateFragment(TarifFragment())

        }
        binding.serviceFragment.setOnClickListener {
            updateFragment(ServiceFragment())

        }
        binding.ussdFragment.setOnClickListener {
            updateFragment(UssdCodeFragment())

        }
        binding.minutFragment.setOnClickListener {
            updateFragment(MinutFragment())

        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(uz.sher.uzmobile.R.layout.fragment_home, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    private fun updateFragment(fr: Fragment) {

        parentFragmentManager
            .beginTransaction()
            .replace(uz.sher.uzmobile.R.id.fragment_container, fr)
            .addToBackStack("HomeFragment")
            .commit()

    }

    private fun setUpIndicator() {
        val indicatorsSize =
            binding.root.context.resources.getDimension(uz.sher.uzmobile.R.dimen.banner_indicators_size)
                .toInt()
        val indicators = arrayOfNulls<ImageView>(bannerAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            indicatorsSize, indicatorsSize
        )
        layoutParams.setMargins(8, 0, 8, 0)
        for (i in indicators.indices) {
            indicators[i] = ImageView(requireContext())
            indicators[i]?.setImageDrawable(
                ContextCompat.getDrawable(
                    binding.root.context,
                    uz.sher.uzmobile.R.drawable.no_selected_banner
                )
            )
            indicators[i]?.layoutParams = layoutParams
            binding.bannerIndicators.addView(indicators[i])
        }
    }

    private fun setActiveIndicators(position: Int) {
        val childCount = binding.bannerIndicators.childCount
        for (i in 0 until childCount) {
            val indicator = binding.bannerIndicators.getChildAt(i) as ImageView
            if (i == position) {
                indicator.setImageDrawable(
                    ContextCompat.getDrawable(
                        binding.root.context,
                        uz.sher.uzmobile.R.drawable.selected_banner
                    )
                )

            } else {
                indicator.setImageDrawable(
                    ContextCompat.getDrawable(
                        binding.root.context,
                        uz.sher.uzmobile.R.drawable.no_selected_banner
                    )
                )
            }
        }
    }

    override fun OnclikcListener(position: Int) {
        parentFragmentManager.beginTransaction()
            .replace(
                uz.sher.uzmobile.R.id.fragment_container,
                BannerFragment.newInstance(position.toString())
            )
            .addToBackStack("HomeFragment").commit()

    }


}