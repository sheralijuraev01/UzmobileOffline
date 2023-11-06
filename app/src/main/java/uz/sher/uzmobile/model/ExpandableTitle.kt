package uz.sher.uzmobile.model

data class ExpandableTitle(
    val text_image: String,
    val text_title: String,
    val text_describe: String,
    val image:Int,
    val isImage :Boolean
    )
data class ExpandableChildTitle(val buttonName:String)
