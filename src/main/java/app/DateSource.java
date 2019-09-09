/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;
import javax.enterprise.inject.Any;

/**
 *
 * @author vasil
 */
public class DateSource {

    public String getDate() {
        return new Date().toString();
    }
}
