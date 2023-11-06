package uz.sher.uzmobile.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.NewsAdapter
import uz.sher.uzmobile.data.FaqData
import uz.sher.uzmobile.data.NewsData
import uz.sher.uzmobile.databinding.FragmentFaqBinding
import uz.sher.uzmobile.functions.Functions
import uz.sher.uzmobile.model.News


class FaqFragment : Fragment(R.layout.fragment_faq) {

    private var _binding:FragmentFaqBinding?=null
    private val binding get() = _binding!!

    private val parentList:MutableList<News> =ArrayList()
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var faqData: FaqData

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentFaqBinding.bind(view)
        Functions().toolbarGone(requireActivity() as MainActivity)
        faqData= FaqData()
        parentList.addAll(faqData.getFaqTitleData())

        val layoutManager= LinearLayoutManager(binding.root.context)

        binding.faqRecyclerView.layoutManager=layoutManager
        newsAdapter= NewsAdapter(parentList)
        binding.faqRecyclerView.adapter=newsAdapter
        binding.moreQuestions.setOnClickListener {
            val url="https://uztelecom.uz/uz/jismoniy-shaxslarga/internet-2/foydali-axborot-2/savollar-va-javoblar-2"
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)

        }

        binding.faqBackPressButton.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container,HomeFragment()).commit()
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
        _binding=null
    }
}