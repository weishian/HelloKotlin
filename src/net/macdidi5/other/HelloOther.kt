package net.macdidi5.other

fun average(vararg nums: Int): Int {
    var total: Int = 0
    for (n in nums) {
        total += n
    }
    return total / nums.size
}