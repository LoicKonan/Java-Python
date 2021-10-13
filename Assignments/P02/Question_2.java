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

import java.io.*;                               
import java.io.File;                            
import java.io.PrintStream;                     


class Mammalia
{
    int legs;
    boolean tails;
    boolean brain;
    int neurons;
    double precision;
    int birthDate;
    String fav_Foods;

    Mammalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods)
    {
        this.legs = legs;
        this.brain = brain;
        this.neurons = neurons;
        this.tails = tails;
        this.precision = precision;
        this.birthDate = birthDate;
        this.fav_Foods = fav_Foods;
    }

    public void Eat() {}

    public void Walk() {}

    public void Sleep() {}
     
    public String Animal_Infos() 
    {
         
        return ("Number of Legs: " + legs + "\n"+ 
                "Tail?           " + tails + "\n"+
                "Brain?          " + brain + "\n"+
                "Neurons:        " + neurons +"\n"
         + "My Precision Level is     " + precision + "% (Im a little Smart) \n"+
          "I was Born in the Year    " + birthDate + "\n"+
          "And My Favorite Food is   " + fav_Foods +  " (Isnt that Yummy? )\n");
    }
}


class Monotremata extends Mammalia
{
    Monotremata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Theria extends Mammalia
{
    Theria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Marsupialia extends Theria
{
    Marsupialia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Placentalia extends Theria
{
    Placentalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Atlantogenata extends Placentalia
{
    Atlantogenata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Boreoeutheria extends Placentalia
{
    Boreoeutheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Afrotheria extends Atlantogenata
{
    Afrotheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }
    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Xenarthra extends Atlantogenata
{
    Xenarthra(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Euarchontoglires extends Boreoeutheria
{
    Euarchontoglires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Laurasiatheria extends Boreoeutheria
{
    Laurasiatheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Euarchonta extends Euarchontoglires
{
    Euarchonta(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}

class Glires extends Euarchontoglires
{
    Glires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Scrotifera extends Laurasiatheria
{
    Scrotifera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }
    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Eulipotyphia extends Laurasiatheria
{
    Eulipotyphia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Chirpotera extends Scrotifera
{
    Chirpotera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Euungulata extends Scrotifera
{
    Euungulata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Ferae extends Scrotifera
{
    Ferae(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}

class Cetartiodactyla extends Euungulata
{
    Cetartiodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Perissodactyla extends Euungulata
{
    Perissodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Pholidota extends Ferae
{
    Pholidota(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}


class Carnivora extends Ferae
{
    Carnivora(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
    }

    @Override public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + fav_Foods + "\n");
    }
    @Override
    public void Walk() 
    {
        System.out.println("I Have : " + legs + "Legs\n");
    }
    @Override
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
}
// Class Perivora extends perissodactyla, carnivora {}


public class Question_2 
{
    public static void main(String[] args) 
    {
        Theria Theria1 = new Theria(0, false, false, 0, 0, 0, null);
        
        Theria Boreoeutheria1 = new Boreoeutheria(0, false, false, 0, 0, 0, null);
        
        Theria Xenarthra1 = new Xenarthra(0, false, false, 0, 0, 0, null);
        
        Theria Glires1 = new Glires(0, false, false, 0, 0, 0, null);
        
        Theria Ferae1 = new Ferae(0, false, false, 0, 0, 0, null);
    }
}