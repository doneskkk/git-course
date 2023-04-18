fun convertTemperature(celsius: Double): DoubleArray {


    var celsiusToFahrenheit = (celsius * (9/5)) + 32
    var celsiusToKelvin =  celsius + 273.15

    return doubleArrayOf(celsiusToKelvin, celsiusToFahrenheit)
}

