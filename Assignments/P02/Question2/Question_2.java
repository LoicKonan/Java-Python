
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
    
    int Running_Speed = 0;
    String Hunting_Process;
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


        System.out.println("\nFirst We are going to create Five Mammalia Derived Animals \n"+
        "============================================================================================\n\n");

        // problem one says to print out five animals from the families
        Perissodactyla ButterBean = new Perissodactyla(80, true, true, 12, 1.2, 1954, "Butter  and Peanuts");
        System.out.println(" I am a Perissodactyla\n"+"---------------------------------\n"+ButterBean.Animal_Infos());
                        
        // animal 2
        Mammalia BubbleMan = new Theria(2, true, true, 11, 88.3, 1332, "Air and Little Hobbits");
        System.out.println(" I am a Theria\n"+"---------------------------------\n"+BubbleMan.Animal_Infos());

        //mammal3
        Mammalia Boreoeutheria1 = new Boreoeutheria(19, true, true, 200, 99.9, 1283, "Celery and Potatoes");
        System.out.println(" I am a Boreoeutheria\n"+"---------------------------------\n" +Boreoeutheria1.Animal_Infos());

        //mammal 4 creating
        Pholidota Pholidota1 = new Pholidota(80, true, true, 9, 40.3, 1542, "Nothing");
        System.out.println(" I am a Pholidota\n"+"---------------------------------\n"+Pholidota1.Animal_Infos());

        //mammalia 5 creating
        Mammalia Placentalia1 = new Placentalia(5, true, true, 800, 10.0, 2030, "McDonals and Ketchup Sauce");
        System.out.println("I am a Placentia\n"+"---------------------------------\n"+Placentalia1.Animal_Infos());




        System.out.println("\nNow We are Going to be Outputting our newly created Animals Derived Form their own Classes\n"+
                           "============================================================================================\n\n");
        // in part C, we are needing to have the creation of each class five instances of each

        // create five instances of new mammals that are derived from the different levels
        Marsupialia Marsup1=new Marsupialia(4, true, true, 80, 90.0, 1287, "Pork and Prime Rib");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup1.Animal_Infos());
        Marsupialia Marsup2=new Marsupialia(0, true, true, 0, 0.0, 1500, "Bugs and Worms");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup2.Animal_Infos());
        Marsupialia Marsup3=new Marsupialia(1, true, true, 10, 100, 1568, "Blue Cheese and Crackers");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup3.Animal_Infos());
        Marsupialia Marsup4=new Marsupialia(8, true, true, 78, 90.9, 1567, "Rocks");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup4.Animal_Infos());
        Marsupialia Marsup5=new Marsupialia(4, true, true, 1, 5.0, 1289, "Spaghetti");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup5.Animal_Infos());

        Afrotheria Afro1=new Afrotheria(4, true, true, 80, 90.0, 1287, "Beries and Pork Belly");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro1.Animal_Infos());
        Afrotheria Afro2=new Afrotheria(0, true, true, 0, 0.0, 1500, " Fried Caviar");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro2.Animal_Infos());
        Afrotheria Afro3=new Afrotheria(1, true, true, 10, 100, 1568, "Mold");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro3.Animal_Infos());
        Afrotheria Afro4=new Afrotheria(8, true, true, 78, 90.9, 1567, "Ants and Mold Catapillers");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro4.Animal_Infos());
        Afrotheria Afro5=new Afrotheria(4, true, true, 1, 5.0, 1289, "Eggs and Bacon");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro5.Animal_Infos());

        Xenarthra Xena1=new Xenarthra(4, true, true, 80, 90.0, 1287, "Banana and More Bananas");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena1.Animal_Infos());
        Xenarthra Xena2=new Xenarthra(0, true, true, 0, 0.0, 1500, "Cherries and Worms");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena2.Animal_Infos());
        Xenarthra Xena3=new Xenarthra(1, true, true, 10, 100, 1568, "Drt and Ants");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena3.Animal_Infos());
        Xenarthra Xena4=new Xenarthra(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena4.Animal_Infos());
        Xenarthra Xena5=new Xenarthra(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena5.Animal_Infos());

        Glires Gliry1=new Glires(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry1.Animal_Infos());
        Glires Gliry2=new Glires(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry2.Animal_Infos());
        Glires Gliry3=new Glires(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry3.Animal_Infos());
        Glires Gliry4=new Glires(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry4.Animal_Infos());
        Glires Gliry5=new Glires(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry5.Animal_Infos());

        Chirpotera Chiro1=new Chirpotera(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Chirpotera\n"+"---------------------------------\n"+Chiro1.Animal_Infos());
        Chirpotera Chiro2=new Chirpotera(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Chirpotera\n"+"---------------------------------\n"+Chiro2.Animal_Infos());
        Chirpotera Chiro3=new Chirpotera(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Chirpotera\n"+"---------------------------------\n"+Chiro3.Animal_Infos());
        Chirpotera Chiro4=new Chirpotera(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Chirpotera\n"+"---------------------------------\n"+Chiro4.Animal_Infos());
        Chirpotera Chiro5=new Chirpotera(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Chirpotera\n"+"---------------------------------\n"+Chiro5.Animal_Infos());


        Cetartiodactyla Certa1=new Cetartiodactyla(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa1.Animal_Infos());
        Cetartiodactyla Certa2=new Cetartiodactyla(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa2.Animal_Infos());
        Cetartiodactyla Certa3=new Cetartiodactyla(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa3.Animal_Infos());
        Cetartiodactyla Certa4=new Cetartiodactyla(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa4.Animal_Infos());
        Cetartiodactyla Certa5=new Cetartiodactyla(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa5.Animal_Infos());

        Perissodactyla Peris1=new Perissodactyla(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris1.Animal_Infos());
        Perissodactyla Peris2=new Perissodactyla(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris2.Animal_Infos());
        Perissodactyla Peris3=new Perissodactyla(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris3.Animal_Infos());
        Perissodactyla Peris4=new Perissodactyla(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris4.Animal_Infos());
        Perissodactyla Peris5=new Perissodactyla(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris5.Animal_Infos());

        Pholidota Pholi1=new Pholidota(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi1.Animal_Infos());
        Pholidota Pholi2=new Pholidota(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi2.Animal_Infos());
        Pholidota Pholi3=new Pholidota(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi3.Animal_Infos());
        Pholidota Pholi4=new Pholidota(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi4.Animal_Infos());
        Pholidota Pholi5=new Pholidota(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi5.Animal_Infos());

        Carnivora Carni1=new Carnivora(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni1.Animal_Infos());
        Carnivora Carni2=new Carnivora(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni2.Animal_Infos());
        Carnivora Carni3=new Carnivora(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni3.Animal_Infos());
        Carnivora Carni4=new Carnivora(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni4.Animal_Infos());
        Carnivora Carni5=new Carnivora(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni5.Animal_Infos());
    }
}