package mongo;



import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.*;
//import static com.mongodb.client.model.Projections.*;
//import static com.mongodb.client.model.Sorts.descending;
/*
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
*/

public class Server {
    public static void main(String[] arg){

    }
/*
    public static void main(String[] arg){

        //Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);

        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://user:user@cluster0-ddiwx.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");


        System.out.println(uri.toString());
        //MongoDatabase database = mongoClient.getDatabase("test");
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }

        MongoCollection coll = database.getCollection("test");

        Document doc = new Document("_id",new ObjectId());
        //BasicDBObject doc= new BasicDBObject();
        doc.put("user","tester");
        doc.put("time",(new Date()).toString());
        doc.put("userid",100);

        String json = "{'json':'yes'}";

        coll.insertOne(doc);

        //mongodb/blog/post/quick-start-java-and-mongodb

        FindIterable itTesters = coll.find(gte("userid",100));//.into(new ArrayList<>());
        List<Document> list = (List<Document>) itTesters.into(new ArrayList<>());

        int num = 0;
        for(Document per:list){
            System.out.println(num++ + ". " + per.toJson());
        }


    }

 */


}
