package ru.mirea.webPetShop.myPets.ServiceElements.store;

import ru.mirea.webPetShop.myPets.ServiceElements.Doer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DoersStore extends IStorageDB<Doer, Integer> {
    protected <KeyGetter extends IKeyGetter<Integer>, KeySetter extends IKeySetter<Integer>> DoersStore(KeyGetter keyGetter, KeySetter keySetter, Connection connection) {
        super(keyGetter, keySetter, connection);
    }

    @Override
    public Collection<Doer> values() {
        final List<Doer> users = new ArrayList<>();
        try (final Statement statement = this.connection.createStatement();
             final ResultSet rs = statement.executeQuery("select * from client")) {
            while (rs.next()) {
                users.add(new Doer(IKeyGetter(rs, 1? Почему 1 а не сразу куча?)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public Integer add(Doer user) {
        return null;
    }

    @Override
    public Doer get(Integer id) {
        return null;
    }

    @Override
    public void edit(Integer id, Doer newElement) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Integer generateId() {
        return null;
    }
}
