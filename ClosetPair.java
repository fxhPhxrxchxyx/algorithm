/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import javax.swing.JFrame;

/**
 *
 * @author Student
 */
public class ClosetPair {

    public static void main(String[] args) {
        int N = 10;
        int point[][] = new int[N][2];
        point[0][0] = 50;
        point[0][1] = 100; // (x,y) => (50,100)
        point[1][0] = 150;
        point[1][1] = 200;
        point[2][0] = 250;
        point[2][1] = 200;
        point[3][0] = 75;
        point[3][1] = 300;
        point[4][0] = 500;
        point[4][1] = 400;
        point[5][0] = 450;
        point[5][1] = 270;
        point[6][0] = 155;
        point[6][1] = 120;
        point[7][0] = 305;
        point[7][1] = 252;
        point[8][0] = 255;
        point[8][1] = 110;
        point[9][0] = 190;
        point[9][1] = 300;
        int closest1 = 0, closest2 = 0;
        double dmin = Integer.MAX_VALUE; // infinit
        for (int i = 0; i < point.length - 1; i++) {
            for (int j = i + 1; j < point.length; j++) {
                // c^2 = a^2 + b^2
                // c^2 = sqrt((x2-x1)^2 + (y2-y1)^2)
                // c = sqrt ((x2-x1)^2 +(y2-y1)^2)
                double distanceSquare = Math.pow((point[i][0] - point[j][0]), 2) // a^2
                        + Math.pow((point[i][1] - point[j][1]), 2); // b^2
                double distance = Math.sqrt(distanceSquare);
                if (distance < dmin) {
                    dmin = distance;
                    closest1 = i;
                    closest2 = j;
                }
            }
        }
        System.out.println("The  closest pair is betweeb ("
                + point[closest1][0] + " , " + point[closest1][1] + ") and ("
                + point[closest2][0] + " , " + point[closest2][1] + ").");
        // JFrame frame = new JFrame("Closest pair");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pointPanel panel = new pointPanel(point, point[closest1], point[closest2]);
        // frame.getContentPane().add(panel);
        // frame.pack();
        // frame.setVisible(true);
    }

}
