package com.example.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import com.intellij.ide.BrowserUtil;

public class DemoAction extends AnAction {

    // This method is called when the "KRATOS" button is clicked
    @Override
    public void actionPerformed(AnActionEvent event) {
        // Show a dialog box with two options for the user to choose from
        int choice = Messages.showDialog("Choose an option", "Demo Plugin", new String[]{"Google", "Youtube"}, -1, null);

        // If the user chooses the first option, open the Google website in the external browser
        if (choice == 0) {
            BrowserUtil.browse("https://www.google.com");
        }
        // If the user chooses the second option, open the Youtube website in the external browser
        else if (choice == 1) {
            BrowserUtil.browse("https://www.youtube.com");
        }
    }

}
