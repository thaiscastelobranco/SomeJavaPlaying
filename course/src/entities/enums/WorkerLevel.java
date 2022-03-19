package entities.enums;

public enum WorkerLevel {
	JUNIOR(1, "Junior"),
	MD_LEVEL(2, "Mid"),
	SENIOR(3, "Senior");
	
	private int id;
	private String description;
	
	WorkerLevel(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public String description() {
		return description;
	}
	
}
