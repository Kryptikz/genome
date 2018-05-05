import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import cs1.*;
import java.lang.Math.*;
import java.util.*;
import java.text.*;
public class genomeMain {
    static int totalgametes; //26:67108864, 12:4096
    static int length;
    static String[] gametes;
    //static String[][] offspring = new String[totalgametes][totalgametes];
    static String[] finalgametes;
    public static void main(String[] args) throws IOException {
        System.out.println("What length do you want?");
        length = Keyboard.readInt();
        System.out.println("\n\n");
        BufferedWriter gametelist = new BufferedWriter(new FileWriter("gametes" + length + ".txt"));
        BufferedWriter offspringlist = new BufferedWriter(new FileWriter("offspring" + length + ".txt"));      
        if (length > 5) {
            totalgametes = ((int)(Math.pow(2, length))); //should be -1
        } else {
            totalgametes = (int)(Math.pow(2, length));
        }  
        String[] gametes = new String[totalgametes];
        String[] finalgametes = new String[totalgametes];
        System.out.println("BEGIN TIME: " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        System.out.println();
        System.out.println("STARTING GAMETE GENERATION, TOTAL GAMETES: " + totalgametes);
        double percent1;
        double percent2;
        for (int i=0; i<totalgametes; i++) {
            percent1 = (((double)((int)(((double)i/(double)totalgametes*100)*10000)))/10000);
            percent2 = (((double)((int)(((double)i/(double)totalgametes*100)*100)))/100); 
            if (percent1%1 == 0) {
                System.out.println(i + "/" + totalgametes + " gametes generated (" + percent2 + "%)");
            }
            gametes[i] = convertToBinary(i);            
        }
        int templength;
        for (int i=0; i<gametes.length; i++) {
            templength = (length-gametes[i].length());
            if (templength != length) {
                for(int d=0; d<templength; d++) {
                    gametes[i] = ("0" + gametes[i]);
                }
            }
        }
        for (int i=0; i<gametes.length; i++) {
            gametes[i] = reverse(gametes[i]);
        }
        for (int i=0; i<length; i++) {
            gametes[0] = ("0" + gametes[0]);
        }
        int tempvalue;
        String tempString = "";
        for (int i=0; i<gametes.length; i++) {
            tempString = "";
            for (int a=0; a<gametes[i].length(); a++) {
                tempvalue = Integer.parseInt(gametes[i].substring(a, a+1));
                if (tempvalue == 1) {
                    if (a==0) {
                        //System.out.print("a");
                        tempString += "a";
                    }
                    if (a==1) {
                        //System.out.print("b");
                        tempString += "b";
                    }
                    if (a==2) {
                        //System.out.print("c");
                        tempString += "c";
                    }
                    if (a==3) {
                        //System.out.print("d");
                        tempString += "d";
                    }
                    if (a==4) {
                        //System.out.print("e");
                        tempString += "e";
                    }
                    if (a==5) {
                        tempString += "f";
                    }
                    if (a==6) {
                        //System.out.print("f");
                        tempString += "g";
                    }
                    if (a==7) {
                        //System.out.print("g");
                        tempString += "h";
                    }
                    if (a==8) {
                        //System.out.print("h");
                        tempString += "i";
                    }
                    if (a==9) {
                        //System.out.print("i");
                        tempString += "j";
                    }
                    if (a==10) {
                        //System.out.print("j");
                        tempString += "k";
                    }
                    if (a==11) {
                        //System.out.print("k");
                        tempString += "l";
                    }
                    if (a==12) {
                        //System.out.print("l");
                        tempString += "m";
                    }
                    if (a==13) {
                        //System.out.print("m");
                        tempString += "n";
                    }
                    if (a==14) {
                        //System.out.print("n");
                        tempString += "o";
                    }
                    if (a==15) {
                        //System.out.print("o");
                        tempString += "p";
                    }
                    if (a==16) {
                        tempString += "q";
                    }
                    if (a==17) {
                        tempString += "r";
                    }
                    if (a==18) {
                        tempString += "s";
                    }
                    if (a==19) {
                        tempString += "t";
                    }
                    if (a==20) {
                        tempString += "u";
                    }
                    if (a==21) {
                        tempString += "v";
                    }
                    if (a==22) {
                        tempString += "w";
                    }
                    if (a==23) {
                        tempString += "x";
                    }
                    if (a==24) {
                        tempString += "y";
                    }
                    if (a==25) {
                        tempString += "z";
                    }
                    if (a==26) {
                        tempString += " ";
                    }                                                                                                                                                                                                                               
                } else {
                    if (a==0) {
                        //System.out.print("A");
                        tempString += "A";
                    }
                    if (a==1) {
                        //System.out.print("B");
                        tempString += "B";
                    }
                    if (a==2) {
                        //System.out.print("C");
                        tempString += "C";
                    }
                    if (a==3) {
                        //System.out.print("D");
                        tempString += "D";
                    }
                    if (a==4) {
                        //System.out.print("E");
                        tempString += "E";
                    }
                    if (a==5) {
                        tempString += "F";
                    }
                    if (a==6) {
                        //System.out.print("F");
                        tempString += "G";
                    }
                    if (a==7) {
                        //System.out.print("G");
                        tempString += "H";
                    }
                    if (a==8) {
                        //System.out.print("H");
                        tempString += "I";
                    }
                    if (a==9) {
                        //System.out.print("I");
                        tempString += "J";
                    }
                    if (a==10) {
                        //System.out.print("J");
                        tempString += "K";
                    }
                    if (a==11) {
                        //System.out.print("K");
                        tempString += "L";
                    }
                    if (a==12) {
                        //System.out.print("L");
                        tempString += "M";
                    }
                    if (a==13) {
                        //System.out.print("M");
                        tempString += "N";
                    }
                    if (a==14) {
                        //System.out.print("N");
                        tempString += "O";
                    }
                    if (a==15) {
                        //System.out.print("O");
                        tempString += "P";
                    }
                    if (a==16) {
                        tempString += "Q";
                    }
                    if (a==17) {
                        tempString += "R";
                    }
                    if (a==18) {
                        tempString += "S";
                    }
                    if (a==19) {
                        tempString += "T";
                    }
                    if (a==20) {
                        tempString += "U";
                    }
                    if (a==21) {
                        tempString += "V";
                    }
                    if (a==22) {
                        tempString += "W";
                    }
                    if (a==23) {
                        tempString += "X";
                    }
                    if (a==24) {
                        tempString += "Y";
                    }
                    if (a==25) {
                        tempString += "Z";
                    }
                    if (a==26) {
                        tempString += " ";
                    }                    
                }
            }
            //System.out.println(tempString);
            finalgametes[i] = tempString;
        }
        //for (String s : gametes) {
        //System.out.println(s);
        //    }
        for (String s : finalgametes) {
            //System.out.println(s);
            gametelist.write(s);
            gametelist.write("\n");
        }
        System.out.println("GAMETE GENERATION COMPLETE, " + totalgametes + " GAMETES GENERATED\n\n");        
        gametelist.close();
        System.out.println("BEGINNING OFFSPRING GENERATION, " + Math.pow(finalgametes.length, 2) + " OFFSPRING TO GENERATE");
        String stringtemp;
        int count = 0;
        for (int r=0; r<finalgametes.length; r++) {
            for (int c=0; c<finalgametes.length; c++) {
                stringtemp = "";
                for (int i=0; i<length; i++) {
                    //System.out.print(finalgametes[r].substring(i,i+1) + finalgametes[c].substring(i,i+1));
                    stringtemp = stringtemp + (finalgametes[r].substring(i,i+1) + finalgametes[c].substring(i,i+1));
                   
                }
                //System.out.println();
                offspringlist.write(stringtemp);
                offspringlist.write("\n");
                percent1 = (((double)((int)(((double)(count)/(double)(finalgametes.length*finalgametes.length)*100)*10000)))/10000);
                percent2 = (((double)((int)(((double)(count)/(double)(finalgametes.length*finalgametes.length)*100)*100)))/100);                
                if (percent1%1 == 0) {
                    System.out.println(count + "/" + (finalgametes.length*finalgametes.length) + " offspring generated (" + percent2 + "%)");
                }  
                count++;
            }
        }
        System.out.println("OFFSPRING GENERATION COMPLETE, " + (finalgametes.length*finalgametes.length) + " OFFSPRING GENERATED");
        System.out.println();
        System.out.println("ENDING TIME: " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        offspringlist.close();
    }
    public static String convertToBinary(int no){
        int container[] = new int[100];
        int i = 0;
        String c = "";
        while (no > 0){
            container[i] = no%2;
            i++;
            no = no/2;
        }
        for (int j = i -1 ; j >= 0 ; j--){
            c+= container[j];
        }
        return c;
    }

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }  
}   