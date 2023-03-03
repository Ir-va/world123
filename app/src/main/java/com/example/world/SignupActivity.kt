package com.example.world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class SignupActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var sur:EditText
    lateinit var mail:EditText
    lateinit var pass:EditText
    lateinit var pas:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        name=findViewById(R.id.Name)
        sur=findViewById(R.id.Name2)
        mail=findViewById(R.id.Emaill)
        pass=findViewById(R.id.Password)
        pas=findViewById(R.id.Password2)
    }
    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun account(view: View) {
        val intent = Intent(this,SigninActivity::class.java)
        startActivity(intent)
    }

    fun nextt(view: View) {
        if(name.text.toString().isNotEmpty()&&sur.text.toString().isNotEmpty()&&mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()&&pas.text.toString().isNotEmpty()){
            if(emailValid(mail.text.toString())){
                val intent = Intent(this,PatchActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Регистрация прошла успешно", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Ошибка при заполнении поля mail", Toast.LENGTH_SHORT).show()
            }
        }else{
            val al=AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У Вас есть не заполненые поля")
                .setPositiveButton("ok",null)
                .create()
                .show()
        }
    }
}