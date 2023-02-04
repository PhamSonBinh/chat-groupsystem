package com.hmb.chat;

public class Database {
	private static Database instance;
	  
	    
	  	public static Database getInstance() {
	    	if (Database.instance == null) {
	    		//acquireThreadLock()
	    		
	    		
	    	}
            if (Database.instance == null) {
                    Database.instance = new Database();
            }
            return Database.instance;
	    	}
		public static void setInstance(Database instance) {
				Database.instance = instance;
			}
	    public void callQuery()  {
	        // For instance, all database queries of an app go
	        // through this method. Therefore, you can place
	        // throttling or caching logic here.
	        // ...
	    }
    

}
