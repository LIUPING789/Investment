package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/11/1.
 */

fun main(args: Array<String>) {
    var moneyUtils = MoneyUtils()
    val calculateMax = moneyUtils.calculateMax(150000)
    System.out.println("获取的最大利息 calculateMax = [${calculateMax}]")
    System.out.println("investment = [${moneyUtils.investment}]")

}