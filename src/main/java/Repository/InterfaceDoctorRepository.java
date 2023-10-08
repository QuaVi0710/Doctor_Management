/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Doctor;
import java.util.ArrayList;

/**
 *
 * @author QuaVi
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public interface InterfaceDoctorRepository {
    
    void create(ArrayList<Doctor> doctorList);
    void update(ArrayList<Doctor> doctorList);
    void search(ArrayList<Doctor> doctorList);
    void delete(ArrayList<Doctor> doctorList);
    
    void display(ArrayList<Doctor> doctorList);
}
