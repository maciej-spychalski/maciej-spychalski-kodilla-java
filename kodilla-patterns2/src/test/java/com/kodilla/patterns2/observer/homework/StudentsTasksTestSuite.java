package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import java.util.SplittableRandom;

import static org.junit.Assert.assertEquals;

public class StudentsTasksTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student jasFasola = new Student("Jas Fasola");
        jasFasola.setStudentTasks(new StudentTasks(jasFasola));
        Student bennyHill = new Student("Benny Hill");
        bennyHill.setStudentTasks(new StudentTasks(bennyHill));
        Student ludovicCruchot = new Student("Ludovic Cruchot");
        ludovicCruchot.setStudentTasks(new StudentTasks(ludovicCruchot));
        Student ryszardOchodzki = new Student("Ryszard Ochodzki");
        ryszardOchodzki.setStudentTasks(new StudentTasks(ryszardOchodzki));
        Student kazimierzPawlak = new Student("Kazimierz Pawlak");
        kazimierzPawlak.setStudentTasks(new StudentTasks(kazimierzPawlak));
        Student franekDolas = new Student("Franek Dolas");
        franekDolas.setStudentTasks(new StudentTasks(franekDolas));
        Mentor zdzisławMaklakiewicz = new Mentor("Zdzisław Maklakiewicz");
        Mentor stanislawBareja = new Mentor("Stanislaw Bareja");
        jasFasola.getStudentTasks().registerObserver(zdzisławMaklakiewicz);
        bennyHill.getStudentTasks().registerObserver(zdzisławMaklakiewicz);
        ludovicCruchot.getStudentTasks().registerObserver(zdzisławMaklakiewicz);
        ryszardOchodzki.getStudentTasks().registerObserver(stanislawBareja);
        kazimierzPawlak.getStudentTasks().registerObserver(stanislawBareja);
        franekDolas.getStudentTasks().registerObserver(stanislawBareja);
        //When
        jasFasola.getStudentTasks().addTask("Save the World");
        bennyHill.getStudentTasks().addTask("Run away");
        ludovicCruchot.getStudentTasks().addTask("Catch a nudist");
        ryszardOchodzki.getStudentTasks().addTask("Fly to London");
        ryszardOchodzki.getStudentTasks().addTask("Find a double");
        kazimierzPawlak.getStudentTasks().addTask("Get justice. Use a grenade");
        franekDolas.getStudentTasks().addTask("Start a war");
        //Then
        assertEquals(3, zdzisławMaklakiewicz.getTasksChecked());
        assertEquals(4,stanislawBareja.getTasksChecked());
    }
}
