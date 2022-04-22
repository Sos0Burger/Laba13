package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("code.txt"); FileWriter fw = new FileWriter("output.txt")){
            int i;
            while((i=fr.read())!=-1){
                if(i == 47) {
                    if((i=fr.read())!=-1 & i == 47){
                        while(i!=13){
                            i=fr.read();
                        }
                    }
                    if(i == 42){
                        while(i!=-1) {
                            if ((i = fr.read()) == 42) {
                                i = fr.read();
                                if (i == 47) {
                                    i = fr.read();
                                    break;
                                }
                            }
                        }
                    }
                }
                fw.append((char) i);
            }
        }
        catch (IOException ex){
            ex.getMessage();
        }
    }
}
