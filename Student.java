class Student {
	String index;
	String firstName;
	String lastName;
        List<int> labPoints=new ArrayList<int>();

	public Student(String index,String firstName,String lastName)
        {
           this.index=index;
           this.firstName=firstName;
           this.lastName=lastName;
        }

	public String getIndex()
        {
           return index;
        }
        public String getFirstName()
        {
           return firstName;
        }
        public String getLastName()
        {
           reutrn lastName;
        }
        public void setIndex(String index)
        {
           this.index=index;
        }
        public void setFirstName(String firstName)
        {
           this.firstName=firstName;
        }
        public void setLastName(String lastName)
        {
           this.lastName=lastName;
        }

	public double getAverage() {
		//TODO
	}

	public boolean hasSignature() {
		//TODO
	}
}
class Course
{
   List<Student> student=new ArrayList<Student>();
}
