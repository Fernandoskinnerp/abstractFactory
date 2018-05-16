/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryimplementation;

/**
 *
 * @author yeison
 */
public class EnginolaToolkit extends AbstractFactory{

    @Override
    public CPU createCPU() {
    return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
    
}
