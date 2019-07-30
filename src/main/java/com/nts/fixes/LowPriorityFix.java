package com.nts.fixes;

public class LowPriorityFix extends Fix {

	public static final String PRIORITY = "LOW";
	
	
	public LowPriorityFix(final String issue) {
		this(issue, null);
	}
	
	public LowPriorityFix(final String issue, final String fix) {
		super(PRIORITY, issue, fix);
	}
}
