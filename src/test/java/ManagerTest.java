import org.junit.jupiter.api.*;

class ManagerTest {
    Manager man = new Manager();

    @BeforeEach
    public void init() {
        man.add("1");
        man.add("2");
        man.add("3");
        man.add("4");
        man.add("5");
        man.add("6");
        man.add("7");
    }

    @Test
    void addTest() {
        String[] expected = {"1", "2", "3", "4", "5", "6", "7", "8"};
//        man.add("1");
//        man.add("2");
//        man.add("3");
//        man.add("4");
//        man.add("5");
//        man.add("6");
//        man.add("7");
        man.add("8");
        String[] actual = man.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void removeTest() {
        String[] expected = {"1", "2", "3", "4", "5", "6", "7"};
//        man.add("1");
//        man.add("2");
//        man.add("3");
//        man.add("4");
//        man.add("5");
//        man.add("6");
//        man.add("7");
        man.add("8");
        man.remove("8");
        String[] actual = man.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getAllTest() {
        String[] expected = {"1", "2", "3", "4", "5", "6", "7"};
        String[] actual = man.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLimitTest() {
//        Manager limMan = new Manager(repo, 2);
        String[] expected = {"7", "6", "5", "4", "3"};
        String[] actual = man.findLimit();
        Assertions.assertArrayEquals(expected, actual);

    }
}