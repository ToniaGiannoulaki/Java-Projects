
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.*;
//these are my libraries



public class Main extends MyZoo { //the Main class inherits from the MyZoo class

    public static void main (String[]args) {
        Animal();
    }

    public static void Animal(){ //this is a method which i will show later why i wrote all the program inside this method

        System.out.println("\n\nWelcome to MyZoo application.\nPlease select a number from the menu\n" +
                "-------------------------------------\n " +
                "1.View all available zoo animals\n" +
                " 2.Add a new animal\n " +
                "3.Search for an animal by name\n " +
                "4.Search for an animal by code\n " +
                "5.Animal processing based on code\n " +
                "6.Delete animal based on code\n" +
                " 7.Exit from the application" +
                "\n-------------------------------------\n");

        Scanner input = new Scanner(System.in);

        int UserInput;//Users input to choose from the menu

        Scanner Animalinput = new Scanner(System.in);

        Scanner Animalinput2 = new Scanner(System.in);

       /* MyZoo a1 = new MyZoo(); //from the MyZoo class i create a constructor

        a1.setAnimal_Name("tiger");
        a1.setCohabitation("Mammal");
        a1.setGender("Female");  //Here i create objects from my setter methods
        a1.setWeight(170);
        a1.setMaximum_Age(15);
        a1.setAnimal_Code("A01");

        MyZoo a2 = new MyZoo();

        a2.setAnimal_Name("taurus");
        a2.setCohabitation("Mammal");
        a2.setGender("Male");  //I do the same thing right here
        a2.setWeight(1100);
        a2.setMaximum_Age(22);
        a2.setAnimal_Code("A02");

        MyZoo a3 = new MyZoo();

        a3.setAnimal_Name("red deer");
        a3.setCohabitation("Mammal");
        a3.setGender("Male"); //I do the same thing right here
        a3.setWeight(200);
        a3.setMaximum_Age(27);
        a3.setAnimal_Code("A03");

        MyZoo a4 = new MyZoo();

        a4.setAnimal_Name("giraffe");
        a4.setCohabitation("Mammal");
        a4.setGender("Female"); //I do the same thing right here
        a4.setWeight(800);
        a4.setMaximum_Age(30);
        a4.setAnimal_Code("A04"); */

        //if you want to save the previous objects inside the list you need to delete the comments

        ArrayList<MyZoo> list = new ArrayList<>(); //So here i create a list which we add the objects that we made out from our setters

        /*try {
            FileOutputStream fileOutputStream = new FileOutputStream("myzoo1.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a1);
            objectOutputStream.writeObject(a2);
            objectOutputStream.writeObject(a3);
            objectOutputStream.writeObject(a4);
            //System.out.println("Object saved!");
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } */

        //if you want to run write the file with the previous objects you need to delete the comments


        MyZoo temp = null;//temporary variable
        try {
            FileInputStream fileInputStream = new FileInputStream("myzoo1.ser");//just reading the ser file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while(true) {
                temp = (MyZoo) objectInputStream.readObject(); //read the temp from MyZoo class
                list.add(temp);//add the temp variable in to the list
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        while (true) {

            try {
                System.out.print("\nWrite Here: "); //Here i check if the user's input is integer
                UserInput = input.nextInt();

            } catch (InputMismatchException e) {
                input.next();
                System.out.print("That’s not an integer!Please Try again!"); //and if it's not, the user needs to give an integer
                continue;
            }

            if (UserInput < 1 || UserInput > 7) { //Here i check if the user's input is between 1 - 7

                System.out.println("The number doesn't exist in the menu!Please try again!");
                //and if it's not, the user needs to give a number again
                continue;
            }
            break;

        }if (UserInput == 1) {   //if the user choose 1

            System.out.print("\nYou chose " + UserInput);

            for(int i = 0; i < list.size(); i++) { //We appear all the objects inside the list

                System.out.println("\nName: " +list.get(i).getAnimal_Name());
                System.out.println("Cohabitation:" + list.get(i).getCohabitation());
                System.out.println("Gender:" + list.get(i).getGender());
                System.out.println("Weight:" + list.get(i).getWeight() + "kg");
                System.out.println("Maximum Age:" + list.get(i).getMaximum_Age());
                System.out.println("Animal Code:" + list.get(i).getAnimal_Code());
            }

        }else if (UserInput == 2) { //if user choose 2
            MyZoo An = new MyZoo();

            System.out.print("You chose " + UserInput);

            System.out.print("\nAnimal Name: ");
            An.setAnimal_Name(Animalinput.nextLine()); //The user writes the new animal's name

            System.out.print("Cohabitation: ");
            An.setCohabitation(Animalinput.nextLine()); //The user writes the new animal's cohabitation

            System.out.print("Gender: ");
            An.setGender(Animalinput.nextLine()); //The user writes the new animal's gender

            while (true) {
                try {
                    System.out.print("Weight: ");
                    An.setWeight(Animalinput2.nextInt());//Here i check if the user's input is integer

                } catch (InputMismatchException e) {
                    Animalinput2.next();//and if it's not, the user needs to give an integer
                    System.out.print("That’s not an integer!\nPlease Try again!\n");
                    continue;
                }

                break;
            }

            while (true) {
                try {
                    System.out.print("Maximum Age: ");
                    An.setMaximum_Age(Animalinput2.nextInt());//Here i check if the user's input is integer

                } catch (InputMismatchException e) {
                    Animalinput2.next();//and if it's not, the user needs to give an integer
                    System.out.print("That’s not an integer!\nPlease Try again!\n");
                    continue;
                }
                break;
            }

            System.out.print("Animal Code: ");
            An.setAnimal_Code(Animalinput.nextLine());//The user writes the new animal's code
            list.add(An);
            System.out.println("Your animal saved!");

        } else if (UserInput == 3) {//if user choose 3

            System.out.print("You chose " + UserInput);

            int bool = 0;//this is a flag
            boolean bool2 = true;//this a flag
            while (bool2) {
                System.out.print("\nSearch an animal by name: ");
                Scanner Search = new Scanner(System.in);
                String Search_Animal_name = Search.next();

                for (int i = 0; i < list.size(); i++) { //run all the objects inside the list
                    if (Search_Animal_name.equals(list.get(i).getAnimal_Name())) {
                        //if the user's input is equal with the object's name is looking for
                        System.out.println("\nName: " + list.get(i).getAnimal_Name());
                        System.out.println("Cohabitation:" + list.get(i).getCohabitation());
                        System.out.println("Gender:" + list.get(i).getGender());
                        System.out.println("Weight:" + list.get(i).getWeight());
                        System.out.println("Maximum Age:" + list.get(i).getMaximum_Age());
                        System.out.println("Animal Code:" + list.get(i).getAnimal_Code());
                        bool = 1;
                        bool2 = false;

                    }
                }
                if ( bool == 0) {
                    System.out.print("We could not find what you searched!\nPlease Try Again!:");}
                }

        } else if (UserInput == 4) {//if the user choose 4
            System.out.println("You chose " + UserInput);

            int bool = 0;//this is a flag
            boolean bool2 = true;//this is a flag
            while (bool2) {
                System.out.print("\nSearch an animal by code: ");
                Scanner Search = new Scanner(System.in);
                String Search_Animal_code = Search.nextLine();
                for (int i = 0; i < list.size(); i++) { //run all the objects inside the list
                    if (Search_Animal_code.equals(list.get(i).getAnimal_Code())) {
                        //if the user's input is equal with the object's name is looking for
                        System.out.println("\nName: " + list.get(i).getAnimal_Name());
                        System.out.println("Cohabitation:" + list.get(i).getCohabitation());
                        System.out.println("Gender:" + list.get(i).getGender());
                        System.out.println("Weight:" + list.get(i).getWeight());
                        System.out.println("Maximum Age:" + list.get(i).getMaximum_Age());
                        System.out.println("Animal Code:" + list.get(i).getAnimal_Code());
                        bool = 1;
                        bool2 = false;
                    }
                }
                if ( bool == 0) {
                    System.out.print("We could not find what you searched!\nPlease Try Again!:");
                }

            }

        } else if (UserInput == 5) {//if user choose 5
            System.out.println("You chose " + UserInput);
            System.out.println("I'm sorry i didn't ");

        } else if (UserInput == 6) {//if user choose 6

            int bool = 0;
            boolean bool2 = true;

            System.out.print("You chose " + UserInput);
            System.out.print("\nWrite an animal that you want to delete:");


            while (bool2) {
                Scanner Search = new Scanner(System.in);
                String Delete_Animal= Search.next();
                for (int i = 0; i < list.size(); i++) {
                    if (Delete_Animal.equals(list.get(i).getAnimal_Code())) {
                        list.remove(i);
                        System.out.println("The animal deleted Succesfully!");
                        bool = 1;
                        bool2 = false;
                    }
                }
                if (bool==0){
                    System.out.print("The animal doesn't exist\nPlease Try Again!:");

                }
            }

        } else if (UserInput == 7) {//if user choose 7
            System.out.println("You chose " + UserInput + "\n\nThank you for running the programm!" +
                    "\nI hope you enjoyed!\nTime to exit, bye!");

            System.exit(0); //The user exits from the program
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myzoo1.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for(MyZoo a: list ) {
                objectOutputStream.writeObject(a);
            }
            //System.out.println("Object saved!");
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Animal();
        /*this is why i wrote the program in a method , so when the if statement is finished,
         * the user will start over again the program so he can choose something else from the menu
         */
    }

}