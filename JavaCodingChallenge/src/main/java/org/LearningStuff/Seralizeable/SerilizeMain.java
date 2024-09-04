package org.LearningStuff.Seralizeable;

import org.LearningStuff.EnumStuff.Gender;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizeMain {

    public static void main(String[] args){
        Idols idol = new Idols(1,"Mi","yeon","miyeon", Gender.FEMALE.toString());
        try (FileOutputStream fileOut = new FileOutputStream("idol.md");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(idol);
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}
