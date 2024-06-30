package jdbc_curd;

public class run_curd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		curd_opreations cr = new curd_opreations();
		
		Student_info si = new Student_info();
		
		si.setEnrollno(1253);
		si.setName("ela");
		si.setStream("Db");
		
		   // INSERT The Data 
		//	curd_opreations.insertData(si.getEnrollno(),si.getName(),si.getStream());
			
			  // DELETE The Data
			curd_opreations.deleteData();
			
			//update data	
			
			si.setEnrollno(1253);
			si.setName("bela");
			si.setStream("Db");
			curd_opreations.updateData(si.getEnrollno(),si.getName(),si.getStream());
			
			//for sreach data
			
		//	curd_opreations.searchData("jyoti");
			
			
			//get data from database
	//		curd_opreations.get_data();
		
		
		
	
	}

}
