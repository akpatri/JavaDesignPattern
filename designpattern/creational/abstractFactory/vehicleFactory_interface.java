/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpattern.creational.abstractFactory;

/**
 *
 * @author Asish kumar patri
 */
public interface vehicleFactory_interface {
    public twoWheeler_interface getTwoWheeler(String name);
    public threeWheeler_interface getThreeWheeler(String name);
    
}
