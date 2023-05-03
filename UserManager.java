public class UserManager {
    public void addUser(User user) {
        System.out.println(user.getName() + " " + user.getMidname() + " named user added.");
    }

    public void delete(User user) {
        System.out.println(user.getName() + " " + user.getMidname() + " named user deleted.");
    }

    public void changeName(User user, String firstName) {
        user.setName(firstName);
    }

    public void changemidName(User user, String midName) {
        user.setMidname(midName);
    }

    public void changesurName(User user, String surName) {
        user.setMidname(surName);
    }
}
