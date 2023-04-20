/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock;

/**
 * @author thanhtung
 * @date Nov 12, 2016
 */
public class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    } // return void to return String
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String told = c.getTime();
        System.out.println("time: " + told); // told = "12345"
    }
}
