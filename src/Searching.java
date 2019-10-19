import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

public class Searching {


    MongoDatabase dbObj;

    public Searching() {
        JsonToMongoDB db = new JsonToMongoDB();
        db.databaseSetUp();
        db.transferJsonToMongoDB();
        this.dbObj = db.getDbObj();
    }




    public void heartRateNumber(String date){
        //Write a query to count the number of heart-rate the user has received on his/her smartwatch in a day.

        //process the String date "mar/2/2017"
        //format it into "mar 2 " and "2017"
        String monthDay = date.split("/")[0] +" "+ date.split("/")[1];
        String year = date.split("/")[2];

        //get the "heartRate" collection
        MongoCollection<Document> col = dbObj.getCollection("HeartRate");

        //filter the collection and find documents that are match the date
        List<Bson> filters = new ArrayList<>();
        filters.add(eq("timestamp", new BasicDBObject("$regex", monthDay)));
        filters.add(eq("timestamp", new BasicDBObject("$regex", year)));
        List<Document> docs = col.find(and(filters)).into(new ArrayList<>());


        /*
        for(Document doc: docs){
            System.out.println(doc);
        }
        */

        System.out.println("You have received " + docs.size() + " heart-rate on your watch on " + date);
    }


    public void ifRunning(String date){
        //Check whether in a particular day (that the user enters the date as input), the user has a running event or not.

        //process the String date "mar/2/2017"
        //format it into "mar 2 " and "2017"
        String monthDay = date.split("/")[0] +" "+ date.split("/")[1];
        String year = date.split("/")[2];

        //get the "ActivFit" collection
        MongoCollection<Document> col = dbObj.getCollection("ActivFit");


        //filter the collection and find documents that are match the date and the running event
        List<Bson> filters = new ArrayList<>();
        filters.add(eq("timestamp.start_time", new BasicDBObject("$regex", monthDay)));
        filters.add(eq("timestamp.start_time", new BasicDBObject("$regex", year)));
        filters.add(eq("sensor_data.activity", "running"));
        List<Document> docs = col.find(and(filters)).into(new ArrayList<>());

        /*
        for (Document d : docs) {
            System.out.println(d);
        }
        */

        //if there is a running event, find the start and end time of the day
        if(docs.size() > 0){
            Document startTime = (Document) docs.get(0).get("timestamp");
            Document endTime = (Document) docs.get(docs.size()-1).get("timestamp");
            System.out.println("Yes, you ran from " + startTime.get("start_time") + " to " + endTime.get("end_time"));

        }else{
            System.out.println("there is no running");
        }

    }

    public int countStep(String date){

        //Get the total amount of step s/he took in that particular day.


        //process the String date "mar/2/2017"
        //format it into "mar 2 " and "2017"
        String monthDay = date.split("/")[0] +" "+ date.split("/")[1] +" ";
        String year = date.split("/")[2];

        //get the "Activity" collection
        MongoCollection<Document> col = dbObj.getCollection("Activity");

        //filter the collection and find documents that are match the date
        List<Bson> filters = new ArrayList<>();
        filters.add(eq("timestamp", new BasicDBObject("$regex", monthDay)));
        filters.add(eq("timestamp", new BasicDBObject("$regex", year)));
        List<Document> docs = col.find(and(filters)).into(new ArrayList<>());

        /*
        for(Document doc: docs){
            System.out.println(doc);
        }

        */


        //find the max step
        Integer maxStepCount = 0;
        if(docs.size() > 0){
            Document maxStep = (Document) docs.get(docs.size()-1).get("sensor_data");

            maxStepCount = (Integer) maxStep.get("step_counts");
        }

        return maxStepCount;


    }
}
