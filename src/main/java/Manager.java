
public class Manager {
    private int limit;
    private String[] filmList = new String[0];

    Manager() {
        limit = 5;
    }

    //    Manager(Repository repo, int lim) {
//        this.repo = repo;
//        limit = lim;
//    }
    public void add(String name) {

        String[] tmp = new String[filmList.length + 1];
        for (int i = 0; i < filmList.length; i++) {
            tmp[i] = filmList[i];
        }
        tmp[filmList.length] = name;
        filmList = tmp;
    }

    public void remove(String name) {

        String[] tmp = new String[filmList.length - 1];
        int i = 0;
        for (String el : filmList) {
            if (el != name) {
                tmp[i] = el;
                i++;
            }
        }
        filmList = tmp;
    }

    public String[] getAll() {
        return filmList;
    }

    public String[] findLimit() {
        String[] tmp = new String[limit];
        int counter = 0;
        for (int i = filmList.length - 1; i > filmList.length - 6; i--) {
            tmp[counter] = filmList[i];
            counter++;
        }
        return tmp;
    }
}
