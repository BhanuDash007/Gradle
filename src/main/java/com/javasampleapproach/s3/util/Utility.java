package com.javasampleapproach.s3.util;

import java.io.*;

public class Utility {

	public static String displayText(InputStream input) throws IOException{
		// Read one text line at a time and display.
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println("    " + line);
        }
        return null;
    }

    public static String WriteText(InputStream input) throws IOException{

       BufferedWriter bw = null;
        try {
            String mycontent = "This String would be written" +
                    " to the specified File";
            //Specify the file name and path here
            File file = new File("C:\\s3\\bhanu.json");

            /* This logic will make sure that the file
             * gets created if it is not present at the
             * specified location*/
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
        return null;
    }
}


