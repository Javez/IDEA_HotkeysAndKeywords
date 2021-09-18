/**
 *  Intellij IDEA Hotkeys&Keywords
 *
 * @group GitHub projects
 * @author Danilov Oleksiy
 * @version dated September 17, 2021
 */
package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main {

    //Alt + Insert - Create getter & setter methods & toString() override
    private int testVar;
    public int getTestVar() {
        return testVar;
    }
    public void setTestVar(int testVar) {
        this.testVar = testVar;
    }
    @Override
    public String toString() {
        return "Main{" +
                "testVar=" + testVar +
                '}';
    }

    //Alt + Insert - Create constructor & override methods & delegate methods
    public Main() {
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public static boolean containsAll(Collection<?> c) {
        return getContext().containsAll(c);
    }

    //psvm - create main function
    public static void main(String[] args) {

        //sout - create print ln func
        System.out.println();

        //souf - create print f func
        System.out.printf("");

        int[] a = new int[10];
        //iter - create for loop by iterable objects
        for (int i : a) {
            //Ctrl + mouse - open method realisation
            System.out.println(i);
        }
    }
    public static ArrayList<HashMap<String, Integer>> getContext() {

        //ctrl alt v - fast create realisation by Intellij
        ArrayList<HashMap<String, Integer>> hashMaps = new ArrayList<>();
        return hashMaps;
    }
    //ctrl + r - Find and replace/delete your code by finding the same name
    //ctrl + shift + r - The same but working in 2 files

    //ctrl + ctrl + upper arrow or down arrow (holding) - working with many code strings  te|st
    //                                                                                    te|st

    //ctrl + Y - Delete full string of code
}
