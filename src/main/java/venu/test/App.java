package venu.test;

import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import venu.test.pojo.User;

/**
 * Java + MongoDB Hello world Example
 *
 */
public class App {
	
	
  public static void main(String[] args) throws Exception{
	  	
	//DB db =  MongoDBManager.getInstance();
	//MongoDatabase mdb = MongoDBManager.getMongoDBInstance();
	
	
  	   DataManager dm = new DataManager();
  	   
  	   User user = new User();
  	   
  	   user.set_id(106);
  	   user.setFirstName("Venugopal11");
  	   user.setLastName("Durshetty11");
  	   user.setEmail("TestEmail@gmail11.com");
  	   //dm.addUser(user);
  	 addUser(user);
	  
  }

  
	public static void addUser(User pUser) throws Exception{
		
	/*
			BasicDBObjectBuilder docBuilder = new BasicDBObjectBuilder();
			BasicDBObjectBuilder.start();
			docBuilder.append("_id", pUser.getId());
			docBuilder.append("firstName", pUser.getFirstName());
			docBuilder.append("lastName", pUser.getLastName());
			docBuilder.append("email", pUser.getEmail());
		

		DBObject doc = docBuilder.get();
		
		
		*/
		MongoDatabase monDB = MongoDBManager.getMongoDBInstance();
		MongoCollection<Document> dbCol = monDB.getCollection("user");
		System.out.println("JSon Of User is sfsf :");
		ObjectMapper mapper = new ObjectMapper();
		
		
		
		System.out.println("JSon Of User is :"+ mapper.writeValueAsString(pUser) );
		
		 Document document = Document.parse(mapper.writeValueAsString(pUser));
		 
			/*document.put("name", "Harish Taware");
			document.put("salary", 90000);
			document.put("type", "FT/PT");
	 
			Document address = new Document();
			address.put("area", "CIDCO");
			address.put("city", "Aurangabad");
	 
			document.put("address", address);
			*/
				 
				
		dbCol.insertOne(document);
		System.out.println("Added user : " + pUser.getFirstName());
	}

  
 }