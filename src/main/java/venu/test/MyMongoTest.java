package venu.test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
//import com.mongodb.MongoClient;

public class MyMongoTest {
	
	public static void main(String a[]) throws Exception{
		/**** Connect to MongoDB ****/
		// Since 2.10.0, uses MongoClient
		//MongoClient mongo = new MongoClient("localhost", 27017);
		Mongo mongo = new Mongo("localhost", 27017);

		/**** Get database ****/
		// if database doesn't exists, MongoDB will create it for you
		DB db = mongo.getDB("venuDB");
		
		//MongoDatabase mongoDB = mongo.getDatabase("venuDB");

		/**** Get collection / table from 'testdb' ****/
		// if collection doesn't exists, MongoDB will create it for you
		DBCollection table = db.getCollection("emp");
		
		System.out.println("DB Connection Established");
	}

}
