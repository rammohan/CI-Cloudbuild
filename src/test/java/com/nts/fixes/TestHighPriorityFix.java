package com.nts.fixes;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.is;

public class TestHighPriorityFix {

	@Test
	public void testHighPriorityFixwithNoResolution() {
		final String issue = "unresolved issue";
		final HighPriorityFix highPriorityFix = new HighPriorityFix(issue);
		
		assertThat(HighPriorityFix.PRIORITY, is(highPriorityFix.getPriority()));
		assertThat(issue, is(highPriorityFix.getIssue()));
		assertThat(null, is(highPriorityFix.getFix()));
	}
	
	
	@Test
	public void testHighPriorityFixwithResolution() {
		final String issue = "issue";
		final String resolution = "fix for the issue";
		
		final HighPriorityFix highPriorityFix = new HighPriorityFix(issue, resolution);
		
		assertThat(HighPriorityFix.PRIORITY, is(highPriorityFix.getPriority()));
		assertThat(issue, is(highPriorityFix.getIssue()));
		assertThat(resolution, is(highPriorityFix.getFix()));
	}
	
}
