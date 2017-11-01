package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/11/1.
 */
class MoneyUtils {
    /**
     * 100元     0.8%
     * ---------------
     * 5000元    50元
     * <p>
     * 红包额度(元)        使用限额(元)         抵扣率
     * 100                100                 0.8%
     * 50                 5000                0
     */
    /**
     * 抵扣率
     */

    lateinit var investment: Investment

    /**
     * 计算获取最大投资的算法
     */
    fun calculateMax(money: Int): Double {
        investment = Investment()
        investment.totalMoney = money.toDouble()//输入的钱
        investment.otherMoney = investment.totalMoney % 5000
        investment.fiveNum = (investment.totalMoney / 5000).toInt()
        if (investment.otherMoney == 0.0) {
            investment.profit = investment.totalMoney / 100
        } else {
            investment.fiveMoney = investment.totalMoney - investment.otherMoney
            investment.profit = investment.fiveMoney / 100 + investment.otherMoney * 0.008
        }
        return investment.profit
    }


    class Investment {
        /**输入的总金额*/
        var totalMoney: Double = 0.toDouble()
        /**输入的总金额%5000 的倍数*/
        var fiveNum: Int = 0
        /**输入的总金额%5000的计算公式*/
        var fiveMoney: Double = 0.toDouble()
        /**输入的总金额%5000等于0的值*/
        var otherMoney: Double = 0.toDouble()
        /**获取的最大利息*/
        var profit: Double = 0.toDouble()

        override fun toString(): String {
            return "Investment{" +
                    "totalMoney=" + totalMoney +
                    ", fiveNum=" + fiveNum +
                    ", fiveMoney=" + fiveMoney +
                    ", otherMoney=" + otherMoney +
                    ", profit=" + profit +
                    '}'
        }
    }
}
