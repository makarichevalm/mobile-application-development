// 18) является ли массив упорядоченным по возрастанию, если да, то сформировать новый массив,
// заполняя его значениями исходного массива в обратном порядке
fun isSorted(a: Array<Int>): Boolean {
    for (i in 0 until a.size - 1)
    {
        if (a[i] > a[i + 1]) {
            return false
        }
    }
    return true
}
fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    var res: IntArray = intArrayOf()
    println("First array:" + arr.contentToString())
    if(isSorted(arr)){
        for (i in arr.reversed()) {
            res+=i
        }
    }
    if(res.isNotEmpty()) println("Result array:" + res.contentToString()) else println("\nFirst array is non sorted!")
}