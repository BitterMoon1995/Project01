package weier.sec1_Base

import org.junit.Test


class ControlFlow {
    var nigger = "非洲大尼哥"//顶层变量

    @Test
    fun varAndValue() {
        val s = 1;//value   只读变量使用关键字 val 定义。只能为其赋值一次。
//        s = 2;    Error:(10, 9) Kotlin: Val cannot be reassigned
        var b = 1;//variable    可重新赋值的变量使用 var 关键字
        b = 2;
    }
    @Test
    fun function() {
        println(sum1(1,2))
        println(sum2(4,5))
        println(noMeaning(4,3))
    }
    //带有两个 Int 参数、返回 Int 的函数：
    private fun sum1(a: Int, b: Int):Int {
        return a+b
    }
    //将表达式作为函数体、返回值类型自动推断的函数：
    private fun sum2(a: Int, b: Int) = a+b

    //函数返回无意义的值  周神点评：就是void
    fun noMeaning(a: Int,b: Int):Unit{
        println("$a 与 $b 的和为 ${a+b}")//字符串插值！！！(燃起来了！)
    }
    //Unit 返回类型可以省略
    fun noMeaning0(a: Int,b: Int){
        println("$a 与 $b 的和为 ${a+b}")
    }

}