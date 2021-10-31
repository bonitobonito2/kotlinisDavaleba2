package com.example.kalkulatoridavaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.Math.asin
import java.lang.Math.pow
import kotlin.math.sin
import kotlin.math.sqrt

class MainActivity : AppCompatActivity(){
     lateinit var result:TextView
   private var operant:Double = 0.0
   lateinit var opperator:String
    lateinit var secondOp:String;
    lateinit var idk:TextView
    lateinit var cass:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result=findViewById(R.id.shedegi)
        idk=findViewById(R.id.hm)






    }
var cnt=1
    fun numberClick(clicked:View){
        if(clicked is TextView){
         var number = clicked.text.toString()
            var resulttext: String =result.text.toString()
            result.text=resulttext+number

        }
    }


    fun operationClicked(opt:View){
        if ( cnt==1) {
            if (opt is TextView) {
                var number = result.text.toString()
                if (number.isNotEmpty()) {
                    this.operant = number.toDouble()
                    result.text = ""
                    this.opperator = opt.text.toString()
                    cnt--
                }

            }

        }

    }


    fun equal(equal:View){
        if(cnt==0) {
            this.secondOp = result.text.toString()
            var secop: Double = 0.0
            if (this.secondOp.isNotEmpty()) {
                secop = this.secondOp.toDouble()


                if (this.opperator == "+" && this.secondOp != "") {
                    var something: Double = secop + this.operant

                    if (something % 1 == 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0) {
                        // tu jami intia
                        var axali = something.toLong()
                        result.text = axali.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        //tu jami da pirveli shesakrebi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        var axali3=secop.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + axali3.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 !== 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        var axali1= operant.toLong()

                        result.text = something.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= secop.toLong()

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + axali1.toString()

                    }
                }
               else if (this.opperator == "-" && this.secondOp != "") {
                    var something: Double =  this.operant - secop

                    if (something % 1 == 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0) {
                        // tu jami intia
                        var axali = something.toLong()
                        result.text = axali.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        //tu jami da pirveli shesakrebi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        var axali3=secop.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + axali3.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 !== 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        var axali1= operant.toLong()

                        result.text = something.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= secop.toLong()

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + axali1.toString()

                    }

                }
              else  if (this.opperator == "*" && this.secondOp != "") {
                    var something: Double =  this.operant * secop

                    if (something % 1 == 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0) {
                        // tu jami intia
                        var axali = something.toLong()
                        result.text = axali.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        //tu jami da pirveli shesakrebi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        var axali3=secop.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + axali3.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 !== 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        var axali1= operant.toLong()

                        result.text = something.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= secop.toLong()

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + axali1.toString()

                    } else if(something % 1 == 0.0 && operant % 1 !== 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= something.toLong()
                        var axali2=operant.toLong()

                        result.text = axali1.toString()
                        idk.text = operant.toString() + this.opperator +axali2.toString()

                    }
                    else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        var axali1= something.toLong()
                        var axali2=secop.toLong()

                        result.text = axali1.toString()
                        idk.text = axali2.toString() + this.opperator +operant.toString()

                    }

                }
               else if (this.opperator == "/" && this.secondOp != "") {
                    var something: Double =  this.operant / secop

                    if (something % 1 == 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0) {
                        // tu jami intia
                        var axali = something.toLong()
                        result.text = axali.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        //tu jami da pirveli shesakrebi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia
                        var axali = something.toLong()
                        var axali1= operant.toLong()
                        var axali3=secop.toLong()
                        result.text = axali.toString()
                        idk.text = axali1.toString() + this.opperator + axali3.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + secop.toString()

                    }else if(something % 1 !== 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        var axali1= operant.toLong()

                        result.text = something.toString()
                        idk.text = axali1.toString() + this.opperator + secop.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 !== 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= secop.toLong()

                        result.text = something.toString()
                        idk.text = operant.toString() + this.opperator + axali1.toString()

                    } else if(something % 1 == 0.0 && operant % 1 !== 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= something.toInt()
                        var axali2=operant.toLong()

                        result.text = axali1.toString()
                        idk.text = operant.toString() + this.opperator +axali2.toString()

                    }
                    else if(something % 1 == 0.0 && operant % 1 == 0.0 && secop % 1 !== 0.0){
                        // tu yvelaferi intia

                        var axali1= something.toLong()
                        var axali2=secop.toLong()

                        result.text = axali1.toString()
                        idk.text = axali2.toString() + this.opperator +operant.toString()

                    }
                    else if(something % 1 !== 0.0 && operant % 1 == 0.0 && secop % 1 == 0.0){
                        // tu yvelaferi intia

                        var axali1= secop.toLong()
                        var axali2=operant.toLong()

                        result.text = something.toString()
                        idk.text = axali2.toString() + this.opperator +axali1.toString()

                    }

                }

            cnt++
        }
        }
      if(result.text.isNotEmpty()) {
          if (this.opperator == "pow") {
              var num = result.text.toString()
              var num1: Double = num.toDouble()
              var num2: Double = cass.toDouble()
              var resultChild: Double = Math.pow(num2, num1)
              if(num1%1!==0.0 && num2%1!==0.0 && resultChild%1!==0.0) {
                  result.text = resultChild.toString()
                  idk.text = "pow(${num2},${num1})"
              }else if(num1%1==0.0 && num2%1==0.0 && resultChild%1==0.0) {

                  var fnum1=num1.toLong()
                  var fnum2=num2.toLong()
                  var fresult= resultChild.toLong()
                  result.text = fresult.toString()
                  idk.text = "pow(${fnum2},${fnum1})"
              }else if(num1%1!==0.0 && num2%1==0.0 && resultChild%1!==0.0) {


                  var fnum2=num2.toLong()

                  result.text = resultChild.toString()
                  idk.text = "pow(${fnum2},${num1})"
              }else if(num1%1!==0.0 && num2%1==0.0 && resultChild%1==0.0) {


                  var fnum2=num2.toLong()
                  var fresult=resultChild.toLong()
                  result.text = fresult.toString()
                  idk.text = "pow(${fnum2},${num1})"
              }else if(num1%1==0.0 && num2%1!==0.0 && resultChild%1!==0.0) {


                  var fnum2=num1.toLong()

                  result.text = resultChild.toString()
                  idk.text = "pow(${num2},${fnum2})"
              }else if(num1%1==0.0 && num2%1!==0.0 && resultChild%1==0.0) {


                  var fnum2=num1.toLong()
                 var fresult=resultChild.toLong()
                  result.text = fresult.toString()
                  idk.text = "pow(${num2},${fnum2})"
              }



          }
      }

    }
    fun del(del:View){
        result.text=""
        this.operant=0.0
        this.secondOp=""
        this.idk.text=""
    }



    fun  del1(del:View){
        if(result.text.isNotEmpty()) {
            var len: Int = result.length()
            var name = result.text
            var hm = name.substring(0, len - 1)



            result.text = hm
        }

    }

    fun cos(cos:View) {
     if(result.text.isNotEmpty()){
      var txt=result.text.toString()
         var num =  txt.toDouble()
          num = kotlin.math.cos(num)
         result.text=num.toString()
         idk.text="cos(${txt.toString()})"
//        }
 }
        print("sup")
    }

    fun sin(sin:View) {
        if(result.text.isNotEmpty()){
            var txt=result.text.toString()
            var num =  txt.toDouble()
            num = kotlin.math.sin(num)
            result.text=num.toString()
            idk.text="sin(${txt.toString()})"
//        }
        }
        print("sup")
    }
    fun pow(num:View) {
        this.cass=""
        if (num is TextView) {
            if (result.text.isNotEmpty()) {
                idk.text = "pow(${result.text},"
                this.opperator = "pow"
                this.cass=result.text.toString()
                result.text=""


            }
        }
    }

    fun sqr(num:View) {
        if (result.text.isNotEmpty()) {
            if (num is TextView) {
                var num1 = result.text.toString()
                var num2 = num1.toDouble()
                var sqr = sqrt(num2)
                if(sqr %1==0.0){
                    var hm = sqr.toInt()
                    result.text=hm.toString()
                    idk.text = "sqr($num1)"
                }else{
                    result.text = sqr.toString()
                    idk.text = "sqr($num1)"

                }

            }
        }
    }
}

