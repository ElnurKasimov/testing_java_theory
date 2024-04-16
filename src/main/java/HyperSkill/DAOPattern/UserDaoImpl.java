package HyperSkill.DAOPattern;

import java.util.ArrayList;
import java.util.List;

class UserDaoImpl implements UserDao {
    private final List<User> users;

    public UserDaoImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User get(int id) {
        for(int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(User user) {
        int indexForUpdate = users.indexOf(user);
        if (indexForUpdate == -1) {
            users.add(user);
        } else {
            users.set(indexForUpdate, user);
        }
    }

    @Override
    public void delete(int id) {
        User forDelete = this.get(id);
        int indexForDelete = users.indexOf(forDelete);
        if (indexForDelete != -1) {
            users.remove(indexForDelete);
        }
    }
}
