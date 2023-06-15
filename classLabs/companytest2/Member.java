package project;

public class Member {

	    private int memberID;
	    private String memberName;
	    private int phonenum;
	    private String email;
	    private static int count = 1;
	    public Member() {
	       memberID = count;
	        count++;
	    }


	    public Member(String memName , int phonenum , String email ) 
	    {
	        this.memberID = count;
	        this.memberName = memName;
	        this.phonenum = phonenum;
	        this.email = email;
	        count++;
	    }


	    public void setMemberName(String memName) {
	    	this.memberName = memName;
		}
	    
	    public String getMemberName() {
	        return memberName;
	    }
	    
	    public void setMemberID() {
	    	 this.memberID = count;
	    }

	    public int getMemberID() {
	        return memberID;
	    }


		public int getCount() {
			return count++;
		}

		public int getPhonenum() {
			return phonenum;
		}
		
		public void setPhonenum(int phonenum ) {
			this.phonenum = phonenum;
			
		}
		

		public String getEmail() {
			 return email;
		
		}
		
		public void setEmail(String email) {
			 this.email = email;
		
		}


		 @Override
		    public String toString() {
		        return "Member ID: " + memberID + "\nMember Name: " + memberName + "\nMember Email: " + email + "\n"  ;
		    } 
		
	}



