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
enum Architecture {
    ENGINOLA, EMBER
}
public class AbstractFactoryImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        CPU cpu = factory.createCPU();
        cpu.printType();
        MMU mmu = factory.createMMU();
        mmu.printType();
    }
    
}
