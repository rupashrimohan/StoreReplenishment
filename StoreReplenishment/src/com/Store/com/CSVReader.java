package com.Store.com;
import java.io.FileWriter;

import java.io.BufferedReader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<StoreClass> store = readFromCSV("D:/JavaFileHandling/StoreSKUList.csv");
        List<Integer> uniqueStores = new ArrayList<>();
        List<StoreClass> stores_printed= new ArrayList<>();
        
                for (StoreClass each : store) {
                	if(each.getStoreQty() < (each.getShelfQty()*2))
                	{
                		stores_printed.add(each);
                	}
                	
                	if(!uniqueStores.contains(each.getStorenum()))
                	{
                		uniqueStores.add(each.getStorenum());
                	}
                	
            //System.out.println(each);
        }
                for (int store_unique : uniqueStores)
                {
                	String file_name= "store_"+store_unique+".txt";
                FileWriter writer = new FileWriter("D:/JavaFileHandling/"+file_name); 
                for(StoreClass store_deficient: stores_printed) {
                	if(store_deficient.getStorenum() == store_unique)
                	{
                  writer.write(store_deficient.toString() + System.lineSeparator());
                	}
                }
                writer.close();
                }
    }
	private static List<StoreClass> readFromCSV(String fileName) {
        List<StoreClass> store = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        
        try (
        		BufferedReader br = Files.newBufferedReader(pathToFile))
        {

 
            String line = br.readLine();
int line_num=1;
 
            while (line != null)
            {
               if(line_num > 1)
               {
             String[] attributes = line.split(",");

                StoreClass storeClass = createStoreDetails(attributes);

 
              store.add(storeClass);

                
              } 
               line = br.readLine();
              	line_num++;
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return store;
    }

    private static StoreClass createStoreDetails(String[] metadata) {
        int storenum = Integer.parseInt(metadata[0]);
        int skeunum = Integer.parseInt(metadata[1]);
        int shelfQty = Integer.parseInt(metadata[2]);
        int storeQty = Integer.parseInt(metadata[3]);

 
        return new StoreClass(storenum,skeunum,shelfQty,storeQty);
    }


	}

