/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.inject.Inject;

/**
 *
 * @author vasil
 */
public class Logger {

    @Inject
    DateSource ds;

   
    public void print(String message) {
        System.out.println(ds.getDate() + " : " + message);
    }
}
