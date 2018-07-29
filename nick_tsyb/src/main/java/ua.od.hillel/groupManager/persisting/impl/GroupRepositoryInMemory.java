package ua.od.hillel.groupManager.persisting.impl;

import ua.od.hillel.groupManager.model.Group;
import ua.od.hillel.groupManager.model.Student;
import ua.od.hillel.groupManager.persisting.GroupRepository;

import java.util.ArrayList;
import java.util.List;


public class GroupRepositoryInMemory implements GroupRepository {

    private List<Group> groups = new ArrayList<>();


    @Override
    public void assignStudentToGroup(Group group, Student student) {

    }

    @Override
    public int getAmountOfAvailableGroups() {
        int i = 0;
        for (Group group : groups) {
            if (group.isAvailable()) {
                i++;
            }
        }
        return i;
    }

    @Override
    public void add(Group group) {
        groups.add(group);

    }

    @Override
    public void delete(int id) {
        for (Group group : groups) {
            if (group.getId() == id) {
                groups.remove(group);
            }
        }
    }

    @Override
    public void update(Group group) {
        for (Group currentGroup : groups) {
            if (group.getId() == currentGroup.getId()) {
                currentGroup.setStudents(group.getStudents());
                currentGroup.setSubject(group.getSubject());
            }
        }

    }

    @Override
    public Group get(int id) {
        for (Group group : groups) {
            if (group.getId()==id){
                return group;
            }
        }
        return null;
    }
}
