# Creation of a sample file from a big FASTA file
## About:

FASTA files are very big in size, typically in several GBs. For the purpose of proof of concep, it is important to work on a small portion of the file to ensure that the algorithms get executed in a reasonable amount of time. For this purpose, we have made a spark implementation to extract the small portion from the large file. 

## Usage:

The project is developed using Maven and the executable JAR is found in the "$projectpath/target". The JAR accepts three command line arguments namely, the input file, number of intended reads and the output filepath to store the results.

It can be executed as follows:

`java -jar /target/samplefile_creation-0.0.1-SNAPSHOT-jar-with-dependencies.jar INPUT_FILE NO_OF_READS OUTPUT_FILE`

Please make sure that a stable version of Java 8 is installed in your system. Even though the program uses Apache Spark for computation, explicit installation of the same is not required as the JAR file above takes care of all the dependencies and download them for the execution of the program.
