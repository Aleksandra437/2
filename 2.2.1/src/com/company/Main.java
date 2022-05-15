package com.company;

import java.io.PrintStream;
import java.util.Locale;

public class Main {

    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean process;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static CmdParams parseArgs(String[] args) {
        CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }
            if (!args[0].equals("-r") && !args[0].equals("-c")) {
                params.error = true;
                params.help = true;
                return params;
            }
            if (args[0].equals("-r")) {
                params.process = true;
            }
            if (args.length < 2) {
                params.help = true;
                params.error = true;
                return params;
            }

            params.inputFile = args[1];
            if (args.length > 2) {
                params.outputFile = args[2];
            }
        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void main(String[] args) {
        //SwingUtils.setLookAndFeelByName("Windows");
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        ru.vsu.cs.util.SwingUtils.setDefaultFont("Microsoft Sans Serif", 12);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }
}
