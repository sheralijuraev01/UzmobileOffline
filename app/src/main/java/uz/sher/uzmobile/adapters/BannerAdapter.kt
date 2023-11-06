package uz.sher.uzmobile.adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.sher.uzmobile.model.Banner
import uz.sher.uzmobile.databinding.BannerItemBinding
class BannerAdapter(private val list: MutableList<Banner>):RecyclerView.Adapter<BannerAdapter.ViewHolder> (){
      private   var  litener: OnClikcListenerItem?=null
    inner class ViewHolder(private  val binding:BannerItemBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(banner: Banner){
            binding.bannerItemTitle.text=banner.banner_item_title
            binding.bannerItemMin.text=banner.banner_min_item
            binding.bannerItemNet.text=banner.banner_net_item
            binding.bannerItemSms.text=banner.banner_sms_item
            binding.bannerItemDesc.text=banner.banner_item_describe

            binding.root.setOnClickListener{
                if(adapterPosition!=RecyclerView.NO_POSITION){
                    litener?.OnclikcListener(adapterPosition)
                }

            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(BannerItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
         return list.size
    }

    fun setOnClicklistener(listenerItem: OnClikcListenerItem){
        this.litener=listenerItem
    }
    interface  OnClikcListenerItem{
        fun  OnclikcListener(position: Int)
    }
}