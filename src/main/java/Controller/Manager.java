/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Validate;
import Model.Doctor;
import Repository.DoctorRepository;
import Repository.InterfaceDoctorRepository;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author QuaVi
 */
public class Manager extends Menu<String> {

    static String[] mc = {"Add doctor", "Update doctor", "Search doctor", "Delete doctor", "Display List", "exit"};
    protected ArrayList<Doctor> doctorList;
    protected InterfaceDoctorRepository repo;
    protected Validate valid;

    public Manager() {
        super("\n\tDOCTOR MANAGE", mc);
        doctorList = new ArrayList<>();
        repo = new DoctorRepository();
        valid = new Validate();

        doctorList.add(new Doctor("D1", "John", "General Practitioner", 5));
        doctorList.add(new Doctor("D2", "Emma", "Pediatrician", 3));
        doctorList.add(new Doctor("D3", "Alex", "Dermatologist", 6));
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 ->
                repo.create(doctorList);
            case 2 ->
                repo.update(doctorList);
            case 3 ->
                repo.search(doctorList);
            case 4 ->
                repo.delete(doctorList);
            case 5 ->
                repo.display(doctorList);
            case 6 ->
                System.exit(0);

        }
    }
}
