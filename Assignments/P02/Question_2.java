/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 2
 * Title:       Programing Assignment 02
 * Course:      CMPS 4143 
 * Semester:    Fall 2021 
 * Date:        10/10/2021
 * 
 * Description:
 *              Creating multiples class about this Mammalia family 
 *              (can be found in https://en.wikipedia.org/wiki/Mammal).
 *              Storing all the outcomes in a file. 
 * 
 * Solution:
 *               
 *
 * Files:   
 *              Question_2.java
 *              input.txt
 *   
 *****************************************************************************/

abstract interface Mammalia {}

abstract interface Theria extends Mammalia {}

abstract interface Placentalla extends Theria {}

abstract interface Atlantogenata extends Placentalla {}

abstract interface Boreoeutheria extends Placentalla {}

abstract interface Laurasiaheria extends Boreoeutheria {}

abstract interface Scrotifera extends Laurasiaheria {}

abstract interface Ferae extends Scrotifera {}


class Monotremata implements Mammalia {}

class Marsupialia implements Theria {}

public class Question_2 
{
    public static void main(String[] args) 
    {
        
    }