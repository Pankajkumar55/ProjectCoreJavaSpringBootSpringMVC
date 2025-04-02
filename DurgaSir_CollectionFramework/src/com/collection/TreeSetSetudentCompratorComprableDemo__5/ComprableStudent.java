package com.collection.TreeSetSetudentCompratorComprableDemo__5;

//In comparable we can write logic based on eId.

class ComprableStudent implements Comparable {
	int sId;
	String sName;

	public ComprableStudent(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "ComprableStudent [sId=" + sId + ", sName=" + sName + "]";
	}

	@Override
	public int compareTo(Object obj) {
		int sId = this.sId;
		ComprableStudent e = (ComprableStudent) obj;
		int sId2 = e.sId;
		if (sId < sId2)
			return -1;
		else if (sId > sId2)
			return +1;
		else
			return 0;

	}
}
