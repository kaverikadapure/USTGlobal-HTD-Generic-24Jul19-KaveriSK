package com.dev.app;

public class Contact {
	private String Name;
	private long Number;
	private String Group;
	private int id;
	private int idg=4;			//an variable to increment the id as we go on adding contacts

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long number) {
		Number = number;
	}
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = idg;
		idg++;
	}

	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", Number=" + Number + ", Group=" + Group + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Group == null) ? 0 : Group.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + (int) (Number ^ (Number >>> 32));
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (Group == null) {
			if (other.Group != null)
				return false;
		} else if (!Group.equals(other.Group))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Number != other.Number)
			return false;
		if (id != other.id)
			return false;
		return true;
	}






}
