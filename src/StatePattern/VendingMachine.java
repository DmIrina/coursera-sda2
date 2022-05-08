package StatePattern;

public class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;
    private int count;

    public VendingMachine(int count) {

// make the needed states

        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public void insertDollar() {
        currentState.insertDollar( this );
    }
    public void ejectMoney() {
        currentState.ejectMoney( this );
    }
    public void dispense() {
        currentState.dispense( this );
    }

    public void setState(State state){
        this.currentState = state;
    }

    public State getHasOneDollarState() {
        return new HasOneDollarState();
    }

    public State getOutOfStockState() {
        return new OutOfStockState();
    }

    public State getIdleState() {
        return new IdleState();
    }

    public void doReturnMoney() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void doReleaseProduct() {
    }


}