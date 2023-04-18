fun main() {
    println(isPalindrome(3334))
    println(convertTemperature(36.50).toString())


}
    fun isPalindrome(x: Int): Boolean {
    var xString = x.toString()

    var i = 0;
    var j = xString.length-1

    while (j>=i){
        if(xString[i]!=xString[j]){
            return false;
        }
        i++;
        j--;
    }

    return true;
}