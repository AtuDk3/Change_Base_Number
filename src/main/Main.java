/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ConvertBaseNumber;
import model.Number;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Number number = new Number();
        
        new ConvertBaseNumber(number).run();
    }
    
}
