package com.alevel.adv;

public class MinNumberByAbs {
        public static void main(String[] args) {
            float firstNumber = -23f;
            float secondNumber = 108f;
            float thirdNumber = -90f;
            float firstAbsNumber = Math.abs(firstNumber);
            float secondAbsNumber = Math.abs(secondNumber);
            float thirdAbsNumber = Math.abs(thirdNumber);
            float minNumber = (Math.min(firstAbsNumber,secondAbsNumber) < thirdAbsNumber ) ? Math.min(firstAbsNumber, secondAbsNumber) : thirdAbsNumber;
            System.out.println("Наименьшее по модулю число " + minNumber);

        }
}
