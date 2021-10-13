
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

        return ("Number of Legs:   " + legs + "\n" 
                + "Tail?           " + tails + "\n" 
                + "Brain?          " + brain + "\n"
                + "Neurons:        " + neurons + "\n" 
                + "Precision to understanding Level: " + precision
                + "Birth Date:     " + birthDate + "\n"
                + "Favorite Food:  " + fav_Foods + "\n");
    }
}


class Monotremata extends Mammalia 
{
    Monotremata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Theria extends Mammalia 
{
    Theria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Marsupialia extends Theria 
{
    Marsupialia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Placentalia extends Theria 
{
    Placentalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Atlantogenata extends Placentalia 
{
    Atlantogenata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Boreoeutheria extends Placentalia 
{
    Boreoeutheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Afrotheria extends Atlantogenata 
{
    Afrotheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Xenarthra extends Atlantogenata 
{
    Xenarthra(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Euarchontoglires extends Boreoeutheria 
{
    Euarchontoglires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Laurasiatheria extends Boreoeutheria 
{
    Laurasiatheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Euarchonta extends Euarchontoglires 
{
    Euarchonta(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Glires extends Euarchontoglires 
{
    Glires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Scrotifera extends Laurasiatheria 
{
    
    int Running_Speed = 0;
    String Hunting_Process;
    String fav_Foods;

    Scrotifera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Eulipotyphia extends Laurasiatheria 
{
    
    int Running_Speed = 0;
    String Hunting_Process;
    String fav_Foods;

    Eulipotyphia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Chirpotera extends Scrotifera 
{
    Chirpotera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Euungulata extends Scrotifera 
{
    Euungulata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Ferae extends Scrotifera 
{

    Ferae(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Cetartiodactyla extends Euungulata 
{
    Cetartiodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Perissodactyla extends Euungulata 
{
    Perissodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Pholidota extends Ferae 
{
    Pholidota(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }


    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Carnivora extends Ferae 
{
    Carnivora(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }


    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


public class Question_2 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File file = new File("Outfile.txt");

        PrintStream printing = new PrintStream(file);
        System.setOut(printing);
    }
}