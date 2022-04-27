package assignment11;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine newCoffeeMachine){
       oldVendingMachine = newCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldVendingMachine.selectB();
    }
}
