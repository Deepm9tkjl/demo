package entities;

public class COurse {
	private long id;
	private String title;
	private String descr;

	@Override
	public String toString() {
		return "COurse [id=" + id + ", title=" + title + ", descr=" + descr + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public void setId(long id) {
		this.id = id;
	}

	public COurse(int i, String string, String string2) {
		super();
		// TODO Auto-generated constructor stub
	}

	public COurse(long id, String title, String descr) {
		super();
		this.id = id;
		this.title = title;
		this.descr = descr;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
