package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static javax.swing.UIManager.put;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        //String input = scanner.nextLine();
        //String [] inputAsArray = input.split(" ");
        LinkedHashMap<String,Integer> junk = new LinkedHashMap<>();
        int shardsCont =0;
        int fragmentsCont =0;
        int motesCont =0;
        int i =0;
        String toPrint="";
        boolean toContinue= true;
        while (toContinue){
            int quantity = scanner.nextInt();
            String material = scanner.next().toLowerCase();
            switch (material){
                case "shards":
                    shardsCont+=quantity;
                    if (shardsCont>=250){
                        shardsCont-=250;
                        toPrint="Shadowmourne";
                        toContinue=false;
                    }
                    break;
                case "fragments":
                    fragmentsCont+=quantity;
                    if (fragmentsCont>=250){
                        fragmentsCont-=250;
                        toPrint = "Valanyr";
                        toContinue=false;
                    }
                    break;
                case "motes":
                    motesCont+= quantity;
                    if (motesCont>=250){
                        motesCont-=250;
                        toPrint= "Dragonwrath";
                        toContinue=false;
                    }
                    break;
                default:
                    Integer current = junk.get(material);
                    if (current==null){
                        current=0;
                    }
                    junk.put(material,quantity+current);
                    break;
            }
            i+=2;
        }
        System.out.println(toPrint + " obtained!");
        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n",shardsCont,fragmentsCont,motesCont);
        for (Map.Entry<String,Integer> entry : junk.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
