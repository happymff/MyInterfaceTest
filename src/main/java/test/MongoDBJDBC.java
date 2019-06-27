//package test;
//
//import com.mongodb.DBObject;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.util.JSON;
//
///**
// * Created by mengfeifei on 2017/10/29.
// */
//
//public class MongoDBJDBC{
//    public static void main(String[] args ) {
//        try {
//            // 连接到 mongodb 服务
//            MongoClient mongoClient = new MongoClient("localhost", 27017);
//
//            // 连接到数据库
//            MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");
//            System.out.println("Connect to database successfully");
//            mongoDatabase.createCollection("test");
//            System.out.println("集合创建成功");
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
//    }
//
//    public static void insertJsontoMango(){
//
//// 构造一个Json字符串
//        String json = " {" +
//                " 'school_code' : '111111', " +
//                " 'school_name' : '汉东政法大学', " +
//                " 'teacher_idcard' : '0000001', " +
//                " 'teacher_name' : '高育良' " +
//                " } ";
//
//        MongoClient mongoClient = new MongoClient("10.4.120.83", 27017);
//
//        MongoDatabase database = mongoClient.getDatabase("dbName");
//
//        MongoCollection<DBObject> collection = database.getCollection("collectionName", DBObject.class);
//
//        DBObject bson = (DBObject) JSON.parse(json);
//
//        collection.insertOne(bson);
//    }
//}