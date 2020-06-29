Generation of sample reads from a big file using Apache Spark

About:

This project generates a sample fastq file from a big fastq dump. The sample file can be used for various analysis. 

Steps to execute:

The project is developed using Maven and the executable JAR is found in the "$projectpath/target". The JAR accepts two command line arguments
namely, the input file and the number of reads that the user want to extract to generate the sample 

It can be executed as follows:

java -jar <JAR-FILENAME> <INPUTFILE> <# of Reads>




