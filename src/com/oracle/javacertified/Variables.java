package com.oracle.javacertified;

public class Variables {

    public static void variablesMethod() {
        int value = 10; //declare & initiate
        double studentCount = 9.9; //camel case

        final int maxStudent = 25; //this cannot be modified

        //Primitive data-types
        /* 4 types
         * --------
         * Integer -> Byte(8 bits), short(16 bits), int(32 bits), long(64 bits)
         * floating -> float(32 bits),double(64 bits)
         * character -> 8 bit
         * boolean*/

        byte numberOfEnglishLetters = 26;
        short feetInMile = 6780;
        int mileToKm = 9246000;
        long mileInLightYear = 57890000000L;

        float absoulteZeroInCelsius = -272.14f;
        double fractionPoint = 25.456;

        char normalChar = 'A';
        char accentedU = '\u00DA'; //U`

        boolean iLoveJava = true;
        boolean iHateJava = false;

        System.out.println("I Love Java -> " + iLoveJava);
        System.out.println("Mile to Light Year -> " + mileInLightYear);
    }

    public static void operatorPrecedence(){

        int value = 5;
        System.out.println("Actual value " + value);
        System.out.println("value incremented & changed " + ++value); // 6
        System.out.println("value incremented " + value); //6

        int data = 5;
        System.out.println("Actual data " + data);
        System.out.println("Increment but not reflected " + data++);
        System.out.println("It's reflected " + data);
    }

    public static void compoundAssignment(){

        int value = 100;
        int val1 = 2;
        int val2 = 10;
        value /= val1 * val2; //RHS -> 2 * 10 => value = value(100) / RHS(20) => 5
        System.out.println(value);

    }

    public static void typeCasting(){

        float floatValue = 27.3f;
        double doubleValue = 4.89d;
        byte byteValue = 4;
        short shortValue = 7;
        long longValue = 10;

        //Widening the values
        short data1 = byteValue;

        //narrowing by explict
        short data2 = (short) longValue; //error by default hence explict conversion

        short data3 = (short) (byteValue - longValue);

        float data4 = longValue - floatValue;
    }
}

