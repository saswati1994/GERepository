package com.ge.exercise1;

import java.util.Collection;
import java.util.List;

public class ApplicationEntity extends Application {

    public List<User> users;
    public List<Group> groups;


    public ApplicationEntity(String id, String name) {
        super(id, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Collection<User> getUsers() {

        return this.users;
    }

    @Override
    public User getUser(String userId) {
        // TODO Auto-generated method stub

      return this.users.stream().filter(user-> user.id == userId).findAny().orElse(null);
    }

    @Override
    public Collection<Group> getGroups() {
        // TODO Auto-generated method stub
        return this.groups;
    }

    @Override
    public Group getGroup(String groupId) {
        // TODO Auto-generated method stub
        return this.groups.stream().filter(group-> group.id == groupId).findAny().orElse(null);
    }

}