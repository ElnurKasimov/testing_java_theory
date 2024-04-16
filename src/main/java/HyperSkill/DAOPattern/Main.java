package HyperSkill.DAOPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDao userDao = new UserDaoImpl();

        User user1 = new User(scanner.nextInt(), scanner.next());
        User user2 = new User(scanner.nextInt(), scanner.next());
        int inexistentId = scanner.nextInt();

        userDao.add(user1);
        userDao.add(user2);

        // get first
        System.out.println("Found " + userDao.get(user1.getId()));

        // get inexistent user
        if (userDao.get(inexistentId) == null) {
            System.out.println("Not found id " + inexistentId);
        }

        // update and get

        User updateUser = userDao.get(user2.getId());
        System.out.println("Found " + updateUser);
        updateUser.setName("UPDATED");
        userDao.update(updateUser);
        System.out.println("Updated " + userDao.get(user2.getId()));

        // delete
        userDao.delete(user2.getId());
        if (userDao.get(user2.getId()) == null) {
            System.out.println("Deleted id: " + user2.getId());
        }
    }

}
