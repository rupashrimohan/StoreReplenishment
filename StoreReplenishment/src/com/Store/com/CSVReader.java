package com.Store.com;

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
		List<StoreClass> store = readFromCSV("D:/JavaFileHandling/store.csv");

                for (StoreClass each : store) {
            System.out.println(each);
        }
    }
	private static List<StoreClass> readFromCSV(String fileName) {
        List<StoreClass> store = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        
        try (
        		BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
        {

 
            String line = br.readLine();

 
            while (line != null) {

             String[] attributes = line.split(",");

                StoreClass storeClass = createStoreDetails(attributes);

 
              store.add(storeClass);

                 line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return store;
    }

    private static StoreClass createStoreDetails(String[] metadata) {
        String storenum = metadata[0];
        String skeunum = metadata[1];
        int shelfQty = Integer.parseInt(metadata[2]);
        int storeQty = Integer.parseInt(metadata[3]);

 
        return new StoreClass(storenum,skeunum,shelfQty,storeQty);
    }


	}

