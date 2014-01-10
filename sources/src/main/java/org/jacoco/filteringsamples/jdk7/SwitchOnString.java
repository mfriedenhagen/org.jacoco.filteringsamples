/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jacoco.filteringsamples.jdk7;

/**
 *
 * @author Mirko Friedenhagen
 */
public class SwitchOnString {

    public SwitchOnString() {
        final String a = "a";
        switch (a) {
            case "a":
                break;
            default:
                throw new AssertionError();
        }
    }
}
