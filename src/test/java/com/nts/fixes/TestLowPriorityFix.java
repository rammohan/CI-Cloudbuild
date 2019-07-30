package com.nts.fixes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestLowPriorityFix {

	@Test
	public void testLowPriorityFixwithNoResolution() {
		final String issue = "unresolved issue";
		final LowPriorityFix lowPriorityFix = new LowPriorityFix(issue);
		
		assertThat(LowPriorityFix.PRIORITY, is(lowPriorityFix.getPriority()));
		assertThat(issue, is(lowPriorityFix.getIssue()));
		assertThat(null, is(lowPriorityFix.getFix()));
	}
	
	
	@Test
	public void testLowPriorityFixwithResolution() {
		final String issue = "issue";
		final String resolution = "fix for the issue";
		
		final LowPriorityFix lowPriorityFix = new LowPriorityFix(issue, resolution);
		
		assertThat(LowPriorityFix.PRIORITY, is(lowPriorityFix.getPriority()));
		assertThat(issue, is(lowPriorityFix.getIssue()));
		assertThat(resolution, is(lowPriorityFix.getFix()));
	}

}
