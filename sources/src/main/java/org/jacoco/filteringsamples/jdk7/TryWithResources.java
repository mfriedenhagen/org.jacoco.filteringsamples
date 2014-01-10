/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jacoco.filteringsamples.jdk7;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Mirko Friedenhagen
 */
public class TryWithResources {

    public TryWithResources() throws IOException {
        try(FileInputStream i = new FileInputStream("")) {
        }
    }

}
