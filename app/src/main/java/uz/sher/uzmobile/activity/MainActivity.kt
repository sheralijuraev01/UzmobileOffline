package uz.sher.uzmobile.activity


import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import uz.sher.uzmobile.R
import uz.sher.uzmobile.databinding.ActivityMainBinding
import uz.sher.uzmobile.fragment.FaqFragment
import uz.sher.uzmobile.fragment.HomeFragment
import uz.sher.uzmobile.fragment.NewsFragment
import uz.sher.uzmobile.functions.Functions

class MainActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFirtFragment()
        createDrawerMenu()
        binding.navigationMenu.setNavigationItemSelectedListener(this)
        navigationMenuSelected()

        binding.iconTelegram.setOnClickListener {
            val url="https://t.me/uztelecomuz"
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)

        }
        binding.iconShare.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
                val shareBody="Uzmobile dasturi"
            val shareSub="Siz ham ulanig judayam qulay"
            intent.putExtra(Intent.EXTRA_SUBJECT,shareBody)
            intent.putExtra(Intent.EXTRA_TEXT,shareSub)
            startActivity(Intent.createChooser(intent,"Share using"))
        }

    }

    fun setFirtFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment())
            .commit()
    }



    fun createDrawerMenu(){
        binding.bottomNavigation.menu.getItem(2).isChecked = true
        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, binding.toolbar,
            R.string.open, R.string.close
        )

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }
    fun navigationMenuSelected(){
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_balance -> {
                    checkBalance()
                }
                R.id.nav_operator -> {
                    callOperator()
                }
                R.id.nav_fab -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, HomeFragment()).commit()
                R.id.nav_notif -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, NewsFragment()).commit()
                R.id.nav_setting -> {
                    startActivity(Intent(this, SettingActivity::class.java))
                    finish()

                }
            }

            true
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_setting -> {
                startActivity(Intent(this, SettingActivity::class.java))
                finish()
            }
            R.id.nav_about -> appInfoDialog()
            R.id.nav_question -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FaqFragment()).commit()
            R.id.nav_apps -> attentionDialog()

            R.id.nav_exit -> Functions().exitDialog(this)

        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true

    }

   private fun checkBalance() {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        val code: String = "*100%23"
        dialIntent.data = Uri.parse("tel:$code")
        startActivity(dialIntent)
    }

    private fun callOperator() {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        val code: String = "1009"
        dialIntent.data = Uri.parse("tel:$code")
        startActivity(dialIntent)
    }

    @SuppressLint("ResourceAsColor")


    fun attentionDialog() {
        val view = layoutInflater.inflate(R.layout.back_press_dialog, null)
        val dialog: Dialog = Dialog(this)
        dialog.setContentView(view)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        val ok_btn = view.findViewById<TextView>(R.id.btn_yes)
        val no_btn = view.findViewById<TextView>(R.id.btn_no)
        val title = view.findViewById<TextView>(R.id.title_dialog)
        val title_desc = view.findViewById<TextView>(R.id.title_desc_dialog)
        val verticalView = view.findViewById<View>(R.id.vertical_view)
        ok_btn.text = getString(R.string.tushunarli)
        no_btn.visibility = View.GONE
        verticalView.visibility = View.GONE
        title.text = getString(R.string.attention)
        title_desc.text = "Tez orada dasturlarimiz \nhaqida ma'lumot qo'shiladi"
        ok_btn.setOnClickListener {
            dialog.dismiss()
            binding.bottomNavigation.menu.getItem(2).isChecked = true
        }

    }

    fun appInfoDialog() {
        val view = layoutInflater.inflate(R.layout.about_app, null)
        val dialog: Dialog = Dialog(this)
        dialog.setContentView(view)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        val btn_cancel = view.findViewById<ImageView>(R.id.cancel_btn)
        btn_cancel.setOnClickListener {
            dialog.dismiss()

        }

    }


    override fun onBackPressed() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment is Fragment) {
            Functions().exitDialog(this)
        } else super.onBackPressed()

    }
    }

