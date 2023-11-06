package uz.sher.uzmobile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.sher.uzmobile.R
import uz.sher.uzmobile.databinding.NewsTitleBinding
import uz.sher.uzmobile.model.News


class NewsAdapter(val list: MutableList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: NewsTitleBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBInd(news: News) {
            binding.newsTitle.text = news.title.toString()
            binding.newsChildTitle.text = news.childTitle.toString()

            binding.root.setOnClickListener {
//                listener?.onClickItemListener(adapterPosition)
                val newsObj: News = list[adapterPosition]
                if (newsObj.isVSB == true) {
                    newsObj.isVSB = false
                    binding.newsChildTitle.visibility=View.VISIBLE
                    binding.newsIndicator.setImageResource(R.drawable.open_expandable_view)
                }else if(newsObj.isVSB==false){
                    newsObj.isVSB=true
                    binding.newsChildTitle.visibility=View.GONE
                    binding.newsIndicator.setImageResource(R.drawable.close_expandable_view)
                }


            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            NewsTitleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBInd(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


}