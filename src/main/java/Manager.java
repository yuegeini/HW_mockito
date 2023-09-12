import java.util.ArrayList;

public class Manager {
    private int limit;
    Repository repo;
    Manager(Repository repo) {
        this.repo = repo;
        limit = 5;
    }
//    Manager(Repository repo, int lim) {
//        this.repo = repo;
//        limit = lim;
//    }
    public void add(String name) {
        repo.save(name);
    }
    public void remove(String name) {
        repo.removeByName(name);
    }

    public String[] getAll() {
        return repo.getAll();
    }
    public String[] findLimit() {
        return repo.getLastLim(limit);
    }
}
