package com.nts.fixes;

public class Fix {
	
	private final String priority;
	private final String issue;
	private final String fix;
	
	
	public Fix(final String priority, final String issue) {
		this(priority, issue, null);
	}
	
	public Fix(final String priority, final String issue, final String fix) {
		this.priority = priority;
		this.issue = issue;
		this.fix = fix;
	}

	public String getIssue() {
		return issue;
	}

	public String getFix() {
		return fix;
	}

	public String getPriority() {
		return priority;
	}
	
}
