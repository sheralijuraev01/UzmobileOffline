package uz.sher.uzmobile.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity
import uz.sher.uzmobile.adapters.NewsAdapter
import uz.sher.uzmobile.data.NewsData

import uz.sher.uzmobile.databinding.FragmentNewsBinding
import uz.sher.uzmobile.functions.Functions
import uz.sher.uzmobile.model.News


class NewsFragment : Fragment(R.layout.fragment_news)

{
    private var _binding:FragmentNewsBinding?=null
    private val binding  get() = _binding!!
    private val parentList:MutableList<News> =ArrayList()
    private lateinit var newsAdapter: NewsAdapter

    private lateinit var newsData: NewsData
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentNewsBinding.bind(view)

        Functions().toolbarGone(requireActivity() as MainActivity)
        newsData= NewsData()
        parentList.addAll(newsData.getTitleData())

        val layoutManager=LinearLayoutManager(binding.root.context)

        binding.newsRecyclerView.layoutManager=layoutManager
        newsAdapter=NewsAdapter(parentList)
        binding.newsRecyclerView.adapter=newsAdapter

        binding.moreNews.setOnClickListener {
            val url="https://uztelecom.uz/uz/yangiliklar"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)

        }
        binding.newsBackPressButton.setOnClickListener {
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