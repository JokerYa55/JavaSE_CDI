/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;
import javax.ejb.Schedule;

/**
 *
 * @author vasil
 */
public class ShedulerTest {

    @Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
    public void test() {
        System.out.println("date : " + (new Date()));
    }
}
