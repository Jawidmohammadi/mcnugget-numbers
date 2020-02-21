package edu.cnm.deepdive;

public class Frobenius {

  /* Pack sizes are 6, 9, 20*/
  public static boolean isMcNugget(int value){
    //TODO Return true if value can be expressed as the sum of integral multiples
    // (including multiplication by zero) of the 3 original McNugget pack size; return false otherwise.
//    int mcnug = value;
//    if (value - 6 == mcnug || value - 9 == mcnug || value - 20 == mcnug){
//      return true;
//    }

    if(value < 0 ) {

      return false;
    }
    if (value == 0){
      return true;
    }
    //TODO Recursion?
    return (
        (isMcNugget(value-6)
        || (isMcNugget(value-9)
        || (isMcNugget(value-20))))
        );
  }
}


/* same as above
*     return value >= 0
        && (
            value == 0
            || isMcNugget(value - 20)
            || isMcNugget(value - 9)
            || isMcNugget(value - 6)
        );
  }
* */