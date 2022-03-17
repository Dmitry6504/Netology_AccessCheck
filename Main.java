package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
    }

    public static User[] getUsers () {
            User user1 = new User("John", "abv", "1s4", "john@ya.ru", 14);
            User user2 = new User("Bob", "pass", "bob", "bob@ya.ru", 24);
            User user3 = new User("Ilon", "ilonmask", "pass123", "chief@tesla.com", 48);
            return new User[]{user1, user2, user3};
    }


    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password))
            return user;
        }
        throw new UserNotFoundException("User not found");
    }
    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Вам меньше 18 лет, доступ запрещен");
        }
        System.out.println("Доступ разрешен");
    }
}

