package javasessions.exceptionhandling;

public class FinallyBlockExample {

	// This class shows some REAL TIME USE CASES of try, catch and finally blocks

	public static void main(String[] args) {

		// USE CASE1:
		// We connect with the DB of an app using correct creds, hit the query, get the results and use
		// those results in our automation scripts.
		// But let's say while getting results some exception is getting thrown. In that
		// case we need to handle the exception using try catch and then close the DB connection
		// which is already established, in the finally block. If we don't close the DB connection
		// in finally there will be unnecessary load on the DB server. So, no matter exception
		// is coming or not we will always close the DB connection in the finally block.


		// First make the DB connection using Username/Password/ip:port

		// Then Hit the SQL query

		// try{
		// get the results
	    //  }

		// catch(){

	    //    }
		// finally{

	       		// Close the DB connection here
	    //   }

		// Use the results in test automation scripts




	}

}
