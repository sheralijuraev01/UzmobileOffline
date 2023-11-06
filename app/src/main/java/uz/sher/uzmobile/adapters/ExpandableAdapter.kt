package uz.sher.uzmobile.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.isInvisible
import uz.sher.uzmobile.R
import uz.sher.uzmobile.model.ExpandableChildTitle
import uz.sher.uzmobile.model.ExpandableTitle

class ExpandableAdapter(
    val context: Context,
    val titleList: MutableList<ExpandableTitle>,
    val childList: MutableList<MutableList<ExpandableChildTitle>>,
) : BaseExpandableListAdapter() {

    private lateinit var bottom: View
    private lateinit var expandable_indicator: ImageView


    override fun getGroupCount(): Int {
        return titleList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return childList[groupPosition].size
    }

    override fun getGroup(groupPosition: Int): Any {
        return titleList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return childList[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var view = convertView
        if (view == null) {
            val inflater: LayoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.expandable_title_layout, null)
        }

        val text_image = view?.findViewById<TextView>(R.id.image_text)
        val title = view?.findViewById<TextView>(R.id.title_name)
        val describe_text = view?.findViewById<TextView>(R.id.describe_text)
        val image = view?.findViewById<ImageView>(R.id.image_icon)
        bottom = view?.findViewById<View>(R.id.bottom_leniar)!!
        expandable_indicator = view.findViewById<ImageView>(R.id.expandable_indicator)!!
        if (bottom.isInvisible) {
            expandable_indicator.setImageResource(R.drawable.close_expandable_view)
            bottom.visibility = View.VISIBLE
        }
        if (titleList[groupPosition].isImage) {
            image?.visibility = View.VISIBLE
            text_image?.visibility = View.INVISIBLE
//            image?.setImageResource(R.drawable.check_status)
//            image?.setBackgroundResource(R.drawable.expandable_item_icon_background)
        } else {
            image?.visibility = View.INVISIBLE
            text_image?.visibility = View.VISIBLE
            text_image!!.text = titleList[groupPosition].text_image
        }

        title!!.text = titleList[groupPosition].text_title
        describe_text!!.text = titleList[groupPosition].text_describe.toString()

        return view
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var view = convertView
        if (view == null) {
            val inflater: LayoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.expandable_child_layout, null)
        }

        val button = view?.findViewById<Button>(R.id.connect_button)

        button!!.text = childList[groupPosition][childPosition].buttonName

        button.setOnClickListener {
            Toast.makeText(context,titleList[groupPosition].text_title+" ulanayabdi",Toast.LENGTH_SHORT).show()
        }

        expandable_indicator.setImageResource(R.drawable.open_expandable_view)
        bottom.visibility = View.INVISIBLE

        return view!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }


}


