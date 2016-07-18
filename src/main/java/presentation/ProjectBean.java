package presentation;

import java.io.Serializable;

public class ProjectBean implements Serializable{

	private String name;
	private String info;
	
	
	
	public ProjectBean() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ProjectBean(String name, String info) {
		super();
		this.name = name;
		this.info = info;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	@Override
	public String toString() {
		return "ProjectBean [name=" + name + ", info=" + info + "]";
	}
	
	
	
	
	

}
