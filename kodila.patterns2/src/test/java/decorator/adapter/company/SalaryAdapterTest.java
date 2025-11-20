package decorator.adapter.company;

import decorator.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAdapterTest {

    @Test
    void testTotalSalary() {
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());

        System.out.println("Total Salary: " + totalSalary);
        assertEquals(27750, totalSalary, 0);
    }

}