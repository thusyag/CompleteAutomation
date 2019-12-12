package com.sgic.automation.orangehrm.utils.JiraIssueCreate;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestJiraListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult result) {

        JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
        boolean isTicketReady = jiraPolicy.logTicketReady();
        if (isTicketReady) {
            // raise jira ticket:
            System.out.println("is ticket ready for JIRA: " + isTicketReady);
            JiraIssueCreate jiraSp = new JiraIssueCreate("https://thevakajan.atlassian.net/",
                    "gthusi5@gmail.com", "CpzsxgBslwyVZJ2DDXzlD929", "TEST");
            String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
                    + "got failed due to some assertion or exception";
            String issueDescription = result.getThrowable().getMessage() + "\n";
            issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

            jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Theva Kajan");
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }
}
