// This function generates a sample of 'n' reads using Spark.
// This function takes two command line arguments. 
// The first argument takes the input filename and the second argument takes the sample output filename. 
        
    	package de.uni_bonn.bit.lsi.groupfive.samplefile;

    	import java.io.BufferedWriter;
    	import java.io.FileWriter;
    	import java.io.IOException;
    	import java.util.List;

    	import org.apache.log4j.Level;
    	import org.apache.log4j.Logger;
    	import org.apache.spark.SparkConf;
    	import org.apache.spark.api.java.JavaRDD;
    	import org.apache.spark.api.java.JavaSparkContext;



    	public class App {
    		
    		public static void main(String[] args) throws IOException {

    			Logger.getLogger("org.apache").setLevel(Level.WARN);
    			SparkConf conf = new SparkConf().setAppName("spark").setMaster("local[*]");
    			JavaSparkContext sc = new JavaSparkContext(conf);

    			JavaRDD<String> fullRdd = sc.textFile(args[0]);
    			
    			  int num = Integer.parseInt(args[1]);
    			  num = num *4;
    			
    			List<String> sampleReads = fullRdd.take(num);
    			
    			
    			  BufferedWriter writer = null;
    			try {
    				writer = new BufferedWriter(new
    				  FileWriter(args[2]));
    			} catch (IOException e) {
    				
    				e.printStackTrace();
    			}
    				int val = 0;
    				
    			for(val =0; val< sampleReads.size(); val++) {
    				
    					writer.write(sampleReads.get(val)+ "\n");
    					
    				}
    				
    	     	  writer.close();
    	     	  
    		sc.close();
    		}
    	}
    			 
