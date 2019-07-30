package com.nts.fixes;

public class HighPriorityFix extends Fix {
	
	public static final String PRIORITY = "HIGH";
	
	public HighPriorityFix(final String issue) {
		this(issue, null);
	}
	
	public HighPriorityFix(final String issue, final String fix) {
		super(PRIORITY, issue, fix);
	}
	
	
}
