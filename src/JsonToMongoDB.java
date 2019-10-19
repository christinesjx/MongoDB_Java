import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JsonToMongoDB {

    MongoDatabase dbObj;

    public void transferJsonToMongoDB(){

        //find all files in the data folder and process them.

        File[] files = new File("data").listFiles();
        for(int i = 0; i< files.length; i++){
            System.out.println(files[i]);
            transferJsonToMongoDB(files[i]);
        }
    }

    private void transferJsonToMongoDB(File fileName) {
        //get the name of the file in String
        String[] fileNameArr = fileName.toString().split("/")[1].split(".json");
        String fileNameStr = fileNameArr[0];

        //get the collection for each sensor file
        MongoCollection<Document> col = dbObj.getCollection(fileNameStr);

        try {
            //scan through each line of the .json file
            Scanner scan = new Scanner(fileName);
            while (scan.hasNext()) {
                final String line = scan.nextLine().toLowerCase();
                //parsing each line and insert it in the corresponding collection
                col.insertOne(Document.parse(line));
            }

            /*
            //print the collection
            Iterator it = col.find().iterator();
            while (it.hasNext()) {
                System.out.println("docs inside the col:" + it.next());

            }*/


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void databaseSetUp(){

        //set up database

        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);

        MongoClient mongoClient = new MongoClient();
        // get the 'JiaxinSunHW' dataset
        MongoDatabase dbObj = mongoClient.getDatabase("jiaxinsunHW");

        this.dbObj = dbObj;
        // list its collections
        for (String name : dbObj.listCollectionNames()) {
            System.out.println("Collections inside this db:" + name);
            dbObj.getCollection(name).deleteMany(new Document());
        }


    }


    //getter
    public MongoDatabase getDbObj() {
        return dbObj;
    }
}
