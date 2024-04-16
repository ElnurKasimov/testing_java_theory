package HyperSkill.DAOPattern;

public interface UserDao {

    void add(User user);

    User get(int id);

    void update(User user);

    void delete(int id);
}
