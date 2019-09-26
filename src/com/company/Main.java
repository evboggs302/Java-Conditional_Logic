package com.company;

public class Main {

    public static void main(String[] args) {
	// double equals ( == ) testing to see if the two items on either side are equal
        boolean isAlien = true;
        if(isAlien){
            System.out.println("they ARE an alien!");
        }

    // Other operators include: >, <, %, >=, !=, <=, &&, ||
    // the OR operator ( || ) measures to see if ONLY ONE operand is true

        boolean isHuman = isAlien ? false : true;
        if(isHuman){
            System.out.println("they are Human");
        }
        if(isAlien && isHuman){
            System.out.println("something weird happened...");
        }
     // Ternary operator --> test_case ? test_case_true : test_case_false
        boolean wasHuman = isHuman ? false : true;
        if(wasHuman){
            System.out.println("they used to be human, they're now an alien");
        }

//        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//        http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
    }
}
