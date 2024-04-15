package md.tekwillacademy.gitworkflow;

public class GitStepByStepGuide {
    public static void main(String[] args) {
        String step1 = "Execute - git stash command in order to save the change";
        String step2 = "Go to the main branch - git checkout master";
        String step3 = "Get the latest changes - sync with Origin/master - git fetch";
        String step4 = "Download the diffs - git pull";
        String step5 = "Create a new dedicate branch for the task - git checkout -b Branch_name";
        String step6 = "Add code changes for implementing the required task";
        String step7 = "Save the changes on local memory - git commit";
        String step8 = "Upload the changes on the cloud - git push";
        String step9 = "Go to the GitHub repositary";
        String step10 = "Create a new Pull Request into the origin/master branch";
        String step11 = "Invite the collaborators to review the code";
        String step12 = "Merge the code";
        String step12_1 = "If change are required, then I have to modify my local branch, and perform - git commit amend";
        String step12_2 = "After git commit amend, we have to do a git push -f";
        String step13 = "Delete the creates secondary branch as it is already merged";
        String step14 = "Go to intellij Idea, and checkout the master branch - git checkout master";
        String step15 = "Download the latest version of the origin/master - git fetch + get full";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step12_1);
        System.out.println(step12_2);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);


    }
}
