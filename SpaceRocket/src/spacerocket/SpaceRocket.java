
package spacerocket;

import java.io.FileNotFoundException;
import java.util.ArrayList;
public class SpaceRocket {
        public static void main(String[] args) throws FileNotFoundException {
            
        Simulation s1=new Simulation();
        ArrayList<İtem> liste=new ArrayList<>();
        ArrayList<U1> liste1=new ArrayList<>();
        ArrayList<U2> liste2=new ArrayList<>();
        liste=s1.loadItems("C:\\Users\\FatihBey\\Documents\\NetBeansProjects\\SpaceRocket\\phase1.txt");
        liste1=s1.loadU1(liste);
        liste2=s1.loadU2(liste);
        
        int coast=s1.runSimulation1(liste1);
        System.out.println("Phase 1 için:");
        System.out.println("1.Roket için gereken fiyat"+" "+coast*100+"Million $");
        coast=s1.runSimulation2(liste2);
        System.out.println("2.Roket için gereken fiyat "+" "+coast*120+"Million $");
        liste=s1.loadItems("C:\\Users\\FatihBey\\Documents\\NetBeansProjects\\SpaceRocket\\phase2.txt");
        liste1=s1.loadU1(liste);
        liste2=s1.loadU2(liste);
        
        coast=s1.runSimulation1(liste1);
        System.out.println("Phase 2 için:");
        System.out.println("1.Roket için gereken fiyat"+" "+coast*100+"Million $");
        coast=s1.runSimulation2(liste2);
        System.out.println("2.Roket için gereken fiyat"+" "+coast*120+"Million $");
        
        
    }
    
}