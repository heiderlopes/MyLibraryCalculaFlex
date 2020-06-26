package br.com.heiderlopes.mylibrarycalculaflex

class CalculatorFlex {

    fun calculateGasOrEthanol(
        ethanolAverage: Double,
        gasAverage: Double,
        ethanolPrice: Double,
        gasPrice: Double
    ): String {
        val performanceOfMyCar = ethanolAverage / gasAverage
        val priceOfFuelIndice = ethanolPrice / gasPrice

        return if (priceOfFuelIndice <= performanceOfMyCar) {
            "Ethanol"
        } else {
            "Gasoline"
        }
    }
}