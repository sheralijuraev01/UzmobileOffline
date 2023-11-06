package uz.sher.uzmobile.functions

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.sher.uzmobile.R
import uz.sher.uzmobile.activity.MainActivity

class Functions {
    fun toolbarGone(context: MainActivity) {
        val toolbar = (context).findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val dwLayout = (context).findViewById<DrawerLayout>(R.id.drawer_layout)

        dwLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

        toolbar.visibility = View.GONE
    }

    fun toolbarVisible(context: MainActivity) {
        val toolbar = (context).findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val dwLayout = (context).findViewById<DrawerLayout>(R.id.drawer_layout)
        val condition = (context).findViewById<BottomNavigationView>(R.id.bottom_navigation)
        condition.menu.getItem(2).isChecked = true
        dwLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        toolbar.visibility = View.VISIBLE
    }

    fun exitDialog(context: Context) {

        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.back_press_dialog, null)


        val dialog: Dialog = Dialog(context)
        dialog.setContentView(view)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog.setCanceledOnTouchOutside(false)
        dialog.show()

        val yes_btn = view.findViewById<TextView>(R.id.btn_yes)
        val no_btn = view.findViewById<TextView>(R.id.btn_no)

        yes_btn.setOnClickListener {
            (context as Activity).finish()
        }
        no_btn.setOnClickListener {
            dialog.dismiss()
        }

    }


}