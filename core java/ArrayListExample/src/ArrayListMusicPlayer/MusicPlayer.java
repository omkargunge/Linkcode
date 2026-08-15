package ArrayListMusicPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------WELCOME---------------");
        System.out.println("Enter 5 song names:");

        // Take 5 song names from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Song " + (i + 1) + ": ");
            String song = scanner.nextLine();
            songs.add(song);
        }

        System.out.println("\nYour playlist: " + songs);

        // 1. Insert - add another song
        System.out.print("\nEnter a song to add: ");
        String newSong = scanner.nextLine();
        songs.add(newSong);
        System.out.println("After adding: " + songs);

        // 2. Update - replace a song
        System.out.print("\nEnter old song name to replace: ");
        String oldSong = scanner.nextLine();
        int index = songs.indexOf(oldSong);

        if (index != -1) {
            System.out.print("Enter new song name: ");
            String replacement = scanner.nextLine();
            songs.set(index, replacement);
            System.out.println("After updating: " + songs);
        } else {
            System.out.println("Song not found in playlist.");
        }

        // 3. Display
        System.out.println("\nSongs from playlist:");
        for (String s : songs) {
            System.out.println("- " + s);
        }

        // 4. Remove a song
        System.out.print("\nEnter a song name to remove: ");
        String toRemove = scanner.nextLine();
        if (songs.remove(toRemove)) {
            System.out.println("After removing: " + songs);
        } else {
            System.out.println("Song not found, nothing removed.");
        }

        // 5. Search a song (take input from user)
        System.out.print("\nEnter a song name to search: ");
        String searchSong = scanner.nextLine();

        if (songs.contains(searchSong)) {
            System.out.println("Song \"" + searchSong + "\" is present.");
        } else {
            System.out.println("Song \"" + searchSong + "\" not found.");
        }

        // 6. Sort songs
        Collections.sort(songs);
        System.out.println("\nAfter sorting: " + songs);

        // 7. Reverse songs
        Collections.reverse(songs);
        System.out.println("After reversing: " + songs);

        scanner.close();
    }
}