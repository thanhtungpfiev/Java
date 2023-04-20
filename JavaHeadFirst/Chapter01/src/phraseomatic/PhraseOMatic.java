/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phraseomatic;

/**
 * @author thanhtung
 * @date Oct 6, 2016
 */
public class PhraseOMatic {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                // TODO code application logic here
                // make three sets of words to choose from. Add your own!
                String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B",
                                "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
                                "critical-path", "dynamic" };
                String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric",
                                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
                                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated" };
                String[] wordListThree = { "process", "tipping-point", "solution", "architecture", "core competency",
                                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };

                // find out how many words are in each list
                int oneLength = wordListOne.length;
                int twoLength = wordListTwo.length;
                int threeLength = wordListThree.length;

                // generate three random numbers
                int rand1 = (int) (Math.random() * oneLength);
                int rand2 = (int) (Math.random() * twoLength);
                int rand3 = (int) (Math.random() * threeLength);

                // now build a phrase
                String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

                // print out the phrase
                System.out.println("What we need is a " + phrase);
        }
}
