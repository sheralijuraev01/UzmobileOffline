package uz.sher.uzmobile.activity

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import uz.sher.uzmobile.databinding.ActivitySettingBinding
import uz.sher.uzmobile.functions.Functions

class SettingActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        spinner()

        binding.settingBackPressButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
   private fun spinner(){
       val lang = arrayOf("O'zbek", "Русский", "Ўзбек")
        val adapter:SpinnerAdapter=ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, lang)
       binding.languageSpinner.adapter=adapter
       binding.languageSpinner.onItemSelectedListener= object  :AdapterView.OnItemSelectedListener{
           override fun onItemSelected(
               parent: AdapterView<*>?,
               view: View?,
               position: Int,
               id: Long
           ) {
               ( binding.languageSpinner.getChildAt(0) as TextView).setTextSize(17.5f)
           }

           override fun onNothingSelected(parent: AdapterView<*>?) {
               TODO("Not yet implemented")
           }
       }


    }

    override fun onBackPressed() {
        Functions().exitDialog(this)
    }
}