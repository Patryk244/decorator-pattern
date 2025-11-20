package decorator.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeworkQueueTestSuite {
    @Test
    public void testHomeworkQueue() {
        HomeworkQueue kolejka1 = new HomeworkQueue("Kolejka 1");
        HomeworkQueue kolejka2 = new HomeworkQueue("Kolejka 2");


        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");


        kolejka1.registerObserver(mentor1);
        kolejka2.registerObserver(mentor1);


        kolejka2.registerObserver(mentor2);


        kolejka1.addHomework("Zadanie 1");
        kolejka1.addHomework("Zadanie 2");
        kolejka2.addHomework("Zadanie 3");
        kolejka2.addHomework("Zadanie 4");
        kolejka2.addHomework("Zadanie 5");


        assertEquals(5, mentor1.getUpdateCount());


        assertEquals(3, mentor2.getUpdateCount());
    }

}