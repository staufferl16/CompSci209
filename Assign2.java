/**
 * Original program contains errors.
 * Add your name to this comment.
 *
 * Document the problems you found in comments, i.e., describe what
 * caused the problem in comments.  Comment out the original and write
 * the corrected code.
 *
 * @author: Leigh Stauffer
 */
public class Assign2 {

    // instance variable
    public int oneVar;

    // constructor
    //public Assign( param ) {
    public Assign2( int param) {  //Renamed Assign2 (syntax error) and declared param type.
        //oneVar = param;
        //return this;
	this.oneVar = param;  //Wrong syntax for initializing an object of this class.
    }

    // an accessor method
    //public getOneVar() {
    public int getOneVar() {  //Declare return type for accessor.
        return oneVar;
    }

    // a mutator method
    //public int increment() {
    public void increment() {  //Declare as void since nothing is returned (just mutating object).
        oneVar++;
    }
    
    public static void main(String[] args) {
        //Assign2 assign2Var = Assign2(8);
	Assign2 assign2Var = new Assign2(8);  //Declare new object.

        //System.out.println("assign2Var's oneVar is " + assign2Var.getOneVar);
	System.out.println("assign2Var's oneVar is " + assign2Var.getOneVar());  //Incorrectly called accessor
        assign2Var.increment();
	
        int actualValue = assign2Var.getOneVar();
        int expectedValue = 9;
        System.out.println("assign2Var's incremented oneVar is " + actualValue);
        if( actualValue != expectedValue ) {
            System.out.println("Error incrementing oneVar!");   
        }
    }

}

