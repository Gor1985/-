package com.example.math

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.TypedArrayUtils.getText
import com.example.math.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.odin.setOnClickListener { binding.Math.text.append("1") }
        binding.dva.setOnClickListener { binding.Math.text.append("2") }
        binding.tri.setOnClickListener { binding.Math.text.append("3") }
        binding.chetyre.setOnClickListener { binding.Math.text.append("4") }
        binding.pyat.setOnClickListener { binding.Math.text.append("5") }
        binding.shest.setOnClickListener { binding.Math.text.append("6") }
        binding.sem.setOnClickListener { binding.Math.text.append("7") }
        binding.vosem.setOnClickListener { binding.Math.text.append("8") }
        binding.devat.setOnClickListener { binding.Math.text.append("9") }
        binding.nulll.setOnClickListener { binding.Math.text.append("0") }
        binding.delenie.setOnClickListener {
            if (!binding.Math.text.isNullOrEmpty())
                binding.Math.text.append("/")
        }
        binding.umnoj.setOnClickListener {
            if (!binding.Math.text.isNullOrEmpty())
                binding.Math.text.append("*")
        }
        binding.minus.setOnClickListener {
            if (!binding.Math.text.isNullOrEmpty())
                binding.Math.text.append("-")
        }
        binding.plus.setOnClickListener {
            if (!binding.Math.text.isNullOrEmpty())
                binding.Math.text.append("+")
        }
        binding.ravno.setOnClickListener {
            // проверяем на ошибки
            try {
                val ex = ExpressionBuilder(binding.Math.text.toString()).build()
                //записываем в переменную  возможнеость выражения в виде строки
                val result = ex.evaluate()// записываем в переменную результат
                val Eresult = result.toLong()// записываем если результат с точкой
                if (result == Eresult.toDouble())// приравниваем результаты для выхода результата
                    binding.Math.setText(Eresult.toString())//выводим результат с точкой
                else
                    binding.Math.setText(result.toString())// выводим результат без точки
            } catch (e: Exception) {//проверка на ошибку
            }
        }
        binding.tocka.setOnClickListener {
            if (!binding.Math.text.isNullOrEmpty())
                binding.Math.text.append(".")
        }
        binding.AC.setOnClickListener {
            var nnn: String = binding.Math.text.toString()//создаем переменную типа стринг
            if (!nnn.isNullOrEmpty()) {//проверяем на ноль
                nnn = nnn.substring(
                    0,
                    nnn.length - 1
                )//делаем подстроку и вычитаем 1 элемент при нажатии
                binding.Math.setText(nnn)// вывод на экран
            }
        }
        binding.procent.setOnClickListener {
            binding.Math.append("(")
        }

            binding.skobka2.setOnClickListener {
                if (!binding.Math.text.isNullOrEmpty()) {
                    binding.Math.append(")")

                }
            }


                    binding.sbros.setOnClickListener {
                        if (!binding.Math.text.isNullOrEmpty())
                            binding.Math.setText(Str(""))
                    }
                }

                fun Str(string: String): String {
                    binding.Math.text.append(string)
                    return string
                }
            }






































