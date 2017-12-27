package venu.test;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

/**
 * @author YAS
 * @version 1.0
 * @category Used to connect with the mongoDB database.
 */
public class MongoDBManager {

	/**
	 * DB static instance.
	 */
	private static DB mongoMgr;
	
	private static MongoDatabase mongoDB;

	/**
	 * Singleton method to get BD instance.
	 * 
	 * @return DB instance
	 */
	public static DB getInstance() {
		if (mongoMgr == null) {
			MongoClient mongo;
			try {
				// connect to mongodb server
				mongo = new MongoClient("localhost", 27017);
				// connect with the database
				mongoMgr = mongo.getDB("venuDB");
				System.out
						.println("Connect to database(usermanager) successfully");
			} catch (Exception e) {
				System.err.println(e.getClass().getName() + ": "
						+ e.getMessage());
			}
		}
		return mongoMgr;
	}
	
	/**
	 * Singleton method to get BD instance.
	 * 
	 * @return DB instance
	 */
	public static MongoDatabase getMongoDBInstance() {
		if (mongoDB == null) {
			MongoClient mongo;
			try {
				
				
				//MongoClientOptions settings = MongoClientOptions.builder().readPreference(ReadPreference.primaryPreferred()).codecRegistry(com.mongodb.MongoClient.getDefaultCodecRegistry()).build();
				//mongo= new MongoClient(new ServerAddress("localhost",27017),settings); //servers,credentials,settings);
					
				// connect to mongodb server
				mongo = new MongoClient("localhost", 27017);
				// connect with the database
				mongoDB = mongo.getDatabase("venuDB");
				System.out.println("Connect to database(usermanager) successfully : " );
			} catch (Exception e) {
				System.err.println(e.getClass().getName() + ": "
						+ e.getMessage());
			}
		}
		return mongoDB;
	}
}