package com.example.android_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private static final int[] avatarIds = { R.drawable.avatar1, R.drawable.avatar2, R.drawable.avatar3};
    private static final String[] firstNames = { "John", "Jane", "Alex", "Maria", "Chris", "Anna", "Tom", "Eva", "Mike", "Sophia" };
    private static final String[] lastNames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez" };
    private static final String[] countries = { "USA", "Canada", "UK" };
    private static final String[][] cities = {
            { "New York", "Los Angeles", "Chicago", "Houston", "Phoenix" },
            { "Toronto", "Vancouver", "Montreal", "Calgary", "Ottawa" },
            { "London", "Manchester", "Birmingham", "Liverpool", "Leeds" }
    };

    public static List<UserModel> generateUsers(int count) {
        List<UserModel> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int avatarResId = avatarIds[random.nextInt(avatarIds.length)];
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = 14 + random.nextInt(66);
            String country = countries[random.nextInt(countries.length)];
            String city = cities[countries.length - 1][random.nextInt(5)];

            users.add(new UserModel(avatarResId, firstName, lastName, age, country, city));
        }

        return users;
    }
}
