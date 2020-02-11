package mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Server {

    public static void main(String[] arg){


        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://<username>:<password>@cluster0-ddiwx.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");


        /*
        String user = "user";
        String password = "user";

        String uri = "mongodb+srv://" +user + ":" + password + "@cluster0-ddiwx.mongodb.net/test?retryWrites=true&w=majority";


        //uri = "cluster0-shard-00-02-ddiwx.mongodb.net:27017";
        System.out.println(uri);

        MongoClient mongoClient = new MongoClient( uri);
*/

        System.out.println(uri);
        //MongoDatabase database = mongoClient.getDatabase("test");
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }
/*

        MongoCollection coll = db.getCollection("test");

        */
    }
}
