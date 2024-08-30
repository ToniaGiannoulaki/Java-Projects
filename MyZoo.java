
import java.io.Serializable;//my library

public class MyZoo implements Serializable{

    private String Animal_name;
    private String Cohabitation;
    private String Gender;        // My private variable
    private int Weight;
    private int Maximum_age;
    private String Animal_code;


    public String getAnimal_Name (){
        return Animal_name;
    }//This my getter for the name method
    public void setAnimal_Name (String Animal_name){
        this.Animal_name = Animal_name;
    }//This is my setter for the name method


    public String getCohabitation (){
        return Cohabitation;
    }//This is my Getter for the Cohabitation Method
    public void setCohabitation (String Cohabitation){
        this.Cohabitation = Cohabitation;
    }//This is my Setter for the Cohabitation Method


    public String getGender (){
        return Gender;
    }//This is my Getter for the Gender Method
    public void setGender (String Gender){
        this.Gender = Gender;
    }//This is my Setter for the Gender Method


    public int getWeight(){
        return Weight;
    }//This is my Getter for the Weight Method
    public void setWeight(int Weight){
        this.Weight = Weight;
    }//This is my Setter for the Weight Method


    public int getMaximum_Age(){
        return Maximum_age;
    }//This is my Getter for the max age Method
    public void setMaximum_Age(int Maximum_age){
        this.Maximum_age = Maximum_age;
    }//This is my Setter for the max age Method


    public String getAnimal_Code (){
        return Animal_code;
    }//This is my Getter for the animal code Method
    public void setAnimal_Code(String Animal_Code){
        this.Animal_code = Animal_Code;
    }//This is my Setter for the animal code Method
}

//We are going to use the setters and getters for the Main Class