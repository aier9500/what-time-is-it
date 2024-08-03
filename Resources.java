// Complete

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Resources {
    
    
    ArrayList<String> getUsers() {

        ArrayList<String> resourceList = importResources();
        ArrayList<String> users = new ArrayList<String>();

        for (String line : resourceList) {

            if (line.charAt(0) == '@') users.add(line.substring(1));
        }

        return users;
    }
    

    ArrayList<String> importResources() {

        ArrayList<String> resourceList = new ArrayList<String>();

        try {

            File resourceText = new File("Resources.txt"); 
            Scanner read = new Scanner(resourceText);

            while (read.hasNextLine()) {

                resourceList.add(read.nextLine());
            }

            read.close();

        } catch (FileNotFoundException e) {

            System.out.println("An error occurred: importResources()");
            e.printStackTrace();
        }

        return resourceList;
    }


    ArrayList<ArrayList<String>> import2DResources() {

        ArrayList<String> resourceList = new ArrayList<String>();

        try {

            File resourceText = new File("Resources.txt"); 
            Scanner read = new Scanner(resourceText);

            while (read.hasNextLine()) {

                resourceList.add(read.nextLine());
            }

            read.close();

        } catch (FileNotFoundException e) {

            System.out.println("An error occurred: importResources()");
            e.printStackTrace();
        }


        ArrayList<ArrayList<String>> resourceList2D = turnResourceList2D(resourceList);

        return resourceList2D;
    }
    

    private ArrayList<ArrayList<String>> turnResourceList2D(ArrayList<String> resourceList) {

        ArrayList<ArrayList<String>> resourceList2D = new ArrayList<ArrayList<String>>();
        resourceList2D.add(new ArrayList<String>());
        
        int row = 0;

        for (String line : resourceList) {

            if (!line.equals("\\\\\\") && line.charAt(0) != '@') {
                
                resourceList2D.get(row).add(line);

            } else {

                resourceList2D.add(new ArrayList<String>());
                row++;

            }
        }

        return resourceList2D; 
    }
}
