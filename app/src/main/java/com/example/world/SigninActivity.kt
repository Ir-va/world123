package com.example.world

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

val pattern=("[a-z]{1,100}"+"@"+"[a-z]{1,6}"+"\\."+"[a-z]{1,5}")

class SigninActivity : AppCompatActivity() {
//    var preff:SharedPreferences?=null
    lateinit var mail:EditText
    lateinit var pass:EditText
//    lateinit var check:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        mail=findViewById(R.id.email)
        pass=findViewById(R.id.password)
//        check=findViewById(R.id.checkBox)
//        preff=getSharedPreferences("TABLEE", MODE_PRIVATE)
//        check.isChecked=preff?.getBoolean("key3",false)?:false
//        mail.setText(preff?.getString("key1",""))
//        pass.setText(preff?.getString("key2",""))
    }
//    fun savestate(check:Boolean){
//        val editor=preff?.edit()
//        editor?.putBoolean("key3", check)
//        editor?.apply()
//    }
//    fun  saceData(mail:String,pass:String){
//        val edit=preff?.edit()
//        edit?.putString("key1", mail)
//        edit?.putString("key2", pass)
//        edit?.apply()
//    }
//    fun seleteAll(){
//        val edis=preff?.edit()
//        edis?.clear()
//        edis?.apply()
//    }
//    fun save11(view: View){
//        val value:String=mail.text.toString()
//        val value2:String=pass.text.toString()
//        val checkbox:Boolean=check.isChecked
//        if(checkbox==true){
//            saceData(value,value2)
//            savestate(checkbox)
//        }else{
//            seleteAll()
//        }
//    }


    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun login(view: View) {
        val intent = Intent(this,SignupActivity::class.java)
        startActivity(intent)
    }

    fun next(view: View) {
        if(mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()){
            if (emailValid(mail.text.toString())){
                val intent = Intent(this,PatchActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Ошибка при заполнении поля mail", Toast.LENGTH_SHORT).show()
            }
        }else{
            val alert=AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас не заполнены поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
}