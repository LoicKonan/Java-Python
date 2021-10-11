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
class Mammalia
{
    int legs;
    boolean tails;
    boolean brain;
    int neurons;
    double precision;
    int birthDate;
    String fav_Foods;
    
    public void eat(){}
    public void walk(){}
    public void sleep(){}
    public void give_birth(){}
}

class Monotremata extends Mammalia{}
class Theria extends Mammalia{}

class Marsupialia extends Theria{}
class Placentalia extends Theria{}

class Atlantogenata extends Placentalia{}
class Boreoeutheria extends Placentalia{}

class Afrotheria extends Atlantogenata{}
class Xenarthra extends Atlantogenata{}

class Euarchontoglires extends Boreoeutheria{}
class Laurasiatheria extends Boreoeutheria{}

class Euarchonta extends Euarchontoglires{}
class Glires extends Euarchontoglires{}

class Scrotifera extends Laurasiatheria{}
class Eulipotyphia extends Laurasiatheria{}

class Chirpotera extends Scrotifera{}
class Euungulata extends Scrotifera{}
class Ferae extends Scrotifera{}

class Cetartiodactyla extends Euungulata{}
class Perissodactyla extends Euungulata{}

class Pholidota extends Ferae{}
class Carnivora extends Ferae{}

public class Question_2 
{
    public static void main(String[] args) 
    {
        Theria Theria1 = new Theria();
        Theria Boreoeutheria1 = new Boreoeutheria();
        Theria Xenarthra1 = new Xenarthra();
        Theria Glires1 = new Glires();
        Theria Ferae1 = new Ferae();
    }
}