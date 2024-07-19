package historyModel;

public class HistoricalEvent {
	
	private String year;
    private String description;

    public HistoricalEvent(String year, String description) {
        this.year = year;
        this.description = description;
    }

    public void setYear(String year) {
		this.year = year;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return year + ": " + description;
    }
}


