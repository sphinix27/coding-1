package org.fundacionjala.coding.cynthia;

/**
 * In this kata, you must create a digital root function.
 * <p>
 * A digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has two digits,
 * continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 * <p>
 * Here's how it works (Ruby example given):
 * <p>
 * sumOfDigits(16)
 * => 1 + 6
 * => 7
 * <p>
 * sumOfDigits(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * <p>
 * sumOfDigits(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 * <p>
 * sumOfDigits(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 */

public class DigitalRoot {

    /**
     * @param num with the digits.
     * @return the sum of digits.
     */
    public int sumOfDigits(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num = num / 10;
        }
        return res >= 10 ? sumOfDigits(res) : res;
    }
}
