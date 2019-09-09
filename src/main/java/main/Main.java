/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import app.App;
import app.Logger;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 *
 * @author vasil
 */
public class Main {

    public static void main(String[] args) {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        initializer.addPackages(App.class.getPackage());
        SeContainer container = initializer.initialize();
        Logger logger = container.select(Logger.class).get();
        logger.print("Hello, World! ");
    }
}
