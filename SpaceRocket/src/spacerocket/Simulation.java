package spacerocket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Simulation {
    
    public ArrayList<İtem> loadItems(String filePath) throws FileNotFoundException{
        File file=new File(filePath);
        Scanner sc=new Scanner(file);
        ArrayList<İtem> arrays=new ArrayList<>();
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] parts = line.split("=");
            İtem i1=new İtem(parts[0], Integer.parseInt(parts[1]));
            arrays.add(i1);
        }
        return arrays;
    }
    
    public ArrayList<U1> loadU1(ArrayList<İtem> itemList){
        ArrayList<U1> list1=new ArrayList<U1>();
        U1 u1=new U1();
        for(İtem a: itemList){
            if(u1.canCarry(a)){
                u1.carry(a);}
            else{
                list1.add(u1);
                u1 =new U1(); 
                if(u1.canCarry(a))
                u1.carry(a);
            }
            
        }
        return list1;
    }
    public ArrayList<U2> loadU2(ArrayList<İtem> itemList){
        ArrayList<U2> list2=new ArrayList<U2>();
        U2 u2=new U2();
        for(İtem a: itemList){
            if(u2.canCarry(a))
                u2.carry(a);
            else{
                list2.add(u2);
                u2 =new U2(); 
                u2.carry(a);
            }
            
        }
        return list2;
    }
    
    public int runSimulation1(ArrayList<U1> l1){
        int U1sayisi=0;
        int counter = 0;
        for(Rocket r : l1){
            counter +=1;
            while(!r.launch()){
                counter +=1;
            }
            while(!r.land()){
                counter +=1;
                while (!r.launch())
                    counter +=1;
            }

        }
        return counter;
    }
    
    public int runSimulation2(ArrayList<U2> l2){
        int U2sayisi=0;
        U2 u22=new U2();
        for(Rocket u2: l2){
            while(!u2.launch()){
                U2sayisi++;
            }
            
            while(!u2.land()){
                
                while(!u2.launch()){
                U2sayisi++;
            }
                
            }
            U2sayisi++;
        }
        
        
        return U2sayisi;
    }
}
