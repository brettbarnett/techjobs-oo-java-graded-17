package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    private static String newLine = System.lineSeparator();

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId()); //No two jobs should have the same ID
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        assertTrue(testJob.getName() instanceof String);
        assertEquals(testJob.getName(), "Product tester");
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        int job1Id = job1.getId();
        int job2Id = job2.getId();

        assertFalse(job1Id == job2Id);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());

        assertTrue(testJob.toString().startsWith(newLine));
        assertTrue(testJob.toString().endsWith(newLine));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        int jobId = testJob.getId();

        String expectedString = newLine + "ID: " + jobId + newLine + "Name: Product tester" + newLine +
                "Employer: ACME" + newLine + "Location: Desert" + newLine +
                "Position Type: Quality control" + newLine + "Core Competency: Persistence"
                + newLine;

        assertEquals(expectedString, testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        int jobId = testJob.getId();
        String expectedString = newLine + "ID: " + jobId + newLine + "Name: Data not available" + newLine +
                "Employer: Data not available" + newLine + "Location: Data not available" + newLine +
                "Position Type: Data not available" + newLine + "Core Competency: Data not available"
                + newLine;

        assertEquals(expectedString, testJob.toString());
    }
}
