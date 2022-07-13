package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }

        }
        throw new UserNotFoundException("User not Found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("This user not validate");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Rustam Saydam", true)
        };
        try {
            User user = findUser(users, "Rustam Saydam");
            if (user != null && validate(user)) {
                System.out.println("This user has an access ");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

    }
}
