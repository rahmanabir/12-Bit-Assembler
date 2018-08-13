

package assembler; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class CentralProcess{

  public static void main(String[] args) {

      System.out.println("Hello World");
      
      InstructionFetch instruction = new InstructionFetch("input.txt");
      
  }
}

  /*
  	String[] rTypeInsCheck = {"add", "sub", "load", "store", "brn", "eq", "slt", "and", "or", "nor"};
  String[] iTypeInsCheck = {"addi", "sll", "srl"};
  String[] jTypeIns = {"in", "out", "j"};
*/
  