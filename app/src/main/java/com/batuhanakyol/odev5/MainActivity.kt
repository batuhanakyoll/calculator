package com.batuhanakyol.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.batuhanakyol.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         var secilenSayilar : String
         var ilkSayi =""
       binding.button0.setOnClickListener {
          secilenSayilar ="0"
           sayilar(secilenSayilar)
       }
        binding.button1.setOnClickListener {
            secilenSayilar ="1"
            sayilar(secilenSayilar)
        }
        binding.button2.setOnClickListener {
            secilenSayilar ="2"
            sayilar(secilenSayilar)
        }
        binding.button3.setOnClickListener {
            secilenSayilar ="3"
            sayilar(secilenSayilar)
        }
        binding.button4.setOnClickListener {
            secilenSayilar ="4"
            sayilar(secilenSayilar)
        }
        binding.button5.setOnClickListener {
            secilenSayilar ="5"
            sayilar(secilenSayilar)
        }
        binding.button6.setOnClickListener {
            secilenSayilar ="6"
            sayilar(secilenSayilar)
        }
        binding.button7.setOnClickListener {
            secilenSayilar ="7"
            sayilar(secilenSayilar)
        }
        binding.button8.setOnClickListener {
            secilenSayilar ="8"
            sayilar(secilenSayilar)
        }
        binding.button9.setOnClickListener {
            secilenSayilar ="9"
            sayilar(secilenSayilar)
        }
        binding.buttonToplama.setOnClickListener {

            secilenSayilar = "+"
            sayilar(secilenSayilar)
        }
        binding.buttonEsittir.setOnClickListener {
        var toplam = binding.editText.text.toString()
            Log.e("Toplam","$toplam")
            toplama(toplam)

        }

        binding.buttonSFRlama.setOnClickListener {
            binding.editText.setText("")
        }


    }

    fun sayilar(secilenSayilar : String) {

     var deger : String = binding.editText.text.toString()

        deger += secilenSayilar

        binding.editText.setText(deger)

    }


    fun toplama(toplam : String){
        val artı="+"
        val list=toplam.split(artı).toTypedArray()
        var sum = 0
        for ( x in list)
        {
        sum += x.toInt()

        }
        binding.editText.setText(sum.toString())
    }






}
