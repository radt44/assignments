//Name: Garrett Radtke
//Date: 10/28/2025

import java.io.*;

public class Exercise17_02 {
  public static void main(String[] args) throws IOException {
    //populate Exercise17_02.dat with random integers 
    int sum = 0;
    try (
      DataOutputStream output =
        new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true));
    ) {
      for (int i = 0; i < Math.random() * 100; i++)
        output.writeInt((int)(Math.random() * 100000));
    
    } 

    //sum the integers from the file
    try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02.dat"))) {
        try {
            while (input.available() >= 0)
                sum += input.readInt();
        } catch (EOFException e) {
        }
    }

    System.out.println("The sum is " + sum);
  }
}
