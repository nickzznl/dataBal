<<<<<<< HEAD
package dataBal;

import javax.management.JMException;
import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {


    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;


    public MainFrame()
    {
        super("Welcome to dataBal!");


        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        formPanel = new FormPanel();

        setJMenuBar(createMenuBar());



        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        formPanel.setFormListener(new FormListener()
        {
            public void formEventOccurred(FormEvent e)
            {
                String name = e.getName();
                String occupation = e.getOccupation();
                int ageCat = e.getAgeCategory();
                String empCat = e.getEmploymentCategory();

                textPanel.appendText(name + ": " + occupation + ": " + ageCat + ": " + empCat + "\n");
            }
        });

        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JMenuBar createMenuBar()
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exportData = new JMenuItem("Export data ...");
        JMenuItem importData = new JMenuItem("Import data ...");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(exportData);
        fileMenu.add(importData);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");
        JMenuItem showFormItem = new JMenuItem("Person Form");
        showMenu.add(showFormItem);
        windowMenu.add(showMenu);

        menuBar.add(fileMenu);
        menuBar.add(windowMenu);

        return menuBar;
    }
}
=======
package dataBal;

import javax.management.JMException;
import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {


    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;


    public MainFrame()
    {
        super("Welcome to dataBal!");


        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        formPanel = new FormPanel();

        setJMenuBar(createMenuBar());



        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        formPanel.setFormListener(new FormListener()
        {
            public void formEventOccurred(FormEvent e)
            {
                String name = e.getName();
                String occupation = e.getOccupation();
                int ageCat = e.getAgeCategory();
                String empCat = e.getEmploymentCategory();

                textPanel.appendText(name + ": " + occupation + ": " + ageCat + ": " + empCat + "\n");
            }
        });

        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JMenuBar createMenuBar()
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exportData = new JMenuItem("Export data ...");
        JMenuItem importData = new JMenuItem("Import data ...");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(exportData);
        fileMenu.add(importData);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");
        JMenuItem showFormItem = new JMenuItem("Person Form");
        showMenu.add(showFormItem);
        windowMenu.add(showMenu);

        menuBar.add(fileMenu);
        menuBar.add(windowMenu);

        return menuBar;
    }
}
>>>>>>> first draft
