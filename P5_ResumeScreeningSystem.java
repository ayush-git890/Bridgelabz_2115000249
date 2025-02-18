import java.util.*;
abstract class JobRole{
	private String candidateName;
	JobRole(String candidateName){
		this.candidateName = candidateName;
	}
	
	public String getCandidateName(){
		return candidateName;
	}
}
class SoftwareEngineer extends JobRole{
	SoftwareEngineer(String candidateName){
		super(candidateName);
	}
}
class DataScientist extends JobRole{
	DataScientist(String candidateName){
		super(candidateName);
	}
}
class ProductManager extends JobRole{
	ProductManager(String candidateName){
		super(candidateName);
	}
}
class Resume<T extends JobRole>{
	private List<T> resumeList = new ArrayList<>();
	void add(T resume){
		resumeList.add(resume);
	}
	List<T> getResumeList(){
		return resumeList;
	}
	public static void displayResume(List<? extends JobRole> resumelist){
		for(JobRole jr : resumelist)
			System.out.println("Candidate Name: "+jr.getCandidateName());
	}
}
public class P5_ResumeScreeningSystem{
	public static void main(String[]args){
		Resume<SoftwareEngineer> s = new Resume<>();
        s.add(new SoftwareEngineer("Ayush"));
        s.add(new SoftwareEngineer("Rajat"));

        Resume<DataScientist> d = new Resume<>();
        d.add(new DataScientist("Bharat"));
        d.add(new DataScientist("Mohoit"));

        Resume<ProductManager> p = new Resume<>();
        p.add(new ProductManager("sohan"));
        p.add(new ProductManager("rohan"));

        System.out.println("Software Engineer---> ");
        Resume.displayResume(s.getResumeList());

        System.out.println("Data Scientist----> ");
        Resume.displayResume(d.getResumeList());

        System.out.println("Product Manager-----> ");
        Resume.displayResume(p.getResumeList());
	}
}