/*
 * Exercise 3, page 492.
 */
package javaprogramming.chapter09Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MAX_ENTRIES = 5;
        Recording[] recordings = new Recording[MAX_ENTRIES];
        String title, artist, answer;
        int time, ans;

        for(int i = 0; i < recordings.length; i ++) {
            recordings[i] = new Recording();
            
            System.out.print("Enter the title >>>> ");
            title = input.nextLine();
            recordings[i].setTitle(title);

            System.out.print("Enter the artist >>>> ");
            artist = input.nextLine();
            recordings[i].setArtist(artist);

            System.out.print("Enter the playing time >>>> ");
            time = input.nextInt();
            recordings[i].setPlayingTime(time);
            input.nextLine();
            System.out.println();
        }
        
        do {
            System.out.print("How would you like to sort the list?"
                + "\n1: by song title"
                + "\n2: by artit"
                + "\n3: by playing time"
                + "\n>>>> ");
            ans = input.nextInt();
            input.nextLine();
            switch(ans) {
                case 1:
                    for(int i = 0; i < recordings.length; ++i) {
                        for(int j = 0; j < recordings.length; ++j) {
                            if(recordings[j].getTitle().compareToIgnoreCase(recordings[i].getTitle()) > 0) {
                                Recording temp = recordings[j];
                                recordings[j] = recordings[i];
                                recordings[i] = temp;
                            }
                        }
                    }
                    for(Recording temp : recordings)
                        System.out.println(temp);
                    break;
                case 2:
                    for(int i = 0; i < recordings.length; ++i) {
                        for(int j = 0; j < recordings.length; ++j) {
                            if(recordings[j].getArtist().compareToIgnoreCase(recordings[i].getArtist()) > 0) {
                                Recording temp = recordings[j];
                                recordings[j] = recordings[i];
                                recordings[i] = temp;
                            }
                        }
                    }
                    for(Recording temp : recordings)
                        System.out.println(temp);
                    break;
                case 3:
                    for(int i = 0; i < recordings.length; ++i) {
                        for(int j = 0; j < recordings.length; ++j) {
                            if(recordings[j].getPlayingTime() > recordings[i].getPlayingTime()) {
                                Recording temp = recordings[j];
                                recordings[j] = recordings[i];
                                recordings[i] = temp;
                            }
                        }
                    }
                    for(Recording temp : recordings)
                        System.out.println(temp);
                    break;
            }
            System.out.print("Would you like to sort again? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y');
        System.out.println("Bye");
    }
}
