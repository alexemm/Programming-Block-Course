
public class Note {
	
	private String note;
	private String[] gueltigeNote={"1,0","1,3","1,7","2,0","2,3","2,7","3,0","3,3","3,7","4,0","5,0"};
	
	public Note(String n) {
		if (istGueltig(n)) {
			setNote(n);
		} else {
			System.out.println(n+" ist keine gueltige Note.");
		}
	}
	
	public Note(Note n) {
		this.setNote(n.getNote());
	}
	
	public boolean istGueltig(String s) {
		for (int i=0;i<gueltigeNote.length;i++) {
			if (s.equals(gueltigeNote[i])) return true;
		}
		return false;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String n) {
		if(!(istGueltig(n))) return;
		this.note = n;
	}
	
	public String toStrings() {
		return ("Deine Note ist "+getNote()+".");
	}
	
	public boolean hatBestanden() {
		return (Double.parseDouble(this.note)<=4.);
	}
	
}
