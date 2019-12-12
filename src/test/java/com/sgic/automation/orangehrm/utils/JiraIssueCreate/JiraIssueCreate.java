package com.sgic.automation.orangehrm.utils.JiraIssueCreate;

import net.rcarz.jiraclient.*;


public class JiraIssueCreate {
    //jira service provider

    public JiraClient jira;


    public String project;

    public JiraIssueCreate(String jiraUrl, String username, String password, String project) {
        BasicCredentials creds = new BasicCredentials(username, password);
        jira = new JiraClient(jiraUrl, creds);
        this.project = project;
    }

    public void createJiraTicket(String issueType, String summary, String description, String reporterName) {

        try {
            net.rcarz.jiraclient.Issue.FluentCreate fleuntCreate = jira.createIssue(project, issueType);
            fleuntCreate.field(Field.SUMMARY, summary);
            fleuntCreate.field(Field.DESCRIPTION, description);
            Issue newIssue = fleuntCreate.execute();
            System.out.println("new issue created in jira with ID: " + newIssue);

        } catch (JiraException e) {
            e.printStackTrace();
        }

    }

}
